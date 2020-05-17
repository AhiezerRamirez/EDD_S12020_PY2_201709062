/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

//import java.util.Date;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedList;
import java.util.List;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;

public class Boque {
    public int index,nonce;
    LocalDateTime fecha;
    public String prevHash,hash;
    List<Data> data;
    private LocalDateTime tiempoAhora;
    public Boque(int ind, List<Data> dat, String prevHas){
        this.index=ind;
        this.nonce=0;
        this.fecha=tiempoAhora.now();
        this.data=new LinkedList(dat);
        this.prevHash=prevHas;
        this.hash=getHash256();
    }
    public Boque(int ind, LocalDateTime time,int non, List<Data> da,String preH,String ha){
        this.index=ind;
        this.fecha=time;
        this.nonce=non;
        this.data=da;
        this.prevHash=preH;
        this.hash=ha;
    }
    private String getHash256(){
        String resultado="";
        try {
            MessageDigest message=MessageDigest.getInstance("SHA-256");
            byte[] hasha=message.digest(juntarParaHash().getBytes());
            resultado=DatatypeConverter.printHexBinary(hasha);
            return resultado;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Boque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    private String getHash256(String nuevodato){
        String resultado="";
        try {
            MessageDigest message=MessageDigest.getInstance("SHA-256");
            byte[] hasha=message.digest(nuevodato.getBytes());
            resultado=DatatypeConverter.printHexBinary(hasha);
            return resultado;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Boque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public String juntarParaHash(){
        StringBuilder s=new StringBuilder();
        s.append(index).append(fecha.toString());
        s.append(prevHash).append(dataToString()).append(nonce);
        return s.toString();
    }
    private String dataToString(){
        String cadena="";
        cadena = data.stream().map((data1) -> data1.strintParaHash()).reduce(cadena, String::concat);
        return cadena;
    }
    public void minar(String datodeBloque){
        int nuevononce=0;
        String pruebahash;
        while (true) {            
            pruebahash=getHash256(datodeBloque+Integer.toString(nuevononce));
            if(pruebahash.substring(0, 4).equals("0000"))
                break;
            nuevononce++;
        }
        this.nonce=nuevononce;
        this.hash= pruebahash;
    }
    public String mostrarString(){
        StringBuilder s =new StringBuilder();
        s.append("{\n\t\"INDEX\": ").append(index).append(",\n\t");
        s.append("\"TIMESTAMP\":  \"").append(fecha.toString()).append("\",\n\t");
        s.append("\"NONCE\": ").append(nonce).append(",\n\t");
        s.append("\"DATA\": [");
        data.forEach((data1) -> {
            s.append(data1.graficar()).append(",\n");
        });
        s.deleteCharAt(s.length()-2);
        s.append("\t],\n\t");
        s.append("\"PREVIOSHASH\" :\"").append(prevHash).append("\",\n\t");
        s.append("\"HASH\": \"").append(hash).append("\"\n}");
        try {
            PrintWriter archivoJson=new PrintWriter("./BloquesJson/Bloque"+Integer.toString(index)+".json", "UTF-8");
            archivoJson.write(s.toString());
            archivoJson.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar el Archivo Json");
            //Logger.getLogger(Boque.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Boque.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_1s20_py2_201709062;
import Estructuras.*;
import static java.lang.Math.toIntExact;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Core {
    TablaHash tabla;
    ArbolAVL arbolAVL;
    public Core(){
        this.tabla=new TablaHash(5);
        this.arbolAVL=new ArbolAVL();
    }
    public void insertarUsuario(Long car,String Nombre, String Apellido,String Carrera, String Password){
        int carnet = toIntExact(car);
        tabla.add(carnet, Nombre, Apellido, Carrera, Password);
    }
    public Usuario buscarUsuario(int car,String password){
        String pass=getMD5(password);
        return tabla.buscar(car, pass);
    }
    private String getMD5(String input){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] messageDigest=md.digest(input.getBytes());
            BigInteger num=new BigInteger(1,messageDigest);
            String hashpassword=num.toString(16);
            while (hashpassword.length() < 32) {
                hashpassword= "0"+hashpassword;
            }
            return hashpassword;
        } catch (NoSuchAlgorithmException  e) {
            System.out.println(e.getMessage());
        }
        return "";
    }
}

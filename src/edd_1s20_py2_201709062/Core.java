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
import java.util.LinkedList;
import java.util.Stack;
public class Core {
    TablaHash tabla;
    ArbolAVL arbolAVL;
    public Core(){
        this.tabla=new TablaHash(45);
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
    public Usuario buscarLogin(int car){
        return tabla.buscarlogin(car);
    }
    public void eliminarUsuario(int car){
        tabla.remove(car);
    }
    public void editarUsuario(int car,String Nombre, String Apellido,String Carrera, String Password){
        String auxpass=getMD5(Password);
        tabla.updateUser(car, Nombre, Apellido, Carrera, auxpass);
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
    public Libro buscarLibro(NodoAVL raiz,int isnl){
        if(raiz==null)
            return null;
        Stack<NodoAVL> nodeStack = new Stack<>(); 
        
        nodeStack.push(raiz); 
        while (nodeStack.empty()==false) {            
            NodoAVL mynode = nodeStack.peek(); 
            //System.out.print(mynode.getCategoria() + " ");
            System.out.println(mynode.getCategoria());
            //mynode.getArbolb().imprimir();
            Libro auxnodoB=mynode.getArbolb().buscar(isnl);
            if(auxnodoB!=null){
                return auxnodoB;
            }
            nodeStack.pop();
            if (mynode.getDer() != null) { 
                nodeStack.push(mynode.getDer()); 
            } 
            if (mynode.getIzq() != null) { 
                nodeStack.push(mynode.getIzq()); 
            } 
        }
        return null;
    }
    public LinkedList<LinkedList<Libro>> buscarSubString(NodoAVL raiz,String substring){
        LinkedList<LinkedList<Libro>> listaListasLibros=new LinkedList();
        if(raiz==null)
            return null;
        Stack<NodoAVL> nodeStack = new Stack<>(); 
        nodeStack.push(raiz); 
        while (nodeStack.empty()==false) {            
            NodoAVL mynode = nodeStack.pop(); 
            System.out.print(mynode.getCategoria() + " "); 
            listaListasLibros.add(mynode.getArbolb().buscarSubConsidencias(substring));
            
            if (mynode.getDer() != null) { 
                nodeStack.push(mynode.getDer()); 
            } 
            if (mynode.getIzq() != null) { 
                nodeStack.push(mynode.getIzq()); 
            }
            //nodeStack.pop();
        }
        return listaListasLibros;
    }
    public void borrarLibro(NodoAVL raiz,String categoria,int isbn){
        NodoAVL avlnode=this.arbolAVL.buscar(raiz, categoria);
        if(avlnode!=null){
            avlnode.getArbolb().remover(isbn);
        }
    }
}

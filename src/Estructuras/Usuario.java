package Estructuras;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Usuario {
    int carne;
    String nombre, apellido, carrera, password;
    public Usuario(int car,String Nombre, String Apellido,String Carrera, String Password){
        this.carne=car;
        this.nombre=Nombre;
        this.apellido=Apellido;
        this.carrera=Carrera;
        this.password=getMD5(Password);
    }
    static String getMD5(String input){
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

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = getMD5(password);
    }
    
}

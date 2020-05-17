/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

public class Nodoip{
    String ip;
    int puerto;
    Nodoip siguiente;
    
    Nodoip(String ip, int puerto){
        this.ip=ip;
        this.puerto=puerto;
        this.siguiente=null;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    public Nodoip getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodoip siguiente) {
        this.siguiente = siguiente;
    }
    
}

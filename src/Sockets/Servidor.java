/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor extends Observable implements Runnable{
    private int puerto;
    private String ip;
    ServerSocket servidor;
    Socket sc;
    DataInputStream in;
    public Servidor(String ip, int puerto){
        this.ip=ip;
        this.puerto=puerto;
    }

    @Override
    public void run() {
        
        
        try {
            servidor=new ServerSocket(puerto);
            System.out.println("Servidor iniciando con el puerto"+ servidor.getLocalPort());
            System.out.println(servidor.getLocalSocketAddress());
            while (true) {                
                sc=servidor.accept();
                System.out.println("Cliente conectado");
                in=new DataInputStream(sc.getInputStream());
                String mensaje=in.readUTF();
                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();
                
                sc.close();
                System.out.println("Se desconecto el cliente");
            }
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void customServer(String ip, int port){
        this.ip=ip;
        this.puerto=port;
        SocketAddress sa = new InetSocketAddress(ip, port);
        try {
            servidor.bind(sa);
            System.out.println(servidor.getLocalSocketAddress());
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

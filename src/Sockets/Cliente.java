/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {
    int puerto=3000;
    String ip;
    String mensaje;
    public Cliente(String ip,int puerto,String mensaje){
        this.ip=ip;
        this.puerto=puerto;
        this.mensaje=mensaje;
    }
    @Override
    public void run() {
        
        DataInputStream in;
        DataOutputStream out;
        Socket sc;
        
        try {
            sc=new Socket(ip, puerto);
            out=new DataOutputStream(sc.getOutputStream());
            out.writeUTF(mensaje);
            
            sc.close();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

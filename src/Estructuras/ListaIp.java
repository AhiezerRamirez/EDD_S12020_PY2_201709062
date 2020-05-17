/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Sockets.Cliente;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class ListaIp {
    public Nodoip primero,ultimo;
    int size;
    public ListaIp(){
        this.primero=null;
        this.ultimo=null;
        this.size=0;
    }
    public void ingresar(String ip, int puerto){
        Nodoip n=new Nodoip(ip,puerto);
        if(primero==null){
            primero=ultimo=n;
        }else{
            ultimo.siguiente=n;
            ultimo=n;
        }
        size++;
    }
    
    public void borrar(String ip,int puerto){
        Nodoip nodo=buscar(ip,puerto);
        if(nodo!=null){
            if(primero==ultimo){
                primero=null;
                ultimo=null;
                size--;
            }else if(primero.ip.equals(ip) && primero.puerto==puerto){
                primero=primero.siguiente;
                size--;
            }else if(ultimo.ip.equals(ip) && ultimo.puerto==puerto){
                Nodoip cur=primero;
                Nodoip prev=null;
                while(cur.siguiente!=null){
                    prev=cur;
                    cur=cur.siguiente;
                }
                ultimo=prev;
                prev.siguiente=null;
                size--;
            }else{
                Nodoip prev=null;
                Nodoip cur=primero;
                while(cur!=null){
                    if(cur.ip.equals(ip) && cur.puerto==puerto)
                        break;
                    prev=cur;
                    cur=cur.siguiente;
                }
                prev.siguiente=cur.siguiente;
                size--;
            }
        }
    }
    
    Nodoip buscar(String ip, int port){
        Nodoip aux=primero;
        while(aux!=null){
            if(aux.ip.equals(ip) && aux.puerto==port)
                return aux;
            aux=aux.siguiente;
        }
        return null;
    }
    
    public void graficar(){
        StringBuilder s=new StringBuilder();
        s.append("digraph G {\nrankdir=LR;\n\t");
        Nodoip aux=primero;
        int i=0;
        while(aux!=null){
            s.append("nodo").append(i).append("[label=\"").append(aux.ip).append("\\n").append(aux.puerto).append("\"];\n\t");
            aux=aux.siguiente;
            i++;
        }
        i=0;
        aux=primero;
        if(aux!=null){
            while(aux.siguiente!=null){
                s.append("nodo").append(i).append(" -> ").append("nodo").append(i+1).append(";\n\t");
                i++;
                aux=aux.siguiente;
            }
        }
        s.append("}");
        
        String ruta="./BloquesJson/Graficas/Listaip.dot";
        try {
            PrintWriter writer = new PrintWriter(ruta, "UTF-8");
            writer.println(s.toString());           //writes bytes into file  
            writer.close();
            ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "dot -Tjpg ./BloquesJson/Graficas/Listaip.dot -o ./BloquesJson/Graficas/Listaip.jpg");
            builder.start();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal con el archivo dot");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal con la imagen jpg");
        }
    }
    
    public void actualizarNodo(String s){
        Cliente c;
        Thread t;
        Nodoip aux=primero;
        while(aux!=null){
            c=new Cliente(aux.getIp(),aux.getPuerto(),s);
            t=new Thread(c);
            t.start();
            System.out.println(t.getId());
            aux=aux.getSiguiente();
        }
    }
    public void reportarSalida(String s){
        Cliente c;
        Thread t;
        Nodoip aux=primero;
        while(aux!=null){
            c=new Cliente(aux.getIp(),aux.getPuerto(),s);
            t=new Thread(c);
            t.start();
            System.out.println(t.getId());
            aux=aux.getSiguiente();
        }
    }
}


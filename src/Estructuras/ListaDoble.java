/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class ListaDoble {
    NodoListaDoble header, tail;

    public ListaDoble() {
        this.header=null;
        this.tail=null;
    }
    public boolean estaVacia(){
        if(this.header==null)
            return true;
        else
            return false;
    }
    public String returnLastHash(){
        return tail.block.hash;
    }
    public void insert(Boque data){
        NodoListaDoble n=new NodoListaDoble(data);
        if(header==null){
            header=tail=n;
        }else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    public void NodosToString(){
        StringBuilder s=new StringBuilder();
        NodoListaDoble aux=this.header;
        s.append("digraph G {\n\trankdir=LR;\n\t");
        while (aux!=null) {
            s.append("nodo").append(aux.block.index).append("[shape=square label=\"");
            s.append("Index: ").append(aux.block.index).append("\\n");
            s.append("TimeStamp: ").append(aux.block.fecha.toString()).append("\\n");
            s.append("Nonce: ").append(aux.block.nonce).append("\\n");
            for (Data object : aux.block.data) {
                s.append(object.StringParaGraphviz());
            }
            s.append("PreviosHash: ").append(aux.block.prevHash).append("\\n");
            s.append("Hash: ").append(aux.block.hash);
            s.append("\"];\n\t");
            aux=aux.getNext();
        }
        aux=this.header;
        while (aux.getNext()!=null) {
            s.append("nodo").append(aux.block.index).append(" -> ").append("nodo").append(aux.getNext().block.index).append("[dir=both];\n\t");
            aux=aux.getNext();
        }
        
        s.append("}");
        comandoDot("BlocChain",s.toString());
    }
    private void comandoDot(String nombre,String codigoDot){
        String ruta="./BloquesJson/Graficas/"+nombre+".dot";
        try {
            PrintWriter writer = new PrintWriter(ruta, "UTF-8");
            writer.println(codigoDot);           //writes bytes into file  
            writer.close();
            ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "dot -Tjpg ./BloquesJson/Graficas/"+nombre+".dot -o ./BloquesJson/Graficas/"+nombre+".jpg");
            builder.start();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal con el archivo dot");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal con la imagen jpg");
        }
    }
}

class NodoListaDoble{
    Boque block;
    NodoListaDoble next,prev;

    public NodoListaDoble(Boque bloque) {
        this.block=bloque;
        this.next=null;
        this.prev=null;
    }

    public Boque getBlock() {
        return block;
    }

    public void setBlock(Boque block) {
        this.block = block;
    }

    public NodoListaDoble getNext() {
        return next;
    }

    public void setNext(NodoListaDoble next) {
        this.next = next;
    }

    public NodoListaDoble getPrev() {
        return prev;
    }

    public void setPrev(NodoListaDoble prev) {
        this.prev = prev;
    }
    
    
}

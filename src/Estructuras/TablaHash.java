
package Estructuras;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class TablaHash {
    public NodoHash[] nodo;
    private final int size;
    public TablaHash(int size){
        this.size=size;
        this.nodo=new NodoHash[size];
    }
    private int hashFuncion(int carne){
        return carne % size;
    }
    public void add(int car,String Nombre, String Apellido,String Carrera, String Password){
        Usuario u=new Usuario(car, Nombre, Apellido, Carrera, Password);
        int index =hashFuncion(car);
        NodoHash prev=null;
        NodoHash entrada=nodo[index];
        //while (entrada!=null && entrada.user.carne!=car) {            
          //  prev=entrada;
            //entrada=entrada.getNext();
        //}
        if(entrada==null){
            NodoHash n=new NodoHash(car, u);
            nodo[index]=n;
            if(prev !=null){
                prev.setNext(n);
            }
        }else{
            entrada.value.insertar(u);
        }
    }
    public void remove(int carne){
        int index=hashFuncion(carne);
        NodoHash entrada=nodo[index];
        System.out.println(index);
        if(entrada==null){
            System.out.println("Usuario: "+carne+" no encontrado");
        }else{
            if(entrada.user.carne==carne){
                if(entrada.value.primero!=null){
                    nodo[index].user=entrada.value.primero.value;
                    entrada.value.borrar(nodo[index].user.getCarne());
                }else{
                    nodo[index]=null;
                }
            }else{
                entrada.value.borrar(carne);
            }
        }
    }
    public void updateUser(int car,String Nombre, String Apellido,String Carrera, String Password){
        int index=hashFuncion(car);
        NodoHash entrada=nodo[index];
        if(entrada!=null){
            if(entrada.user.carne==car){
                entrada.user.setNombre(Nombre);
                entrada.user.setApellido(Apellido);
                entrada.user.setCarrera(Carrera);
                entrada.user.setPassword(Password);
            }else{
                Usuario auxuser=entrada.value.buscar(car);
                if(auxuser!=null){
                    auxuser.setNombre(Nombre);
                    auxuser.setApellido(Apellido);
                    auxuser.setCarrera(Carrera);
                    auxuser.setPassword(Password);
                }else{
                    System.out.println("Usuario:"+car+" no encontrado");
                }
            }
        }else{
            System.out.println("Usuario: "+car+" no encontrado");
        }
    }
    public Usuario buscar(int car,String pass){
        int index=hashFuncion(car);
        NodoHash entrada=nodo[index];
        if(entrada!=null){
            if(entrada.user.carne==car && pass.equals(entrada.user.getPassword())){
                return entrada.user;
            }else{
                Usuario auxuser=entrada.value.buscar(car);
                if(auxuser!=null){
                    if(auxuser.password.equals(pass))
                        return auxuser;
                    else
                        return null;
                }else{
                    System.out.println("Usuario:"+car+" no encontrado");
                    return null;
                }
            }
        }else{
            System.out.println("Usuario: "+car+" no encontrado");
            return null;
        }
    }
    
    public Usuario buscarlogin(int car){
        int index=hashFuncion(car);
        NodoHash entrada=nodo[index];
        if(entrada!=null){
            if(entrada.user.carne==car ){
                return entrada.user;
            }else{
                Usuario auxuser=entrada.value.buscar(car);
                if(auxuser!=null){
                    return auxuser;
                }else{
                    System.out.println("Usuario:"+car+" no encontrado");
                    return null;
                }
            }
        }else{
            System.out.println("Usuario: "+car+" no encontrado");
            return null;
        }
    }
    
    public void obetnerCodDot(){
        StringBuilder s=new StringBuilder();
        s.append("digraph G {\n\tnodesep=.05;\n\trankdir=LR;\n\tnode [shape=record,width=.1,height=.1];\n\t");
        s.append("nodo0[label = \"");
        int i;
        for ( i = 0; i < nodo.length-1; i++) {
            
            if(nodo[i]!=null){
                s.append("<f").append(i+1).append("> clave: ").append(i+1).append(" |");
            }else{
                s.append("<f").append(i+1).append(">|");
            }
        }
        if(nodo[i]!=null){
                s.append("<f").append(i+1).append("> clave: ").append(i+1).append("\",height=2.5];\n\tnode [width = 1.5];\n\t");
            }else{
                s.append("<f").append(i+1).append(">|\",height=2.5];\n\tnode [width = 1.5];\n\t");
            }
        for ( i = 0; i < nodo.length; i++) {
            if(nodo[i]!=null){
                s.append("nodo").append(nodo[i].user.carne).append("[label = \"{<n> |").append(nodo[i].user.carne).append("\\n").
                append(nodo[i].user.nombre).append(" ").append(nodo[i].user.apellido).append("\\n").append(nodo[i].user.password).append(" |<p> }\"];\n\t");
                if(nodo[i].value.primero!=null){
                    s.append(nodo[i].value.declararNodos());
                }
            }
        }
        for ( i = 0; i < nodo.length; i++) {
            if(nodo[i]!=null){
                s.append("nodo0:f").append(i+1).append(" -> nodo").append(nodo[i].user.carne).append(":n;\n\t");
                if(nodo[i].value.primero!=null){
                    s.append("nodo").append(nodo[i].user.carne).append(" -> ").append(nodo[i].value.graficar());
                }
            }
        }
        s.append("}");
        comandoDot("tablaHash",s.toString());
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

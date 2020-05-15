
package Estructuras;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class ArbolB {
    public NodoB root;
    public int t,numLibros=0;
    public ArbolB(int orden){
        this.root=null;
        this.t=orden;
    }
    public void insertar(int isbn,int year,String idioma, String titulo, String editorial,String autor,int edicion,String categoria,int propietario){
        Libro book=new Libro(isbn, year, idioma, titulo, editorial, autor, edicion, categoria, propietario);
        if(root==null){
            root=new NodoB(t, true);
            root.libros[0]=book;
            root.n=1;
        }else{
            if(root.n==2*t-1){
                NodoB n=new NodoB(t,false);
                n.C[0]=root;
                n.dividirNodo(0, root);
                int i=0;
                if(n.libros[0].getISBN()<isbn)
                    i++;
                n.C[i].insertNotFull(book);
                //n.C[i].n=n.C[i].n-1;
                root=n;
            }else{
                root.insertNotFull(book);
            }
        }
        numLibros++;
    }
    public void remover(int k){
        if(root==null){
            System.out.println("El árbol está vacío");
            return;
        }
        root.remover(k);
        if(root.n==0){
            if(root.hoja){
                root=null;
            }else{
                root=root.C[0];
            }
            
        }
    }
    public void imprimir(String categoria){
        StringBuilder cod=new StringBuilder();
        List<Integer> recorridos=new LinkedList<>();
        if(this.root!=null){
            cod.append("digraph g{\n\tnode[shape=record, height= .1, fillcolor=lightblue3 ,color=lightblue4, style=filled];\n\tedge[color= lightblue4];\n\t");
            this.root.recorrer(cod,recorridos);
            this.root.recorrerhojas(cod,recorridos);
            cod.append("\n}");
            comandoDot(categoria+"_arbolB",cod.toString());
        }
        else
            JOptionPane.showMessageDialog(null,"El árbol está vacío");
    }
    public Libro buscar(int isn){
        if(root==null)
            return null;
        else
        return root.buscar(isn);
    } 
    public LinkedList<Libro> buscarSubConsidencias(String substring){
        return root.buscarSubSring(substring);
    }
    public LinkedList<Integer> getAllBooks(){
        if(root!=null)
            return root.getAllBooks();
        else
            return new LinkedList<>();//Ver si esto no da clavo despues
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


/*
digraph g {
node [shape = record,height=.1];
node0[label = "<f0> |10|<f1> |20|<f2> |30|<f3>"];
node1[label = "<f0> |1|<f1> |2|<f2>"];
"node0":f0 -> "node1"
node2[label = "<f0> |11|<f1> |12|<f2>"];
"node0":f1 -> "node2"
node3[label = "<f0> |21|<f1> |22|<f2>"];
"node0":f2 -> "node3"
node4[label = "<f0> |31|<f1> |32|<f2>"];
"node0":f3 -> "node4"

}
*/
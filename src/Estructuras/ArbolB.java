
package Estructuras;

import java.util.LinkedList;
import java.util.List;

public class ArbolB {
    public NodoB root;
    public int t;
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
            if(root.n==4){
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
    }
    public void remover(int k){
        if(root==null){
            System.out.println("El árbol está vacío");
            return;
        }
        root.remover(k);
        if(root.n==0){
            NodoB temp=root;
            if(root.hoja){
                root=null;
            }else{
                root=root.C[0];
            }
        }
    }
    public void imprimir(){
        StringBuilder cod=new StringBuilder();
        List<Integer> recorridos=new LinkedList<>();
        if(this.root!=null){
            cod.append("digraph g{\n\tnode[shape=record, height= .1, fillcolor=lightblue3 ,color=lightblue4, style=filled];\n\tedge[color= lightblue4];\n\t");
            this.root.recorrer(cod,recorridos);
            this.root.recorrerhojas(cod,recorridos);
            cod.append("\n}");
            System.out.println(cod.toString());
        }
        else
            System.out.print("El árbol está vacío");
    }
    public Libro buscar(int isn){
        return root.buscar(t);
    } 
    public LinkedList<Libro> buscarSubConsidencias(String substring){
        return root.buscarSubSring(substring);
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
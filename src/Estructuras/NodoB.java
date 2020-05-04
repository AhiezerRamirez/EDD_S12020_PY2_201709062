/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NodoB{
    int t,n;
    public Libro[] libros=null;
    NodoB[] C=null;
    boolean hoja;
    public NodoB(int orden, boolean leaf){
        this.t=2;
        this.hoja=leaf;
        this.libros=new Libro[orden-1];
        this.C=new NodoB[orden];
        this.n=0;
    }
    LinkedList<Libro> buscarSubSring(String substring){
        LinkedList<Libro> listLibros=new LinkedList();
        Queue<NodoB> cola=new LinkedList();
        cola.add(this);
        while (!cola.isEmpty()) {            
            NodoB nodoaux=cola.peek();
            int i;
            for ( i = 0; i < n; i++) {
        	if(hoja==false)
                    cola.add(C[i]);
               	if(nodoaux.libros[i].getTitulo().contains(substring))
                    listLibros.add(nodoaux.libros[i]);
            }
            cola.remove();
            if(hoja==false)
            cola.add(C[i]);
        }
        return listLibros;
    }
    void recorrer(StringBuilder cod,List<Integer> recorridos){
        int i;
        for ( i = 0; i < n; i++) {
            if(!hoja){
                int j;
                if(!recorridos.contains(libros[0].getISBN())){
                    cod.append("node").append(libros[0].getISBN()).append("[label = \"");
                    for (j = 0; j < n; j++) {
                        cod.append("<f").append(j).append("> | ");
                        cod.append(libros[j].getISBN()).append(" | ");
                    }
                    cod.append("<f").append(j).append(">\"];\n\t");
                    recorridos.add(libros[0].getISBN());
                }
                C[i].recorrer(cod,recorridos);
            }
        }
        if(!hoja){
            int j;
            
            if(!recorridos.contains(libros[0].getISBN())){
                cod.append("node").append(libros[0].getISBN()).append("[label = \"");
                cod.append("node").append(libros[0].getISBN()).append("[label = \"");
                for (j = 0; j < n; j++) {
                    cod.append("<f").append(j).append("> | ");
                    cod.append(libros[j].getISBN()).append(" | ");
                }
                cod.append("<f").append(j).append(">\"];\n\t");
                recorridos.add(libros[0].getISBN());
            }
            C[i].recorrer(cod,recorridos);
        }
    }
    void recorrerhojas(StringBuilder cod,List<Integer>recorridos){
        int i;
        for ( i = 0; i < n; i++) {
            if(!hoja){
                cod.append("\"node").append(libros[0].getISBN()).append("\":f").append(i).append(" -> \"node").append(C[i].libros[0].getISBN()).append("\"\n\t");
                C[i].recorrerhojas(cod,recorridos);
                
            }else{
                if(!recorridos.contains(libros[0].getISBN())){
                    int j;
                    cod.append("node").append(libros[0].getISBN()).append("[label = \"");
                    for (j = 0; j < n; j++) {
                        cod.append("<f").append(j).append("> | ");
                        cod.append(libros[j].getISBN()).append(" | ");
                    }
                    cod.append("<f").append(j).append(">\"];\n\t");
                    recorridos.add(libros[0].getISBN());
                }
            }
        }
        if(!hoja){
            cod.append("\"node").append(libros[0].getISBN()).append("\":f").append(i).append(" -> \"node").append(C[i].libros[0].getISBN()).append("\"\n\t");
            C[i].recorrerhojas(cod,recorridos);
        }   
    }
    public Libro buscar(int k){
        int i=0;
        while(i<n&&k>libros[i].getISBN()){
            i++;
        }
        if(libros[i].getISBN()==k)
            return this.libros[i];
        
        if(this.hoja==true){
            return null;
        }
        return C[i].buscar(k);
    }
    void insertNotFull(Libro book){
        int i=this.n-1;
        if(hoja==true){
            while(i>=0 && libros[i].getISBN()>book.getISBN()){
                libros[i+1]=libros[i];
                i--;
            }
            libros[i+1]=book;
            n=n+1;
        }else{
            while(i>=0 && libros[i].getISBN()>book.getISBN())
                i--;
            if(C[i+1].n == 4){
                dividirNodo(i+1,C[i+1]);
                if(libros[i+1].getISBN() < book.getISBN())
                    i++;
                //C[i+1].n=C[i+1].n-1;
            }
            C[i+1].insertNotFull(book);
        }
    }
    void dividirNodo(int i, NodoB y){
        NodoB z=new NodoB(5,y.hoja);
        z.n=t;
        for (int j = 0; j < t; j++) {
            z.libros[j]=y.libros[j+t];
        }
        if(y.hoja==false){
            for (int j = 0; j <=t; j++) {
                z.C[j]=y.C[j+t];
            }
        }
        y.n=t-1;
        for (int j = n; j >= i+1; j--) {
            C[j+1]=C[j];
        }
        C[i+1]=z;
        for (int j = n-1; j >=i; j--) {
            libros[j+1]=libros[j];
        }
        libros[i]=y.libros[t-1];
        n=n+1;
    }
    int encontrarPos(int k){
        int index=0;
        while (index<n && libros[index].getISBN() < k) {            
            ++index;
        }
        return index;
    }
    void juntar(int idx){
        NodoB hijo=C[idx];
        NodoB hermano=C[idx+1];
        hijo.libros[t-1]=libros[idx];
        for (int i = 0; i < hermano.n; i++) {
            hijo.libros[i+t]=hermano.libros[i];
        }
        if(!hijo.hoja){
            for (int i = 0; i < hermano.n; i++) {
                hijo.C[i+t]=hermano.C[i];
            }
        }
        for (int i = idx+1; i < n; i++) {
            libros[i-1]=libros[i];
        }
        for (int i = idx+2; i < n; i++) {
            C[i-2]=C[i];
        }
        hijo.n+=hermano.n+1;
        n--;
    }
    void prestarDerecha(int idx){
        NodoB hijo =C[idx];
        NodoB hermano=C[idx+1];
        hijo.libros[(hijo.n)]=libros[idx];
        if(!(hijo.hoja)){
            hijo.C[(hijo.n)+1]=hermano.C[0];
        }
        libros[idx]=hermano.libros[0];
        for (int i = 1; i < hermano.n; i++) {
            hermano.libros[i-1]=hermano.libros[i];
        }
        if(!hermano.hoja){
            for (int i = 1; i < hermano.n; i++) {
                hermano.C[i-1]=hermano.C[i];
            }
        }
        hijo.n+=1;
        hermano.n-=1;
    }
    void prestarIzquierda(int idx){
        NodoB hijo=C[idx];
        NodoB hermano=C[idx-1];
        for (int i = hijo.n-1; i >= 0; --i) {
            hijo.libros[i+1]=hijo.libros[i];
        }
        if(!hijo.hoja){
            for (int i = hijo.n-1; i >= 0; --i) {
            hijo.C[i+1]=hijo.C[i];
            }
        }
        hijo.libros[0]=libros[idx-1];
        if(!hijo.hoja)
            hijo.C[0]=hermano.C[hermano.n];
        libros[idx-1]=hermano.libros[hermano.n-1];
        hijo.n+=1;
        hermano.n-=1;
    }
    void completar(int idx){
        if(idx!=0 && C[idx-1].n>=t){
            prestarIzquierda(idx);
        }else if(idx!=n && C[idx+1].n>=t){
            prestarDerecha(idx);
        }else{
            if(idx!=n){
                juntar(idx);
            }else{
                juntar(idx-1);
            }
        }
    }
    Libro getSuccesor(int idx){
        NodoB cur=C[idx+1];
        while(!cur.hoja)
            cur=cur.C[0];
        return cur.libros[0];
    }
    Libro getPredecesor(int idx){
        NodoB cur=C[idx];
        while(!cur.hoja)
            cur=cur.C[cur.n];
        return cur.libros[cur.n-1];
    }
    int encontrarIndex(int k){
        int idx=0;
        while (idx<n && libros[idx].getISBN()<k) {            
            ++idx;
        }
        return idx;
    }
    public void remover(int k){
        int idx=encontrarIndex(k);
        if(idx <n && libros[idx].getISBN()==k){
            if(hoja)
                removerHoja(idx);
            else
                removerNoHoja(idx);
        }else{
            if(hoja){
                System.out.println("El nodo: "+k+" no existe en el árbol");
                return;
            }
            boolean bandera;
            if(idx==n){
               bandera=true;
            }else{
               bandera=false;
            }
            if(C[idx].n<t){
                completar(idx);
            }
            if(bandera && idx >n){
                C[idx-1].remover(k);
            }else{
                C[idx].remover(k);
            }
        }
    }
    void removerHoja(int idx){
        for (int i = idx+1; i < n; i++) {
            libros[i-1]=libros[i];
        }
        n--;
    }
    void removerNoHoja(int idx){
        Libro k=libros[idx];
        if(C[idx].n >=t){
            Libro pre=getPredecesor(idx);
            libros[idx]=pre;
            C[idx].remover(pre.getISBN());
        }else if(C[idx+1].n >=t){
            Libro succ=getSuccesor(idx);
            libros[idx]=succ;
            C[idx+1].remover(succ.getISBN());
        }else{
            juntar(idx);
            C[idx].remover(k.getISBN());
        }
    }
}


package Estructuras;

public class ArbolB {
    NodoB root;
    public int t;
    public ArbolB(int orden){
        this.root=null;
        this.t=orden;
    }
    public void insertar(int isbn,int year,String idioma, String titulo, String editorial,String autor,int edicion,String categoria){
        Libro book=new Libro(isbn, year, idioma, titulo, editorial, autor, edicion, categoria);
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
                root=n;
            }else{
                root.insertNotFull(book);
            }
        }
    }
    public void imprimir(){
        this.root.recorrer();
    }
}

class NodoB{
    int t,n;
    Libro[] libros;
    NodoB[] C;
    boolean hoja;
    public NodoB(int orden, boolean leaf){
        this.t=2;
        this.hoja=leaf;
        this.libros=new Libro[orden-1];
        this.C=new NodoB[orden];
        this.n=0;
    }
    void recorrer(){
        int i;
        for (i = 0; i < n; i++) {
            if(this.hoja==false)
                C[i].recorrer();
            System.out.println(this.libros[i].getISBN()+" "+this.libros[i].getTitulo());
            
        }
        if(this.hoja==false)
            C[i].recorrer();
    }
    NodoB buscar(int k){
        int i=0;
        while(i<n&&k>libros[i].getISBN()){
            i++;
        }
        if(libros[i].getISBN()==k)
            return this;
        
        if(this.hoja==true){
            return null;
        }
        return C[i].buscar(k);
    }
    void insertNotFull(Libro book){
        int i=this.n-1;
        if(this.hoja==true){
            while(i>=0 && libros[i].getISBN()>book.getISBN()){
                libros[i+1]=libros[i];
                i--;
            }
            libros[i+1]=book;
            n=n+1;
        }else{
            while(i>=0 && libros[i].getISBN()>book.getISBN())
                i--;
            if(this.C[i+1].n == 4){
                dividirNodo(i+1,C[i+1]);
                if(libros[i+1].getISBN() < book.getISBN())
                    i++;
            }
            C[i+1].insertNotFull(book);
        }
    }
    void dividirNodo(int i, NodoB y){
        NodoB z=new NodoB(5,y.hoja);
        z.n=this.t-1;
        for (int j = 0; j < t-1; j++) {
            z.libros[j]=y.libros[j+t];
        }
        if(y.hoja==false){
            for (int j = 0; j < t; j++) {
                z.C[j]=y.C[j+t];
            }
        }
        y.n=t-1;
        for (int j = 0; j < i+1; j++) {
            C[j+1]=C[j];
        }
        C[i+1]=z;
        for (int j = n-1; j >=i; j++) {
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
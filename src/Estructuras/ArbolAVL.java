/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

public class ArbolAVL {
    public NodoAVL root;
    public ArbolAVL(){
        this.root=null;
    }
    int altura(NodoAVL N){
        if(N==null)
            return 0;
        return N.getAltura();
    }
    int max(int a , int b){
        return (a > b)? a: b;
    }
    NodoAVL rotarDer(NodoAVL y){
        NodoAVL x = y.getIzq();
        NodoAVL t2=x.getDer();
        
        x.setDer(y);
        y.setIzq(t2);
        
        y.setAltura(max(altura(y.getIzq()),altura(y.getDer()))+1);
        x.setAltura(max(altura(x.getIzq()),altura(x.getDer()))+1);
        return x;
    }
    NodoAVL rotarIzq(NodoAVL x){
        NodoAVL y=x.getDer();
        NodoAVL t2=y.getIzq();
        
        y.setIzq(x);
        x.setDer(t2);
        
        x.setAltura(max(altura(x.getIzq()),altura(x.getDer()))+1);
        y.setAltura(max(altura(y.getIzq()),altura(y.getDer()))+1);
        
        return y;
    }
    int obtenerBalance(NodoAVL N){
        if(N==null)
            return 0;
        return altura(N.getDer()) - altura(N.getIzq());
    }
    public NodoAVL insertar(NodoAVL nodo,String categoria){
        if(nodo == null)
            return (new NodoAVL(categoria));
        else if(categoria.compareToIgnoreCase(nodo.getCategoria()) < 0)
            nodo.setIzq(insertar(nodo.getIzq(),categoria));
        else if(categoria.compareToIgnoreCase(nodo.getCategoria()) > 0)
            nodo.setDer(insertar(nodo.getDer(),categoria));
        else
            return nodo;
        nodo.setAltura(1+ max(altura(nodo.getIzq()),altura(nodo.getDer())));
        int balance=obtenerBalance(nodo);
        
        if(balance > 1 && (categoria.compareToIgnoreCase(nodo.getDer().getCategoria()) > 0))
            return rotarIzq(nodo);
        if(balance < -1 && (categoria.compareToIgnoreCase(nodo.getIzq().getCategoria()) < 0))
            return rotarDer(nodo);
        if(balance > 1 && (categoria.compareToIgnoreCase(nodo.getDer().getCategoria()) < 0)){
            nodo.setDer(rotarDer(nodo.getDer()));
            return rotarIzq(nodo);
        }
        if(balance < -1 && (categoria.compareToIgnoreCase(nodo.getIzq().getCategoria()) > 0)){
            nodo.setIzq(rotarIzq(nodo.getIzq()));
            return rotarDer(nodo);
        }
        
            
        return nodo;
    }
    static int nullcount=0;
    private void imprimirNull(String clave, int nul,StringBuilder d){
        d.append("null").append(nul).append(" [shape=point];\n\t");
        d.append("\"").append(clave).append("\" -> null").append(nul).append("\n\t");
    }
    private void graficarAux(NodoAVL nodo, StringBuilder s){
        
        if(nodo.getIzq()!=null){
            s.append("\"").append(nodo.getCategoria()).append("\" -> \"").append(nodo.getIzq().getCategoria()).append("\"\n\t");
            //System.out.println(nodo.getAltura()+" "+ nodo.getIzq().getAltura());
            //System.out.println(nodo.getCategoria()+" "+ nodo.getIzq().getCategoria());
            graficarAux(nodo.getIzq(), s);
        }else{
            imprimirNull(nodo.getCategoria(), nullcount++, s);
        }
        if(nodo.getDer()!=null){
            s.append("\"").append(nodo.getCategoria()).append("\" -> \"").append(nodo.getDer().getCategoria()).append("\"\n\t");
            //System.out.println(nodo.getAltura()+" "+ nodo.getDer().getAltura());
            //System.out.println(nodo.getCategoria()+" "+ nodo.getDer().getCategoria());
            graficarAux(nodo.getDer(), s);
        }else{
            imprimirNull(nodo.getCategoria(), nullcount++, s);
        }
    }
    public String obtenerCodigoDot(NodoAVL raiz){
        nullcount=0;
        StringBuilder cadena=new StringBuilder();
        cadena.append("digraph BST {\n\tnode [fontname=\"Arial\"];\n \t");
        if(raiz==null){
            cadena.append("\n");
        }else if(raiz.getIzq()==null && raiz.getDer()==null){
            cadena.append(raiz.getClass()).append("\n");
        }else{
            graficarAux(raiz, cadena);
        }
        cadena.append("}");
        return cadena.toString();
    }
    private NodoAVL getMinVal(NodoAVL node){
        NodoAVL cur=node;
        while (cur.getIzq()!=null) {            
            cur=cur.getIzq();
        }
        return cur;
    }
    public NodoAVL borrar(NodoAVL raiz,String categoria){
        if(raiz==null)
            return raiz;
        if(categoria.compareToIgnoreCase(raiz.getCategoria()) < 0)
            raiz.setIzq(borrar(raiz.getIzq(),categoria));
        else if(categoria.compareToIgnoreCase(raiz.getCategoria()) > 0)
            raiz.setDer(borrar(raiz.getDer(),categoria));
        else{
            if(raiz.getIzq()==null || raiz.getDer()==null){
                NodoAVL temp=null;
                if(temp==raiz.getIzq())
                    temp=raiz.getDer();
                else
                    temp=raiz.getIzq();
                if(temp==null){
                    temp=raiz;
                    raiz=null;
                }else
                    raiz=temp;
            }else{
                NodoAVL temp=getMinVal(raiz.getDer());
                raiz.setCategoria(temp.getCategoria());
                NodoAVL aux=borrar(raiz.getDer(),temp.getCategoria());
                raiz.setDer(aux);
            }
        }
        if(raiz==null)
            return raiz;
        raiz.setAltura(max(altura(raiz.getIzq()), altura(raiz.getDer()))+1);
        int balance =obtenerBalance(raiz);
        if(balance > 1 && (obtenerBalance(raiz.getDer()) > 0))
            return rotarIzq(raiz);
        if(balance > 1 && obtenerBalance(raiz.getDer()) <= 0){
            raiz.setDer(rotarDer(raiz.getDer()));
            return rotarIzq(raiz);
        }
        if(balance < -1 && obtenerBalance(raiz.getIzq()) <= 0)
            return rotarDer(raiz);
        if(balance < -1 && obtenerBalance(raiz.getIzq()) > 0){
            raiz.setIzq(rotarIzq(raiz.getIzq()));
            return rotarDer(raiz);
        }
        
        return raiz;
    }
}

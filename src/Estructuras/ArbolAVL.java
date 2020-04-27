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
        
        x.setDer(x);
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
        return altura(N.getIzq()) - altura(N.getDer());
    }
    public NodoAVL insertar(NodoAVL nodo,String categoria){
        if(nodo == null)
            return (new NodoAVL(categoria));
        else if(categoria.compareTo(nodo.getCategoria()) < 0)
            nodo.setIzq(insertar(nodo.getIzq(),categoria));
        else if(categoria.compareTo(nodo.getCategoria()) > 0)
            nodo.setDer(insertar(nodo.getDer(),categoria));
        else
            return nodo;
        nodo.setAltura(1+ max(altura(nodo.getIzq()),altura(nodo.getDer())));
        int balance=obtenerBalance(nodo);
        
        if(balance > 1 && (categoria.compareTo(nodo.getIzq().getCategoria()) < 0))
            return rotarDer(nodo);
        if(balance < -1 && (categoria.compareTo(nodo.getDer().getCategoria()) > 0))
            return rotarIzq(nodo);
        if(balance > 1 && (categoria.compareTo(nodo.getIzq().getCategoria()) > 0)){
            nodo.setIzq(rotarIzq(nodo.getIzq()));
            return rotarDer(nodo);
        }
        if(balance < -1 && (categoria.compareTo(nodo.getDer().getCategoria()) < 0)){
            nodo.setDer(rotarDer(nodo.getDer()));
            return rotarIzq(nodo);
        }
        
            
        return nodo;
    }
    private void graficarAux(NodoAVL nodo, StringBuilder s){
        if(nodo.getDer()!=null){
            s.append(nodo.getCategoria()).append(" -> ").append(nodo.getDer().getCategoria()).append("\n\t");
            graficarAux(nodo.getDer(), s);
        }
        if(nodo.getIzq()!=null){
            s.append(nodo.getCategoria()).append(" -> ").append(nodo.getIzq().getCategoria()).append("\n\t");
            graficarAux(nodo.getIzq(), s);
        }
    }
    public String obtenerCodigoDot(NodoAVL raiz){
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
}

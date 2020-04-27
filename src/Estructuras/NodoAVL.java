/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Lissette
 */
public class NodoAVL {
    private String categoria;
    private ArbolB arbolb;
    private int altura;
    private NodoAVL izq,der;
    public NodoAVL(String cate){
        this.categoria=cate;
        this.arbolb=new ArbolB(5);
        this.altura=1;
        this.izq=null;
        this.der=null;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArbolB getArbolb() {
        return arbolb;
    }

    public void setArbolb(ArbolB arbolb) {
        this.arbolb = arbolb;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public NodoAVL getIzq() {
        return izq;
    }

    public void setIzq(NodoAVL izq) {
        this.izq = izq;
    }

    public NodoAVL getDer() {
        return der;
    }

    public void setDer(NodoAVL der) {
        this.der = der;
    }
    
}

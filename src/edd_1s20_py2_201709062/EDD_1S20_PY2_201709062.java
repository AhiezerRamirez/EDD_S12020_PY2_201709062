/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_1s20_py2_201709062;
import Estructuras.*;
/**
 *
 * @author Lissette
 */
public class EDD_1S20_PY2_201709062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolB arbol=new ArbolB(5);
        arbol.insertar(11, 1999, "Aleman", "Harry ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(3, 9291, "Frances", "Rapídos ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(7, 1929, "Español", "Lejos ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(5, 1038, "Castellano", "2012 ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(1, 300, "Mandarin", "Gemelas ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(8, 1129, "italiano", "Temblores ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(10, 1432, "Aleman", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        System.out.println("");
        arbol.insertar(20, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        //System.out.println("");
        //arbol.remover(7);
        //arbol.imprimir();
    }
    
}

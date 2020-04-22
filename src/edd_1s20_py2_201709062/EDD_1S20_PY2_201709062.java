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
        arbol.insertar(11, 1999, "Aleman", "Harry Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(3, 9291, "Frances", "Rapídos Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(7, 1929, "Español", "Lejos Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(5, 1038, "Castellano", "2012 Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(1, 300, "Mandarin", "Gemelas Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(8, 1129, "italiano", "Temblores Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(10, 1432, "Aleman", "De nada Popoter", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
    }
    
}

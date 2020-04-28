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
        /*ArbolB arbol=new ArbolB(5);
        arbol.insertar(12, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(4, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(63, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(64, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(9, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(2, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(62, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");        
        arbol.insertar(45, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(50, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(56, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(44, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(120, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(34, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(10, 1432, "Aleman", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(20, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(11, 1999, "Aleman", "Harry ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(3, 9291, "Frances", "Rapídos ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");        
        arbol.insertar(7, 1929, "Español", "Lejos ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(5, 1038, "Castellano", "2012 ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");        
        arbol.insertar(1, 300, "Mandarin", "Gemelas ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");        
        arbol.insertar(8, 1129, "italiano", "Temblores ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(6, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(128, 1129, "italiano", "Temblores ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.insertar(136, 4221, "Rocio", "De nada ", "20 Century Fox", "Pablo Escobar", 1, "Sagas");
        arbol.imprimir();
        arbol.remover(63);
        arbol.remover(62);
        arbol.remover(50);
        arbol.remover(64);
        arbol.remover(120);
        arbol.remover(56);
        arbol.remover(45);
        arbol.remover(136);
        arbol.remover(20);
        arbol.remover(12);
        arbol.remover(10);
        arbol.remover(136);
        arbol.imprimir();*/
        ArbolAVL avl=new ArbolAVL();
        avl.root=avl.insertar(avl.root, "miedo terrorifico");
        avl.root=avl.insertar(avl.root, "terror");
        avl.root=avl.insertar(avl.root, "fantacia");
        avl.root=avl.insertar(avl.root, "sagas pajas");
        avl.root=avl.insertar(avl.root, "quimica");
        //avl.root=avl.insertar(avl.root, "biologia");
        avl.root=avl.insertar(avl.root, "fisica");
        avl.root=avl.insertar(avl.root, "arte");
        avl.root=avl.insertar(avl.root, "zootecnia");
        avl.root=avl.insertar(avl.root, "estadistica");
        avl.root=avl.insertar(avl.root, "matematicas");
        //avl.root=avl.insertar(avl.root, "calculo");
        avl.root=avl.insertar(avl.root, "diseno");
        //avl.root=avl.insertar(avl.root, "arquitectura");
        avl.root=avl.insertar(avl.root, "yank hummor");
        avl.root=avl.insertar(avl.root, "xilofono");
        avl.root=avl.insertar(avl.root, "liston");
        avl.root=avl.insertar(avl.root, "interiores");
        avl.root=avl.insertar(avl.root, "ciencia Ficcion");
        //avl.root=avl.insertar(avl.root, "cocina");
        avl.root=avl.insertar(avl.root, "teologia");
        avl.root=avl.insertar(avl.root, "meme");
        System.out.println(avl.obtenerCodigoDot(avl.root));
        //avl.root=avl.borrar(avl.root,"interiores");
        avl.root=avl.borrar(avl.root,"estadistica");
        avl.root=avl.borrar(avl.root,"ciencia Ficcion");
        avl.root=avl.borrar(avl.root,"diseno");
        System.out.println(avl.obtenerCodigoDot(avl.root));
    }
    
}

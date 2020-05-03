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
public class BorrarCategoria extends Data{
    int owner;
    String categoria;
    public BorrarCategoria(String cate, int due){
        this.categoria=cate;
        this.owner=due;
        this.tipo="\t\t{\n\t\t\t\"BORRAR_CATEGORIA\" :[\n\t\t\t\t{\n\t\t\t\t\t";
    }

    @Override
    public String graficar() {
        String cadena=tipo;
        cadena+="\"NOMBRE\": \""+categoria+"\"\n\t\t\t\t\t";
        cadena+="}\n\t\t\t]\n\t\t}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String strintParaHash() {
        String cadena="{\"BORRAR_CATEGORIA\" :[{";
        cadena+="\"NOMBRE\":\""+categoria+"\"";
        cadena+="}]}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String StringParaGraphviz() {
        String cadena="{\"BORRAR_CATEGORIA\" ";
        cadena+="NOMBRE: "+categoria+"\\n";
        cadena+="}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
public class BorrarUsuario extends Data{
    int carnet;
    public BorrarUsuario(int carnet){
        this.carnet = carnet;
        
        this.tipo="\t\t{\n\t\t\t\"BORRAR_USUARIO\" :\n\t\t\t{\n\t\t\t\t\t";
    }
    @Override
    public String graficar() {
        String cadena=tipo;
        cadena+="\"Carnet\": "+carnet+",\n\t\t\t\t\t";
        cadena+="}\n\t\t}\n";
        return cadena;
    }

    @Override
    public String strintParaHash() {
        String cadena="{\"BORRAR_USUARIO\" :[{";
        cadena+="\"Carnet\": "+carnet+",";
        cadena+="}]}";
        return cadena;
    }

    @Override
    public String StringParaGraphviz() {
        String cadena="{BORRAR_USUARIO:\\n";
        cadena+="Carnet: "+carnet+"\\n";
        cadena+="\\n}";
        return cadena;
    }
    
}

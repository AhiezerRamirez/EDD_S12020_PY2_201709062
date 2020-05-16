/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

public class BorrarLibro extends Data{
    int isbn;
    String titulo,categoria;
    
    public BorrarLibro(int isb,String titu, String cate){
        this.isbn=isb;
        this.titulo=titu;
        this.categoria=cate;
        this.tipo="\t\t{\n\t\t\t\"ELIMINAR_LIBRO\" :\n\t\t\t\t{\n\t\t\t\t\t";
    }

    @Override
    public String graficar() {
        String cadena=tipo;
        cadena+="\"ISBN\": "+isbn+",\n\t\t\t\t\t";
        cadena+="\"Titulo\": \""+titulo+"\",\n\t\t\t\t\t";
        cadena+="\"Categoria\": \""+categoria+"\"\n\t\t\t\t";
        cadena+="}\n\t\t}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String strintParaHash() {
        String cadena="{\"ELIMINAR_LIBRO\":[{";;
        cadena+="\"ISBN\": "+isbn+",";
        cadena+="\"Titulo\": "+titulo+",";
        cadena+="\"Categoria\": "+categoria;
        cadena+="}]}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String StringParaGraphviz() {
        String cadena="{CREAR_LIBRO:\\n";;
        cadena+="ISBN: "+isbn+"\\n";
        cadena+="Titulo: "+titulo+"\\n";
        cadena+="Categoria: "+categoria;
        cadena+="\\n}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

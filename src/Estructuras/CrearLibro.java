/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

public class CrearLibro extends Data{
    int isbn,year,edicion,propietario;
    String idioma,titulo,editorial,autor,categoria;
    public CrearLibro(int isb, int yea,String idiom,String titul,String editoria,String auto,int edicio,String categori,int propiet){
        this.isbn=isb;
        this.year=yea;
        this.idioma=idiom;
        this.titulo=titul;
        this.editorial=editoria;
        this.autor=auto;
        this.edicion=edicio;
        this.categoria=categori;
        this.propietario=propiet;
        this.tipo="\t\t{\n\t\t\t\"CREAR_LIBRO\" :\n\t\t\t\t{\n\t\t\t\t\t";
    }

    @Override
    public String graficar() {
        String cadena=tipo;
        cadena+="\"ISBN\": "+isbn+",\n\t\t\t\t\t";
        cadena+="\"Año\": "+year+",\n\t\t\t\t\t";
        cadena+="\"Idioma\": \""+idioma+"\",\n\t\t\t\t\t";
        cadena+="\"Titulo\": \""+titulo+"\",\n\t\t\t\t\t";
        cadena+="\"Editorial\": \""+editorial+"\",\n\t\t\t\t\t";
        cadena+="\"Autor\": \""+autor+"\",\n\t\t\t\t\t";
        cadena+="\"Edicion\": "+edicion+",\n\t\t\t\t\t";
        cadena+="\"Categoria\": \""+categoria+"\",\n\t\t\t\t\t";
        cadena+="\"Propietario\": "+propietario+"\n\t\t\t\t";
        cadena+="}\n\t\t}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String strintParaHash() {
        String cadena="{\"CREAR_LIBRO\":[{";;
        cadena+="\"ISBN\": "+isbn+",";
        cadena+="\"Año\": "+year+",";
        cadena+="\"Idioma\": "+idioma+",";
        cadena+="\"Titulo\": "+titulo+",";
        cadena+="\"Editorial\": "+editorial+",";
        cadena+="\"Autor\": "+autor+",";
        cadena+="\"Edicion\": "+edicion+",";
        cadena+="\"Categoria\": "+categoria;
        cadena+="}]}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String StringParaGraphviz() {
        String cadena="{CREAR_LIBRO:\\n";;
        cadena+="ISBN: "+isbn+"\\n";
        cadena+="Año: "+year+"\\n";
        cadena+="Idioma: "+idioma+"\\n";
        cadena+="Titulo: "+titulo+"\\n";
        cadena+="Editorial: "+editorial+"\\n";
        cadena+="Autor: "+autor+"\\n";
        cadena+="Edicio: "+edicion+"\\n";
        cadena+="Categoria: "+categoria;
        cadena+="\\n}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

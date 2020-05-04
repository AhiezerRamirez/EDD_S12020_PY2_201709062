/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

public class Libro {
    private int ISBN, Year,Edicion,Propietario;
    private String Idioma,Titulo,Editorial,Autor,Categoria;
    
    public Libro(int isbn,int year,String idioma, String titulo, String editorial,String autor,int edicion,String categoria,int propietaario){
        this.ISBN = isbn;
        this.Year = year;
        this.Edicion = edicion;
        this.Idioma = idioma;
        this.Titulo = titulo;
        this.Editorial = editorial;
        this.Autor = autor;
        this.Categoria = categoria;
        this.Propietario=propietaario;
    }

    public int getPropietario() {
        return Propietario;
    }

    public void setPropietario(int Propietario) {
        this.Propietario = Propietario;
    }
    

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


public class EditarUsuario extends Data{
   int carnet;
    String nombre, apellido, carrera, password;

    public EditarUsuario(int carnet, String nombre, String apellido, String carrera, String password) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.password = password;
        this.tipo="\t\t{\n\t\t\t\"EDITAR_USUARIO\" :\n\t\t\t{\n\t\t\t\t\t";
    }
    
    @Override
    public String graficar() {
        String cadena=tipo;
        cadena+="\"Carnet\": "+carnet+",\n\t\t\t\t\t";
        cadena+="\"Nombre\": \""+nombre+"\",\n\t\t\t\t\t";
        cadena+="\"Apellido\": \""+apellido+"\",\n\t\t\t\t\t";
        cadena+="\"Carrera\": \""+carrera+"\",\n\t\t\t\t\t";
        cadena+="\"Password\": \""+password+"\"\n\t\t\t\t";
        cadena+="}\n\t\t}\n";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String strintParaHash() {
        String cadena="{\"EDITAR_USUARIO\" :[{";
        cadena+="\"Carnet\": "+carnet+",";
        cadena+="\"Nombre\": "+nombre+",";
        cadena+="\"Apellido\": "+apellido+",";
        cadena+="\"Carrera\": "+carrera+",";
        cadena+="\"Password\": "+password;
        cadena+="}]}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String StringParaGraphviz() {
        String cadena="{EDITAR_USUARIO:\\n";
        cadena+="Carnet: "+carnet+"\\n";
        cadena+="Nombre: "+nombre+"\\n";
        cadena+="Apellido: "+apellido+"\\n";
        cadena+="Carrera: "+carrera+"\\n";
        cadena+="Password: "+password;
        cadena+="\\n}";
        return cadena;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

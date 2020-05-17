
package edd_1s20_py2_201709062;

import Estructuras.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Math.toIntExact;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ActualizarConJson {
    Core auxcore;
    ListaDoble listaBloques;
    public ActualizarConJson(Core cor,ListaDoble listaBlocks){
        this.auxcore=cor;
        this.listaBloques=listaBlocks;
    }
    
    public void actualizarRed(String recibido){
        JSONParser parser = new JSONParser();
        List<Data> l=new LinkedList();
        //System.out.println(recibido);
        try {
            Object jsonrecived=parser.parse(recibido);
            JSONObject json=(JSONObject) jsonrecived;
            Long index=(Long) json.get("INDEX");
            String timestamp=(String) json.get("TIMESTAMP");
            Long nonce=(Long) json.get("NONCE");
            JSONArray datas=(JSONArray)json.get("DATA");
            String prevHash=(String) json.get("PREVIOSHASH");
            String curHash=(String) json.get("HASH");
            Iterator<JSONObject> acciones=datas.iterator();
            while(acciones.hasNext()){
                JSONObject dat =(JSONObject)acciones.next();
                if(dat.keySet().contains("CREAR_USUARIO")){
                    JSONObject auxjson=(JSONObject)dat.get("CREAR_USUARIO");
                    Long carnet=(Long) auxjson.get("Carnet");
                    String nombre=(String)auxjson.get("Nombre");
                    String apellido=(String)auxjson.get("Apellido");
                    String carrera=(String)auxjson.get("Carrera");
                    String password=(String)auxjson.get("Password");
                    auxcore.tabla.add(Math.toIntExact(carnet), nombre, apellido, carrera, password);
                    l.add(new CrearUsuario(toIntExact(carnet), nombre, apellido, carrera, password));
                }else if(dat.keySet().contains("EDITAR_LIBRO")){
                    JSONObject auxjson=(JSONObject)dat.get("EDITAR_LIBRO");
                    String categoria=(String)auxjson.get("Categoria");
                    NodoAVL existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
                    if(existeCategori!=null){
                        Long Isbn=(Long)auxjson.get("ISBN");
                        Long ano=(Long)auxjson.get("Año");
                        String idiom=(String)auxjson.get("Idioma");
                        String titu=(String)auxjson.get("Titulo");
                        String edito=(String)auxjson.get("Editorial");
                        String aut=(String)auxjson.get("Autor");
                        Long edici=(Long)auxjson.get("Edicion");
                        String cate=(String)auxjson.get("Categoria");
                        Libro existeLibro=existeCategori.getArbolb().buscar(toIntExact(Isbn));
                        if(existeLibro!=null){
                            existeLibro.setYear(toIntExact(ano));
                            existeLibro.setIdioma(idiom);
                            existeLibro.setTitulo(titu);
                            existeLibro.setEditorial(edito);
                            existeLibro.setAutor(aut);
                            existeLibro.setEdicion(toIntExact(edici));
                            existeLibro.setCategoria(cate);
                            l.add(new EditarLibro(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), categoria));
                        }else{
                            System.out.println("El libro no existe");
                        }
                    }
                }else if(dat.keySet().contains("BORRAR_USUARIO")){
                    JSONObject auxjson=(JSONObject)dat.get("EDITAR_USUARIO");
                    Long carnet=(Long) auxjson.get("Carnet");
                    auxcore.eliminarUsuario(toIntExact(carnet));
                    l.add(new BorrarUsuario(toIntExact(carnet)));
                } else if(dat.keySet().contains("EDITAR_USUARIO")){
                    JSONObject auxjson=(JSONObject)dat.get("EDITAR_USUARIO");
                    Long carnet=(Long) auxjson.get("Carnet");
                    String nombre=(String)auxjson.get("Nombre");
                    String apellido=(String)auxjson.get("Apellido");
                    String carrera=(String)auxjson.get("Carrera");
                    String password=(String)auxjson.get("Password");
                    auxcore.editarUsuario(toIntExact(carnet), nombre, apellido, carrera, password);
                    l.add(new EditarUsuario(toIntExact(carnet), nombre, apellido, carrera, password));
                }else if(dat.keySet().contains("ELIMINAR_LIBRO")){
                    JSONObject auxjson=(JSONObject)dat.get("ELIMINAR_LIBRO");
                    Long isbn=(Long) auxjson.get("ISBN");
                    String categoria=(String)auxjson.get("Categoria");
                    String titu=(String)auxjson.get("Titulo");
                    auxcore.borrarLibro(auxcore.arbolAVL.root, categoria,toIntExact(isbn));
                    l.add(new BorrarLibro(toIntExact(isbn), titu, categoria));
                }else if(dat.keySet().contains("ELIMINAR_CATEGORIA")){
                    JSONObject auxjson=(JSONObject)dat.get("ELIMINAR_CATEGORIA");
                    String categoria=(String)auxjson.get("NOMBRE");
                    auxcore.arbolAVL.borrar(auxcore.arbolAVL.root, categoria);
                    l.add(new BorrarCategoria(categoria));
                }else if(dat.keySet().contains("CREAR_LIBRO")){
                    JSONObject auxjson=(JSONObject)dat.get("CREAR_LIBRO");
                    String categoria=(String)auxjson.get("Categoria");
                    NodoAVL existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
                    if(existeCategori==null){
                        auxcore.arbolAVL.root=auxcore.arbolAVL.insertar(auxcore.arbolAVL.root, categoria, EDD_1S20_PY2_201709062.curSession);
                        existeCategori=auxcore.arbolAVL.getOwner(auxcore.arbolAVL.root, categoria);
                        Long Isbn=(Long)auxjson.get("ISBN");
                        Long ano=(Long)auxjson.get("Año");
                        String idiom=(String)auxjson.get("Idioma");
                        String titu=(String)auxjson.get("Titulo");
                        String edito=(String)auxjson.get("Editorial");
                        String aut=(String)auxjson.get("Autor");
                        Long edici=(Long)auxjson.get("Edicion");
                        Long propie=(Long)auxjson.get("Propietario");
                        String cate=(String)auxjson.get("Categoria");
                        existeCategori.getArbolb().insertar(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate,toIntExact(propie));
                        l.add(new CrearLibro(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate, toIntExact(propie)));
                    }else{
                        Long Isbn=(Long)auxjson.get("ISBN");
                        Long ano=(Long)auxjson.get("Año");
                        String idiom=(String)auxjson.get("Idioma");
                        String titu=(String)auxjson.get("Titulo");
                        String edito=(String)auxjson.get("Editorial");
                        String aut=(String)auxjson.get("Autor");
                        Long edici=(Long)auxjson.get("Edicion");
                        String cate=(String)auxjson.get("Categoria");
                        Long propie=(Long)auxjson.get("Propietario");
                        Libro existeLibro=existeCategori.getArbolb().buscar(toIntExact(Isbn));
                        if(existeLibro==null){
                            existeCategori.getArbolb().insertar(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate, toIntExact(propie));
                            l.add(new CrearLibro(toIntExact(Isbn), toIntExact(ano), idiom, titu, edito, aut, toIntExact(edici), cate, toIntExact(propie)));
                        }else{
                            System.out.println("El libro ya existe");
                        }
                    }
                }else if(dat.keySet().contains("CREAR_CATEGORIA")){
                    JSONObject auxjson= (JSONObject)dat.get("CREAR_CATEGORIA");
                    String categoria=(String)auxjson.get("NOMBRE");
                    Long propietario=(Long) auxjson.get("propietario");
                    auxcore.arbolAVL.insertar(auxcore.arbolAVL.root, categoria, Math.toIntExact(propietario));
                    l.add(new CrearCategoria(categoria, toIntExact(propietario)));
                }
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(timestamp, formatter);
            Boque b=new Boque(toIntExact(index), dateTime, toIntExact(nonce), l, prevHash, curHash);
            b.mostrarString();
            listaBloques.insert(b);
            EDD_1S20_PY2_201709062.indexBloque++;
        } catch (ParseException ex) {
            Logger.getLogger(ActualizarConJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private boolean checkNonce(Long index,String timestamp,Long nonce,JSONArray data,String prevhash,String curhash){
        StringBuilder s=new StringBuilder();
        s.append(index).append(timestamp).append(nonce).append(data.toJSONString()).append(prevhash);
        String hash=getSHA256Hash(s.toString());
        if(hash!=null){
            if(hash.substring(0, 4).equals("0000"))
                return true;
        }
        return false;
    }
    private String getSHA256Hash(String data) {
        String result = null;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes("UTF-8"));
            return DatatypeConverter.printHexBinary(hash); // make it printable
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
    public void actualizarDirectorio(){
        String content = null;
        int i=0;
        final File folder = new File("./BloquesJson");
        for (final File fileEntry : folder.listFiles()) {
            //System.out.println(fileEntry);
            if (fileEntry.isFile()) {
                FileReader reader=null;
                try {
                    reader=new FileReader(fileEntry);
                    char[] chars = new char[(int) fileEntry.length()];
                    reader.read(chars);
                    content = new String(chars);
                    reader.close();
                    actualizarRed(content);
                    System.out.println(i);
                    i++;
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ActualizarConJson.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(ActualizarConJson.class.getName()).log(Level.SEVERE, null, ex);
                }finally{
                    if(reader!=null){
                        try {
                            reader.close();
                        } catch (IOException ex) {
                            Logger.getLogger(ActualizarConJson.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }else{
                System.out.println("Es un direcctorio");
            }
        }
        
    }
}

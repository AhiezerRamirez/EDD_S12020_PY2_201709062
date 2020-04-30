
package Estructuras;

public class NodoHash {
    int key;
    public Usuario user;
    ListaSimple value;
    NodoHash next;
    public NodoHash(int llave,Usuario us){
        this.key=llave;
        this.user=us;
        this.value=new ListaSimple();
        this.next=null;
    }

    public void insertar(Usuario user){
        this.value.insertar(user);
    }
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    

    public NodoHash getNext() {
        return next;
    }

    public void setNext(NodoHash next) {
        this.next = next;
    }
    
}

class ListaSimple{
    NodoLista primero;
    NodoLista ultimo;
    public ListaSimple() {
        this.primero=null;
        this.ultimo=null;
    }
    public void insertar(Usuario val){
        NodoLista n=new NodoLista(val);
        if(primero==null){
            primero=n;
            ultimo=n;
        }else{
            ultimo.siguiente=n;
            ultimo=n;
        }
    }
    Usuario buscar(int carne){
        NodoLista aux=primero;
        while (aux!=null) {            
            if(aux.value.carne==carne)
                return aux.value;
            aux=aux.siguiente;
        }
        return null;
    }
    public void borrar(int carne){
        if(primero ==null){
            System.out.println("Lista está vacía");
        }else if(primero==ultimo){
            ultimo=primero=null;
        }else if(primero.value.carne==carne){
            NodoLista aux = primero;
            primero=primero.siguiente;
            aux.siguiente=null;
        }else if(ultimo.value.carne==carne){
            NodoLista aux=primero;
            NodoLista aux2=aux;
            while (aux.siguiente!=null) {                
                aux2=aux;
                aux=aux.siguiente;
            }
            ultimo=aux2;
            aux2.siguiente=null;
        }else{
            NodoLista aux=primero;
            NodoLista aux2;
            while (aux.siguiente!=null) {                
                aux2=aux;
                aux=aux.siguiente;
                if(aux.value.carne==carne){
                    aux2.siguiente=aux.siguiente;
                }
            }
            
        }
    }
    public void modificar(int carne,String Nombre, String Apellido,String Carrera, String Password){
        NodoLista aux=primero;
        while (aux!=null) {            
            if(aux.value.carne==carne){
                aux.value.setNombre(Nombre);
                aux.value.setApellido(Apellido);
                aux.value.setCarrera(Carrera);
                aux.value.setPassword(Password);
            }
        }
    }  
    public String declararNodos(){
        StringBuilder c=new StringBuilder();
        NodoLista aux=primero;
        while (aux!=null) {            
            c.append("nodo").append(aux.value.carne).append("[label=\"").append(aux.value.carne).append("\\n").
            append(aux.value.nombre).append(" ").append(aux.value.apellido).append(" \"];\n\t");
            aux=aux.siguiente;
        }
        return c.toString();
    }
    public String graficar(){
        StringBuilder c=new StringBuilder();
        
        NodoLista aux=primero;
        while (aux!=ultimo) {            
            c.append("nodo").append(aux.value.carne).append(" -> ");
            aux=aux.siguiente;
        }
        if(aux!=null)
            c.append("nodo").append(aux.value.carne).append("\n\t");
        return c.toString();
    }
}

class NodoLista{
    NodoLista siguiente;
    Usuario value;
    public NodoLista(Usuario val){
        this.value=val;
        this.siguiente=null;
    }
}

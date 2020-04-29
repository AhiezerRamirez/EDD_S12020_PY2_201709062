
package Estructuras;
public class TablaHash {
    public NodoHash[] nodo;
    private final int size;
    public TablaHash(int size){
        this.size=size;
        this.nodo=new NodoHash[size];
    }
    private int hashFuncion(int carne){
        return carne % size;
    }
    public void add(int car,String Nombre, String Apellido,String Carrera, String Password){
        Usuario u=new Usuario(car, Nombre, Apellido, Carrera, Password);
        int index =hashFuncion(car);
        NodoHash prev=null;
        NodoHash entrada=nodo[index];
        while (entrada!=null && entrada.user.carne!=car) {            
            prev=entrada;
            entrada=entrada.getNext();
        }
        if(entrada==null){
            NodoHash n=new NodoHash(car, u);
            nodo[index]=n;
            if(prev !=null){
                prev.setNext(n);
            }
        }else{
            entrada.value.insertar(u);
        }
    }
    public void remove(int carne){
        int index=hashFuncion(carne);
        NodoHash entrada=nodo[index];
        if(entrada==null){
            System.out.println("Usuario no encontrado");
        }else{
            if(entrada.user.carne==carne){
                if(entrada.value.primero!=null){
                    nodo[index].user=entrada.value.primero.value;
                    entrada.value.borrar(nodo[index].user.getCarne());
                }else{
                    nodo[index]=null;
                }
            }else{
                entrada.value.borrar(carne);
            }
        }
    }
    
    
    public String obetnerCodDot(){
        StringBuilder s=new StringBuilder();
        s.append("digraph G {\n\tnodesep=.05;\n\trankdir=LR;\n\tnode [shape=record,width=.1,height=.1];\n\t");
        s.append("nodo0[label = \"");
        int i;
        for ( i = 0; i < nodo.length-1; i++) {
            
            if(nodo[i]!=null){
                s.append("<f").append(i+1).append("> clave: ").append(i+1).append(" |");
            }else{
                s.append("<f").append(i+1).append(">|");
            }
        }
        if(nodo[i]!=null){
                s.append("<f").append(i+1).append("> clave: ").append(i+1).append("\",height=2.5];\n\tnode [width = 1.5];\n\t");
            }else{
                s.append("<f").append(i+1).append(">|\",height=2.5];\n\tnode [width = 1.5];\n\t");
            }
        for ( i = 0; i < nodo.length; i++) {
            if(nodo[i]!=null){
                s.append("nodo").append(nodo[i].user.carne).append("[label = \"{<n> |").append(nodo[i].user.carne).append("\\n").
                append(nodo[i].user.nombre).append(" ").append(nodo[i].user.apellido).append(" |<p> }\"];\n\t");
                if(nodo[i].value.primero!=null){
                    s.append(nodo[i].value.declararNodos());
                }
            }
        }
        for ( i = 0; i < nodo.length; i++) {
            if(nodo[i]!=null){
                s.append("nodo0:f").append(i+1).append(" -> nodo").append(nodo[i].user.carne).append(":n;\n\t");
                if(nodo[i].value.primero!=null){
                    s.append("nodo").append(nodo[i].user.carne).append(" -> ").append(nodo[i].value.graficar());
                }
            }
        }
        s.append("}");
        return s.toString();
    }
}

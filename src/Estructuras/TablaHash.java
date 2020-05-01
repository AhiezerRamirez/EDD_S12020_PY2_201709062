
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
        //while (entrada!=null && entrada.user.carne!=car) {            
          //  prev=entrada;
            //entrada=entrada.getNext();
        //}
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
        System.out.println(index);
        if(entrada==null){
            System.out.println("Usuario: "+carne+" no encontrado");
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
    public void updateUser(int car,String Nombre, String Apellido,String Carrera, String Password){
        int index=hashFuncion(car);
        NodoHash entrada=nodo[index];
        if(entrada!=null){
            if(entrada.user.carne==car){
                entrada.user.setNombre(Nombre);
                entrada.user.setApellido(Apellido);
                entrada.user.setCarrera(Carrera);
                entrada.user.setPassword(Password);
            }else{
                Usuario auxuser=entrada.value.buscar(car);
                if(auxuser!=null){
                    auxuser.setNombre(Nombre);
                    auxuser.setApellido(Apellido);
                    auxuser.setCarrera(Carrera);
                    auxuser.setPassword(Password);
                }else{
                    System.out.println("Usuario:"+car+" no encontrado");
                }
            }
        }else{
            System.out.println("Usuario: "+car+" no encontrado");
        }
    }
    public Usuario buscar(int car,String pass){
        int index=hashFuncion(car);
        NodoHash entrada=nodo[index];
        if(entrada!=null){
            if(entrada.user.carne==car && pass.equals(entrada.user.getPassword())){
                return entrada.user;
            }else{
                Usuario auxuser=entrada.value.buscar(car);
                if(auxuser!=null){
                    if(auxuser.password.equals(pass))
                        return auxuser;
                    else
                        return null;
                }else{
                    System.out.println("Usuario:"+car+" no encontrado");
                    return null;
                }
            }
        }else{
            System.out.println("Usuario: "+car+" no encontrado");
            return null;
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

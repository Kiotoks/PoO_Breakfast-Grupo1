package breakfast;
public class Cliente {
    private String nombre;
    
    public Cliente(String n){
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mostrarCliente(){
       return "El nombre del cliente es: "+ this.nombre;
    }
    
}

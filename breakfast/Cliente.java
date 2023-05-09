package breakfast;
public class Cliente {
    private String nombre;
    private int numeroCli;
    
    public Cliente(String n, int num){
        this.nombre = n;
        this.numeroCli= num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCli() {
        return numeroCli;
    }

    public void setNumeroCli(int numeroCli) {
        this.numeroCli = numeroCli;
    }
    
    public String mostrarCliente(){
       return "El nombre del cliente es: "+ this.nombre + ", su numero es: " + this.numeroCli;
    }
    
}

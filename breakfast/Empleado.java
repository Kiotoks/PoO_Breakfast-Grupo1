package breakfast;

public class Empleado {
    private String nombre;
    private double sueldoBasico;
    
    public Empleado(String n, double s){
        this.nombre = n;
        this.sueldoBasico = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    public String mostrarEmpleado(){
        return "Nombre del empleado: " + this.nombre + ", sueldo basico: " + this.sueldoBasico;
    }
}

package breakfast;

import java.util.ArrayList;

public class Pedido {
    private Cliente cli;
    private Empleado emple;
    private ArrayList<Desayuno> desayunos;
    
    public Pedido(Cliente c, Empleado e, ArrayList<Desayuno> d){
        this.cli = c;
        this.emple = e;
        this.desayunos = d;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Empleado getEmple() {
        return emple;
    }

    public void setEmple(Empleado emple) {
        this.emple = emple;
    }

    public ArrayList<Desayuno> getDesayunos() {
        return desayunos;
    }

    public void setDesayunos(ArrayList<Desayuno> desayunos) {
        this.desayunos = desayunos;
    }
    
    public void agregarDeyasuno(Desayuno d){
        desayunos.add(d);
    }
    
    public void imprimirPedido(){
        String datos;
        datos = this.emple.mostrarEmpleado() +"\n"+ this.cli.mostrarCliente()+ "\n";
        for (Desayuno desayuno : desayunos) {
            datos += desayuno.mostrarDesayuno() + "\n";
        }
        System.out.println(datos);
    }
    
}

package breakfast;

import java.util.ArrayList;

public class Breakfast {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Javier");
        Empleado emp1 = new Empleado("Jesus", 150000);
        
        String[] ingredientes = new String[2];
        ingredientes[0] = "macucas";
        ingredientes[1] = "vodka";
        
        int numeroDesa = 1;
        
        Desayuno des1 = new Desayuno(ingredientes,22, numeroDesa);
        
        if (numeroDesa == 11){
            numeroDesa = 1;
        }
        else{
        numeroDesa ++;
        }
        ArrayList<Desayuno> desayunos = new ArrayList();
        desayunos.add(des1);
        Pedido ped = new Pedido(cli1, emp1, desayunos);
        ped.imprimirPedido();
    }
    
}

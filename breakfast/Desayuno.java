package breakfast;
public class Desayuno {
    private String[]ingredientes;
    private double precio;
    private int num;
    
            
    public Desayuno(String[]i, double p, int n) {
       this.ingredientes = i;
       this.precio = p;
       this.num =n;
       
       if(num == 11){
           precio = 0;
       }
    }

    public String[] getIngrediente() {
        return ingredientes;
    }

    public void setIngrediente(String[] ingrediente) {
        this.ingredientes = ingrediente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String mostrarDesayuno(){
        String datos = "Igredeientes: ";
        for (String ingrediente : ingredientes) {
            datos += ingrediente + ", ";
        }
        datos += "precio: "+ precio;
        datos += ", numero: "+ num;
        return datos;
    } 
}

public class TarjetaPlata extends TarjetaCine {
    //Atributos
    private int  cantidadVisitas =0;
    private boolean elegibleOro = false;

    //Constructor
    public TarjetaPlata(String idTarjeta, String nombreCompleto, String email, String telefono, int edad) {
      
       super(idTarjeta, nombreCompleto, email, telefono, edad, 10);
    }



    //Getters y Setters
    public int getCantidadVisitas() {
        return cantidadVisitas;
    }

    public void setCantidadVisitas(int cantidadVisitas) {
        this.cantidadVisitas = cantidadVisitas;
    }

    public boolean isElegibleOro() {
        return elegibleOro;
    }

    public void setElegibleOro(boolean elegibleOro) {
        this.elegibleOro = elegibleOro;
    }
    
    
    //Método
    @Override
    public double pagar(String[] cuenta){
        this.cantidadVisitas ++;
        if(this.cantidadVisitas == 5){
            this.elegibleOro = true;
        }
        return super.pagar(cuenta);
    }
}
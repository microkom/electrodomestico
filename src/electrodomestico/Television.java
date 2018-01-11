
package electrodomestico;

public class Television extends Electrodomestico{
    public static final int PULGADAS_DEFECTO=20;
    public static final boolean TDT_DEFECTO=false;
    
    private int resolucion;
    private boolean tdt;
    
    public Television(){
        super();
        this.resolucion=PULGADAS_DEFECTO;
        this.tdt=TDT_DEFECTO;
    }
    public Television(double precioBase, double peso){
        super(precioBase, peso);
        this.resolucion=PULGADAS_DEFECTO;
        this.tdt=TDT_DEFECTO;
    }
    public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean tdt){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion=pulgadas;
        this.tdt=tdt;
    }
    public int getResolucion(){
        return this.resolucion;
    }
    public boolean getTdt(){
        return this.tdt;
    }
    
    public double precioFinal(){
        double precio=0;
        if(this.resolucion>40) precio=this.precioFinal()*1.3;
        if(this.tdt==true) precio+=50;
        return precio;
    }
}

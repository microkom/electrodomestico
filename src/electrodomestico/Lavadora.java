
package electrodomestico;

public class Lavadora extends Electrodomestico{
    
    public static final int CARGA_DEFECTO=5;
    
    private int carga;
    
    public Lavadora(){
        super();
        this.carga=CARGA_DEFECTO;
    }
    public Lavadora(double precioBase, double peso){
        super(precioBase, peso);
        this.carga=CARGA_DEFECTO;
    }
    
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
    }
    
    public int getCarga(){
        return this.carga;
    }
    
    public double precioFinal(){
        double precio=0;
        if (this.carga>30) precio=this.precioFinal()+50;
        return precio;
    }
}

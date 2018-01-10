package electrodomestico;
public class Electrodomestico {
    
    public static final double PRECIO_DEFECTO=100;
    public static final String COLOR_DEFECTO="Blanco";
    public static final char CONS_ENER_F='F';
    public static final double PESO_DEFECTO=5;
    
    
    //Sus atributos son precioBase, color, consumo energético (letras entre A y F) y peso.
    private double precioBase;
    private String color;
    private char consumoEnergetico; //{'A','B','C','D','E','F'};
    private double peso;
    
    //Indica que se podrán heredar.
    
    
    /* Por defecto, el color será blanco, el consumo energético será F, el
    precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.*/
    //Un constructor por defecto
    public Electrodomestico(){
        this.precioBase=PRECIO_DEFECTO;
        this.color=COLOR_DEFECTO;
        this.consumoEnergetico=CONS_ENER_F;
        this.peso=PESO_DEFECTO;
    }
    //Un constructor con el precio y peso. El resto por defecto.
    public Electrodomestico(double precioBase, double peso){
        this.precioBase=precioBase;
        this.color=COLOR_DEFECTO;
        this.consumoEnergetico=CONS_ENER_F;
        this.peso=peso;
    }
    //Un constructor con todos los atributos.
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso){
        this.precioBase=precioBase;
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
        this.peso=PESO_DEFECTO;
    }
    
    //Métodos get de todos los atributos.
    public double getPrecioBase(){return this.precioBase;}
    public String getColor(){return this.color;}
    public char getConsumoEnergetico(){return this.consumoEnergetico;}
    public double getPeso(){return this.peso;}

//Los colores disponibles son blanco, negro, rojo, azul y gris. No
//importa si el nombre está en mayúsculas o en minúsculas.
    
    /* comprobarConsumoEnergetico(char letra): comprueba que la letra es 
    correcta, sino es correcta usara la letra por defecto. Se invocara al crear 
    el objeto y no será visible.    */
    private void comprobarConsumoEnergetico(char letra){
        boolean consumo=false;
        switch(letra){
            case 'a':case 'A':
            case 'b':case 'B':
            case 'c':case 'C':
            case 'd':case 'D':
            case 'e':case 'E':
            case 'f':case 'F':
               consumo=true;break;
            default: consumo=false;
        }
        if (consumo==false){
            this.consumoEnergetico='F';
        }
    }
        /*
   
    
o comprobarColor(String color): comprueba que el color es
correcto, sino lo es usa el color por defecto. Se invocara al
crear el objeto y no será visible.
o precioFinal(): según el consumo energético, aumentara su
precio, y según su tamaño, también. Esta es la lista de precios:
    */
}

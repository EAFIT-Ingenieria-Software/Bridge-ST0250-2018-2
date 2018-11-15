
/**
 * Concrete Implementor
 * Define la acción que se ejecuta al encender un ventilador
 */
public class Ventilador implements Device
{
    String ubicacion;
    public Ventilador(String ubicacionVentilador){
        ubicacion = ubicacionVentilador;
    } 
    
    public void turnOn(){
        System.out.println("El ventilador ubicado en " + this.ubicacion + " fue encendido");
    }
}

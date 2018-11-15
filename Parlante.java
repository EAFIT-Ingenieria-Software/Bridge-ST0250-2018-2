
/**
 * Concrete Implementor
 * Define la acción que se ejecuta al encender un parlante
 */
public class Parlante implements Device
{
    String ubicacion;
    public Parlante(String ubicacionParlante){
        ubicacion = ubicacionParlante;
    }
    
    public void turnOn(){
        System.out.println("El parlante ubicado en " + this.ubicacion + " fue encendido");
    }
}

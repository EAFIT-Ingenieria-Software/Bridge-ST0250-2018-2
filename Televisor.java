
/**
 * Concrete Implementor
 * Define la acción que se ejecuta al encender un televisor
 */
public class Televisor implements Device
{
    String ubicacion;
    public Televisor(String ubicacionTv){
        ubicacion = ubicacionTv;
    }
    
    public void turnOn(){
        System.out.println("El televisor ubicado en " + this.ubicacion + " fue encendido");
    }
}

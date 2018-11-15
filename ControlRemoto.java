
/**
 * Concrete Abstraction / Refined Abstraction
 * Clase que determina a que dispositivo se está aplicando la abstracción
 */
public class ControlRemoto extends Switch
{
    public ControlRemoto(Device d){
        this.device = d;
    }
    
    public void turnOnButtonPressed(){
        device.turnOn();
    }
}

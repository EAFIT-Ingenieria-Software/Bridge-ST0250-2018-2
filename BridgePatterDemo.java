
/**
 * Clase que llama a todas las clases involucradas en el patrón Bridge
 */
public class BridgePatterDemo
{
    public static void main(String args[]){
        Device tv = new Televisor("la sala");
        Device ventilador = new Ventilador("la habitación principal");
        Device parlante = new Parlante("el estudio");
        Device tv2 = new Televisor("la habitación principal");
        
        Switch sTv = new ControlRemoto(tv);
        Switch sVentilador = new ControlRemoto(ventilador);
        Switch sParlante = new ControlRemoto(parlante);
        Switch sTv2 = new ControlRemoto(tv2);
        
        sTv.turnOnButtonPressed();
        sParlante.turnOnButtonPressed();
        sTv2.turnOnButtonPressed();
        sVentilador.turnOnButtonPressed();
    }
}

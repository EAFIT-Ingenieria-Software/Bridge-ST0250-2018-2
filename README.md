# Bridge
Separa una abstracción de su implementación para que ambos puedan variar independientemente. A diferencia del patrón Adapter, considera como las interfaces son implementadas, en este sentido asocia abstracción y sus potenciales implementaciones.

## Integrantes
- Isabela Muriel
- Juan Jose Parra
- Luisa María Vásquez

## Ejemplo
En una casa hay varios dispositivos, se desea que cada dispositivo sea encendido por un control remoto especifico. Una implementación típica para este problema sería crear una clase abstracta Dispositivo, y cada una de las subclases (cada dispositivo) tendrá una clase ControlRemoto.

Entonces, si por ejemplo se tienen tres dispositivos, un televisor, un ventilador y un parlante, cada uno de estos tendrá una subclase ControlRemoto que lo controle. Esta implementación funciona bien, sin embargo, al momento de extender o modificar el código lo hace muy complicado debido a que todo es altamente acoplado, por lo que, si se quisieran tener n dispositivos, será necesario crear n clases ControlRemoto. Además, con esta solución habrá mucha repetición de código, ya que los controles funcionan igual, lo único que cambia es el dispositivo que controla.

Lo que se busca con el patrón de diseño Bridge es desacoplar la abstracción de la implementación para así poder extender o modificar el código fácilmente.

Volviendo al ejemplo, la manera correcta de aplicar el patrón de diseño es tener una clase Switch como la abstracción y una clase ControlRemoto como la abstracción refinada, asociado con estos se tiene la interfaz Dispositivo y su implementación de clases concretas, es decir cada dispositivo especifico (Televisor, Ventilador, Parlante).

De esta manera es posible que cada dispositivo sea controlado por el control remoto que se desee sin necesidad de crear muchas clases nuevas, simplemente hay que crear una instancia de ControlRemoto y asignarle el dispositivo que este controla.

## Modelo de Clases

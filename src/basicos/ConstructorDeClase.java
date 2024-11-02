/**
 * Los constructores se usan principalmente para inicializar atributos
 * Son especialmente importantes cuando es fundamental que se inicialicen los atributos de nuestra clase
 */
package basicos;

public class ConstructorDeClase {
    public String saludo;

    /**
     * El constructor debe llamarse igual que la clase y puede o no recibir parámetros
     * cuando asignamos el valor del argumento al atributo de la clase usamos la palabra reservada this
     * this.saludo indica que es el atributo saludo de la instancia
     * mientras que saludo después del = indica que es el parámentro que recibe el constructor
     * El constructor debe ser público ya que se llama al instanciar la clase,
     * de no serlo no se podría crear la instancia
     * Aunque no se defina, todas las clases tienen un constructor por defecto que no recibe argumentos
     * @param String saludo
     */
    public ConstructorDeClase(String saludo) {
        this.saludo = saludo;
    }

    public static void main(String[] args) {
        ConstructorDeClase saludar = new ConstructorDeClase("Hola blonder");
        System.out.println(saludar.saludo);
    }
}

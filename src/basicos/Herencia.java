/**
 * La herencia permite que una clase comparta sus atributos y métodos con otras clases que hereden de ella
 * Solo es posible heredar de una Clase, la herencia múltiple no está permitida
 * Las clases que heredan se les llama clase hija y la clase heredada clase padre
 * Es posible herencia en cascada, es decir, una clase tener una clase padre y la padre a su vez heredar de otra
 */

package basicos;

public class Herencia {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        // aunque Cliente no posee el atributo nombre ni el método getCliente lo puede acceder de su clase padre
        c.nombre = "Claire";
        System.out.println(c.getNombre());
    }
}

class PersonaHerencia {
    public String nombre = "Jill";

    public String getNombre() {
        return this.nombre;
    }
}

class Cliente extends PersonaHerencia {}

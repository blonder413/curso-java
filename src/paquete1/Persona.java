/**
 * Los paquetes permiten ordenar nuestros proyectos
 * No podemos tener dos clases con el mismo nombre en el mismo paquete
 * pero si podemos tener clases con el mismo nombre si están en diferentes paquetes
 */
package paquete1;

/**
 * El modificador de acceso public permite que la clase sea llamada desde cualquier parte
 * de nuestro proyecto, incluyendo desde otros módulos
 * los modificadores de acceso pueden aplicarse también a atributos y métodos
 */
public class Persona {
    public String nombre = "Sin Nombre";
}


// Para llamar a la clase dentro de otro archivo debemos importarla primero
//import paquete1.Persona
//Persona p = new Persona();

// podemos acceder a los atributos públicos desde la instancia
//p.nombre = 'Jill Valentine';

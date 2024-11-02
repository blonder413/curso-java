/**
 * Inyección de dependencias
 * Los métodos pueden retornar cualquier tipo de valor, desde valores primitivos hasta la instancia de la propia clase
 * o una instanicia de otra clase
 */
package basicos;

public class Metodos {

    public String saludo = "";

    /**
     * Los métodos pueden retornar una instancia de un objeto,
     * de esta forma se pueden anidar métodos. Ej: obj.metodo1().metodo2()
     * @return
     */
    public Metodos saludar()
    {
        this.saludo = "Hola Blonder";
        return this;
    }

    public Persona getPersona()
    {
        Persona p = new Persona();
        return p;
    }

    public static void main(String[] args) {
        Metodos m = new Metodos();
        System.out.println(m.saludar().saludo);
        System.out.println(m.getPersona().setNombre().nombre);
    }
}

class Persona{
    public String nombre = "";
    public Persona setNombre()
    {
        this.nombre = "Claire Redfield";
        return this;
    }
}
public class Atributos {
    /**
     * Los atributos son variales que se crean dentro de la clase
     * Sirven para dar características a nuestros objetos
     * Cada instancia de la clase tendrá su propio valor para cada atributo
     */
    public String nombre = "Sin Nombre";

    public String saludar()
    {
        return "hola mundo";
    }
}

Atributos atr = new Atributos();

// podemos acceder a los atributos a través del punto
atr.nombre;

// igualmente podemos acceder a los métodos públicos
atr.saludar();

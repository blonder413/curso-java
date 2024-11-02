/**
 * Un método se puede volver a definir siempre y cuando su firma (parámetros) sea diferente
 */
package basicos;

public class Sobrecarga {
    public String saludo;

    public Sobrecarga(){
        this.saludo = "Hola Blonder";
    }

    /**
     * Sobrecargamos el constructor agregándole un parámetro de tipo String
     * @param saludo
     */
    public Sobrecarga(String saludo)
    {
        this.saludo = saludo;
    }

    public static void main(String[] args) {
        /*
        Cuando instanciamos la clase podemos dedidir cuál de los constructores deseamos invocar
         */
        Sobrecarga obj1 = new Sobrecarga();
        System.out.println(obj1.saludo);
        Sobrecarga obj2 = new Sobrecarga("Buenas Blonder");
        System.out.println(obj2.saludo);
    }
}

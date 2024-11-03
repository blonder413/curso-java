/**
 * Las clases abstractas permiten definiar clases que no deban ser instancias y que solo contengan reglas
 * (métodos obligatorios) para las clases que las hereden
 */
package basicos;

public abstract class Abstracto {
    /**
     * si se define un método abstracto la clase debe ser abstracta
     * los métodos abstractos no deben tener implementación, solo la firma
     */
    public abstract void saludar();
}

/**
 * si una clase hereda de una clase abstracta debe implementar los métodos definidos
 */
class AbstractoHijo extends Abstracto{
    @Override
    public void saludar() {
        System.out.println("Hola blonder");
    }

    public static void main(String[] args) {
        AbstractoHijo hijo = new AbstractoHijo();
        hijo.saludar();
    }
}

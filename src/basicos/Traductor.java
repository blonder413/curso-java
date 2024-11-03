/**
 * Las interfaces definen firmas de métodos que luego tienen que ser sobreescritos por las clases que las implementen
 * Java no permite herencia múltiple. Sin embargo, se pueden implementar varias interfaces
 */
package basicos;

public interface Traductor {
    /**
     * Los métodos por defecto son públicos y abstractos
     * no llevan cuerpo, solo firma
     */
    void traducir();
}

class InglesInterfaz implements Traductor {

    @Override
    public void traducir() {
        System.out.println("Traduce");
    }

    public static void main(String[] args) {
        InglesInterfaz i = new InglesInterfaz();
        i.traducir();
    }
}

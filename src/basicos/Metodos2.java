package basicos;

public class Metodos2 {
    /**
     * Si usamos ... podemos llamar al método usando un número variable de argumentos
     */
    void sumar(int... numeros)
    {
        for (int numero : numeros) {
            System.out.print(numero + " - ");
        }
    }
    public static void main(String[] args) {
        Metodos2 m = new Metodos2();
        m.sumar(1,2,3,4);
    }
}

public class Metodos {
    /**
     * Los métodos puede retornar valores que deben ser luego procesados
     * Debe definirse el tipo de datos que va a regresar
     * @return String
     */
    String saludar()
    {
        return "Hola mundo";
    }

    /**
     * Los métodos pueden recibir parámetros para hacer algo con ellos
     * @param int num1
     * @param int num2
     * @return int
     */
    int sumar(int num1, int num2)
    {
        return num1 + num2;
    }

    /**
     * Los métodos tipo void no devuelven valores
     * Se usan para realizar operaciones de las cuales no necesitamos un resultado
     */
    void Procesar()
    {
        int num1 = 4;
        int num2 = 13;
        suma = num1 + num2;
    }
}

Metodos func = new Metodos();
// Para llamar una función ponemos su nombre y ()
saludar();

// En este caso tenemos el valor pero no estamos haciendo nada con él
int suma = func.sumar(4, 13);
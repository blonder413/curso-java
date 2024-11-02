/**
 * Las clases hijas pueden crear métodos iguales a los de su clase padre sobreescribiendo su funcionamiento
 */
package basicos;

public class Sobreescritura {
    public static void main(String[] args) {
        SobreescrituraPadre padre = new SobreescrituraPadre();
        System.out.println(padre.saludar());

        SobreescrituraHija hija = new SobreescrituraHija();
        System.out.println(hija.saludar());
        // aunque la clase hija no tiene el método saludar2 puede usar el de su clase padre
        System.out.println(hija.saludar2());
    }
}

class SobreescrituraPadre{
    public String saludar()
    {
        return "Hola, soy el padre";
    }
    public String saludar2()
    {
        return "Hola, saludos";
    }
}

class SobreescrituraHija extends SobreescrituraPadre{
    public String saludar()
    {
        return "Hola, soy el hijo";
    }
}
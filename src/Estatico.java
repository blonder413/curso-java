/**
 * static es un modificador que permite acceder a variables y métodos de una clase sin necesidad de instanciar un objeto
 * de dicha clase
 */
public class Estatico {

    public static String nombre = "Jill";
    public int edad = 40;

    public String saludar()
    {
        /**
         * Al llamar a edad usamos la palabra reservada this para indicar que pertenece a la instancia actual
         */
        return nombre + " tiene " + this.edad + " años.";
    }
}


/*
 * Cuando queremos llamar al atributo nombre no necesitamos llamar a la instancia
 * El valor estático es compartido por todas las instancias
 */

//Estatico estatico = new Estatico();
//Estatico estatico2 = new Estatico();
//estatico2.edad = 18;
//nombre= 'Juan';
//System.out.println(Estatico.nombre + " tiene " + estatico.edad + " años.");
//System.out.println(Estatico.nombre + " tiene " + estatico2.edad + " años.");
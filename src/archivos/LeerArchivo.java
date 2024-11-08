package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        try{
            // Abrir el archivo para lectura
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));

            // Leer línea a línea
            String linea = entrada.readLine();

            // Leemos todas las líneas
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e);
        }
    }
}

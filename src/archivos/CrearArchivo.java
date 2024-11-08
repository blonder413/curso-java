package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "mi_archivo.txt";
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo existe");
        } else {
            try {
                PrintWriter salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo" + e.getMessage());
                // traza de los errores generados y el detalle
                e.printStackTrace();
            }
        }
    }
}

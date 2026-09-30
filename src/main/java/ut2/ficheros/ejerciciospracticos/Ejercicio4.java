package ut2.ficheros.ejerciciospracticos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Archivo original
        String origen = "logo.png";

        // Archivo donde se guardará la copia
        String destino = "copia_logo.png";

        try {

            // Abrimos el archivo para leerlo
            FileInputStream entrada = new FileInputStream(origen);

            // Creamos el archivo de destino
            FileOutputStream salida = new FileOutputStream(destino);

            int byteLeido;

            // Leemos el archivo byte a byte
            while ((byteLeido = entrada.read()) != -1) {

                // Escribimos cada byte en el archivo de destino
                salida.write(byteLeido);
            }

            // Cerramos los archivos
            entrada.close();
            salida.close();

            System.out.println("La copia se ha realizado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo.");
        }
    }
}
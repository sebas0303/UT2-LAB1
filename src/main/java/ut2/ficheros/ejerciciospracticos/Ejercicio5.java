package ut2.ficheros.ejerciciospracticos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {

    public static void main(String[] args) {

        String nombreArchivo = "quijote.txt";

        int numeroLineas = 0;
        int vecesQuijote = 0;

        try {

            // Abrimos el archivo para leer texto
            FileReader archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);

            String linea;

            // Leemos el archivo línea por línea
            while ((linea = lector.readLine()) != null) {

                // Contamos la línea
                numeroLineas++;

                // Dividimos la línea en palabras
                String[] palabras = linea.split("\\s+");

                // Recorremos las palabras
                for (String palabra : palabras) {

                    // Quitamos algunos signos de puntuación
                    palabra = palabra.replaceAll("[.,;:!?¿¡\"]", "");

                    // Comprobamos si es Quijote
                    if (palabra.equalsIgnoreCase("Quijote")) {
                        vecesQuijote++;
                    }
                }
            }

            lector.close();

            System.out.println("Número total de líneas: " + numeroLineas);
            System.out.println("La palabra Quijote aparece: "
                    + vecesQuijote + " veces.");

        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }
}
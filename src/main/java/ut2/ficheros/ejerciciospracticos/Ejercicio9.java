package ut2.ficheros.ejerciciospracticos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9 {

    public static void main(String[] args) {

        try {

            // Abrimos el archivo
            FileReader archivo = new FileReader("datos_notas.txt");
            BufferedReader lector = new BufferedReader(archivo);

            String linea;

            // Leemos el archivo línea por línea
            while ((linea = lector.readLine()) != null) {

                try {

                    // Intentamos convertir la línea a número
                    double nota = Double.parseDouble(linea);

                    System.out.println("Nota válida: " + nota);

                } catch (NumberFormatException e) {

                    // Si la línea no es un número, la ignoramos
                    System.out.println("Aviso: '" + linea
                            + "' no es una nota válida. Se ignora.");

                }
            }

            lector.close();

        } catch (IOException e) {

            System.out.println("Error al leer el archivo.");
        }
    }
}
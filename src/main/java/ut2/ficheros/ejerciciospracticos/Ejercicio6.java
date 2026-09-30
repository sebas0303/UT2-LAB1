package ut2.ficheros.ejerciciospracticos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            // true significa que escribimos al final del archivo
            FileWriter archivo = new FileWriter("calificaciones.txt", true);

            BufferedWriter escritor = new BufferedWriter(archivo);

            // Pedimos los datos de 3 alumnos
            for (int i = 1; i <= 3; i++) {

                System.out.print("Introduce el nombre del alumno " + i + ": ");
                String nombre = teclado.nextLine();

                System.out.print("Introduce la nota de " + nombre + ": ");
                double nota = teclado.nextDouble();

                // Limpiamos el salto de línea pendiente
                teclado.nextLine();

                // Escribimos los datos
                escritor.write(nombre + " - " + nota);
                escritor.newLine();
            }

            // Cerramos el escritor
            escritor.close();

            System.out.println("Los datos se han guardado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }

        teclado.close();
    }
}
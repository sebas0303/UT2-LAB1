package ut2.ficheros.ejerciciospracticos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = teclado.nextLine();

        FileInputStream archivo = null;

        try {

            // Intentamos abrir el archivo
            archivo = new FileInputStream(ruta);

            System.out.println("El archivo se ha abierto correctamente.");

        } catch (FileNotFoundException e) {

            // Esta excepción ocurre si el archivo no existe
            System.out.println("No se ha encontrado el archivo indicado.");

        } catch (IOException e) {

            // Controlamos cualquier otro problema de entrada/salida
            System.out.println("Ha ocurrido un error al acceder al archivo.");

        } finally {

            // Cerramos el archivo aunque haya ocurrido un error
            if (archivo != null) {
                try {
                    archivo.close();
                    System.out.println("El archivo se ha cerrado correctamente.");
                } catch (IOException e) {
                    System.out.println("No se pudo cerrar el archivo.");
                }
            }
        }

        teclado.close();
    }
}
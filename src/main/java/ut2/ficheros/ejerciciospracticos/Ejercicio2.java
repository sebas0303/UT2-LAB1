package ut2.ficheros.ejerciciospracticos;

import java.io.File;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario la ruta
        System.out.print("Introduce la ruta donde buscar temp.bak: ");
        String ruta = teclado.nextLine();

        // Creamos el objeto File con la ruta introducida
        File archivo = new File(ruta, "temp.bak");

        // Comprobamos si existe
        if (archivo.exists()) {

            // Comprobamos que sea un archivo
            if (archivo.isFile()) {

                // Intentamos eliminarlo
                if (archivo.delete()) {
                    System.out.println("El archivo temp.bak ha sido eliminado correctamente.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }

            } else {
                System.out.println("temp.bak existe, pero no es un archivo.");
            }

        } else {
            System.out.println("El archivo temp.bak no existe en esa ruta.");
        }

        teclado.close();
    }
}

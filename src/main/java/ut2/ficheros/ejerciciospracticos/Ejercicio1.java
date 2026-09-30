package ut2.ficheros.ejerciciospracticos;

import java.io.File;
import java.io.IOException;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Ruta de la carpeta que queremos comprobar
        File carpeta = new File("C:/ficheros_dam");

        // Comprobamos si la carpeta existe
        if (carpeta.exists()) {

            // Comprobamos si realmente es un directorio
            if (carpeta.isDirectory()) {

                // Obtenemos los archivos y carpetas que contiene
                File[] contenido = carpeta.listFiles();

                // Contamos los archivos que contiene
                int contadorArchivos = 0;

                if (contenido != null) {
                    for (File elemento : contenido) {
                        if (elemento.isFile()) {
                            contadorArchivos++;
                        }
                    }
                }

                System.out.println("La carpeta existe.");
                System.out.println("Es un directorio.");
                System.out.println("Contiene " + contadorArchivos + " archivo(s).");

            } else {
                System.out.println("La ruta existe, pero no es un directorio.");
            }

        } else {

            // Si no existe, creamos la carpeta
            if (carpeta.mkdirs()) {
                System.out.println("La carpeta ha sido creada correctamente.");

                // Creamos el archivo setup.log dentro de la carpeta
                File archivoLog = new File(carpeta, "setup.log");

                try {
                    if (archivoLog.createNewFile()) {
                        System.out.println("Se ha creado el archivo setup.log.");
                    }
                } catch (IOException e) {
                    System.out.println("Error al crear el archivo setup.log.");
                }

            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        }
    }
}
package ut2.ficheros.ejerciciospracticos;

import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos la ruta completa de la estructura
        File accesoDatos = new File("MurciaFP/2026/AccesoDatos");

        // Creamos todas las carpetas necesarias
        if (accesoDatos.mkdirs()) {
            System.out.println("Estructura de carpetas creada correctamente.");
        } else {
            System.out.println("La estructura ya existe o no se pudo crear.");
        }

        // Creamos la nueva ruta con el nombre AD_Backup
        File backup = new File("MurciaFP/2026/AD_Backup");

        // Renombramos AccesoDatos a AD_Backup
        if (accesoDatos.renameTo(backup)) {
            System.out.println("La carpeta AccesoDatos ha sido renombrada a AD_Backup.");
        } else {
            System.out.println("No se pudo renombrar la carpeta.");
        }
    }
}
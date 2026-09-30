package ut2.ficheros.ejerciciospracticos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio7 {

    public static void main(String[] args) {

        try {

            // Abrimos el archivo en modo lectura y escritura
            RandomAccessFile archivo = new RandomAccessFile("datos.dat", "rw");

            // Escribimos los tres números
            archivo.writeInt(100);
            archivo.writeInt(200);
            archivo.writeInt(300);

            // Cada entero ocupa 4 bytes.
            // El segundo número empieza en la posición 4.
            archivo.seek(4);

            // Cambiamos el segundo número por 999
            archivo.writeInt(999);

            // Volvemos al principio del archivo
            archivo.seek(0);

            // Leemos los tres números
            int numero1 = archivo.readInt();
            int numero2 = archivo.readInt();
            int numero3 = archivo.readInt();

            // Mostramos los resultados
            System.out.println("Número 1: " + numero1);
            System.out.println("Número 2: " + numero2);
            System.out.println("Número 3: " + numero3);

            archivo.close();

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo.");
        }
    }
}
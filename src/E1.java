import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

class E1 {
    public static void main(String[] args) {
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int n = 0;

        String nombreArchivo = "Documents/Documentos/numeros.txt";

        try {
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);
            while (lector.hasNext()) {
                n = lector.nextInt();

                if (n > maximo) {
                    maximo = n;
                }
                if (n < minimo) {
                    minimo = n;
                }
            }
            System.out.println(minimo + " " + maximo);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }
    }
}
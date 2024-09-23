import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class E2 {
    public static void main(String[] args) {
        try {

            ArrayList<String> arrayList = new ArrayList<String>();
            File archivo = new File("Documents/Documentos/alumnos_notas.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {

                String[] texto = lector.nextLine().split(" ");
                String nombre = texto[0];
                String apellido = texto[1];
                int suma = 0;

                for (int i = 2; i < texto.length; i++) {
                    suma = suma + Integer.valueOf(texto[i]);
                }

                double media = (double) suma / (double) (texto.length - 2);
                String notas = String.format("%.2f", media, nombre + " " + apellido);
                arrayList.add(notas + " " + nombre + " " + apellido);

            }

            Collections.sort(arrayList, Collections.reverseOrder());

            for (String a : arrayList) {
                System.out.println(a);
            }
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        }


    }
}

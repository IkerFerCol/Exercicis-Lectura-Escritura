import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class E7 {
    public static void main(String[] args) {
        try {
            File archivo = new File("Documents/Documentos/Libros/lazarillo.txt");
            int contcaracteres = 0;
            ArrayList<String> contlineas = new ArrayList();
            Scanner lector = new Scanner(archivo);
            Hashtable<Integer, String> contpalabras = new Hashtable<>();
            int indice = 0;

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                if (!lector.nextLine().isEmpty()) {
                    contlineas.add(linea);
                }
                String[] palabras = linea.split("\\s+");

                for (String palabra : palabras) {
                    contpalabras.put(indice, palabra);
                    indice++;
                    contcaracteres += palabra.length();
                }
            }

            lector.close();
            System.out.println("Hay " + contlineas.size() + " líneas escritas");
            System.out.println("Hay " + indice + " palabras escritas");
            System.out.println("Hay " + contcaracteres + " letras escritas");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

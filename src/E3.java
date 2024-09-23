import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime un nombre del archivo A para lectura: ");
        String nombreLectura = scanner.nextLine();
        System.out.print("Dime un numero del archivo B para escritura: ");
        String nombreEscritura = scanner.nextLine();

        File archivoO = new File(nombreLectura);
        File archivoD = new File(nombreEscritura);

        try {
            Scanner lector = new Scanner(archivoO);
            FileWriter fileWriter = new FileWriter(archivoD);
            ArrayList<String> arrayList = new ArrayList();
            while (lector.hasNextLine()) {
                arrayList.add(lector.nextLine());
            }
            Collections.sort(arrayList);

            for (String string : arrayList) {
                fileWriter.write(string + "\n");
            }
            scanner.close();
            lector.close();

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

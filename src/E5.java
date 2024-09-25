import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        File diccionario = new File("diccionario");
        diccionario.mkdir();
        try {
            ArrayList<String> arrayList = new ArrayList();
            File archivodiccionario = new File("Documents/Documentos/diccionario.txt");
            Scanner sc = new Scanner(archivodiccionario);
            while (sc.hasNextLine()) {
                arrayList.add(sc.nextLine());
            }
            sc.close();

            for (char letra = 'A'; letra <= 'Z'; letra++) {
                File letras = new File(diccionario, String.valueOf(letra + ".txt"));

                letras.createNewFile();

                FileWriter fileWriter = new FileWriter(new File(diccionario, String.valueOf(letra) + ".txt"));

                for (String palabra : arrayList) {
                    if (palabra.toUpperCase().startsWith(Character.toString(letra))) {
                        fileWriter.write(palabra + "\n");
                    }
                }
                fileWriter.close();

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

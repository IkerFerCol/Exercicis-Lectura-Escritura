import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Cuantos nombres desea generar: ");
            int numerospersonas = scanner.nextInt();
            System.out.print("Donde quieres añadirlos: ");
            String nombre = scanner.next();

            File nombres = new File("Documents/Documentos/usa_nombres.txt");
            File apellidos = new File("Documents/Documentos/usa_apellidos.txt");

            FileWriter fileWriter = new FileWriter(nombre);
            Scanner lectornombre = new Scanner(nombres);
            Scanner lectorapellido = new Scanner(apellidos);

            ArrayList<String> arraylistn = new ArrayList();
            ArrayList<String> arraylista = new ArrayList();

            while (lectornombre.hasNextLine()) {
                arraylistn.add(lectornombre.nextLine());
            }

            while (lectorapellido.hasNextLine()) {
                arraylista.add(lectorapellido.nextLine());
            }

            for (int i = 0; i < numerospersonas; i++) {
                int randomnombre = (int) (Math.random() * arraylistn.size());
                int randomapellido = (int) (Math.random() * arraylista.size());
                fileWriter.write(arraylistn.get(randomnombre) + " " + arraylista.get(randomapellido) + "\n");
            }
            fileWriter.close();
            lectornombre.close();
            lectorapellido.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

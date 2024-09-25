import java.io.File;
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dime un numero: ");
            int num = scanner.nextInt();
            File file = new File("Documents/Documentos/pi-million.txt");
            Scanner lector = new Scanner(file);
            String n = "";
            while (lector.hasNextLine()) {
                n += lector.nextLine();
            }
            if (n.contains(String.valueOf(num))) {
                System.out.println("SI ESTA");
            } else {
                System.out.println("NO ESTA");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

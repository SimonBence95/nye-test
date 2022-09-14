import java.util.Locale;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kerem adja meg a nevet: ");
        String nev = scanner.nextLine();
        System.out.print("Szeretne hogy nem magyar nyelven udvozolje a program (igen/nem)?: ");
        String valasztas1 = scanner.nextLine();
        switch (valasztas1){
            case "nem":
                System.out.println("Szia, "+nev+"!");
                break;

            case "igen":
                System.out.print("Kerem irja be milyen nyelven szeretne, hogy udvozolje a program: ");
                String valasztas2 = scanner.nextLine();

                switch (valasztas2.toLowerCase()) {
                    case "hun":
                        System.out.println("Szia, "+nev+"!");
                        break;
                    case "eng":
                        System.out.println("Hello, "+nev+"!");
                        break;
                    case "haw":
                        System.out.println("Aloha, "+nev+"!");
                        break;
                    case "ita":
                        System.out.println("Arrivederci, "+nev+"!");
                        break;
                    case "fra":
                        System.out.println("Bonjour, "+nev+"!");
                        break;
                    default:
                        System.out.println("Hiba! Nem szerepel ilyen nyelv az adatbazisban!");
                }
                break;

        }


    }

}
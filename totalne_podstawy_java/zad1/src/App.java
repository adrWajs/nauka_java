import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String imie = skaner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = skaner.nextLine();

        System.out.println("Podaj wiek: ");
        int wiek = skaner.nextInt();

        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Wiek: " + wiek);
    }
}

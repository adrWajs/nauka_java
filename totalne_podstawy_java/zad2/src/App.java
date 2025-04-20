import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner skaner = new Scanner(System.in);

        System.out.println("Podaj liczbe pierwsza: ");
        int a = skaner.nextInt();

        System.out.println("Podaj liczbe druga: ");
        int b = skaner.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;

        System.out.println("Wynik dodawania to: " + c);
        System.out.println("Wynik odejmowania to: " + d);
        System.out.println("Wynik mnożenia to: " + e);
        System.out.println("Wynik dzielenia to: " + f);
    }
}

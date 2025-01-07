import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        System.out.println("inserire 3 stringhe:");
        Scanner scanner = new Scanner(System.in);
        String stringa = scanner.nextLine();
        String stringa1 = scanner.nextLine();
        String stringa2 = scanner.nextLine();

        System.out.println("Le stringhe in ordine di inserimento sono:" + stringa + " " + stringa1 + " " + stringa2);
        System.out.println("Le stringhe in ordine di inserimento inverso sono:" + stringa2 + " " + stringa1 + " " + stringa);

    }
}

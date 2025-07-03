
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String parola = scan.nextLine();
        String parolaReverse = "";
        for (int i = parola.length(); i > 0; i--) {
            parolaReverse = parolaReverse + parola.charAt(i - 1);
        }
        System.out.println(parolaReverse);
    }
}

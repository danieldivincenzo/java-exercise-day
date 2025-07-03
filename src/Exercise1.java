import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il numero di cui vuoi la tabellina: ");
        int numeroTabellina = scan.nextInt();
       
        System.out.print("Fino a quale numero della tabellina vuoi arrivare? ");
        int numeroFineTabellina = scan.nextInt();

        for (int i = 0; i <= numeroFineTabellina; i++) {
            System.out.println(i*numeroTabellina);
        }
    }
}

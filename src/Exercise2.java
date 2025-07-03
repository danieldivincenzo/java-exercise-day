import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci un numero n: ");
        int numero = scan.nextInt();
        int fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale = fattoriale * i;
        }
        System.out.println("Il fattoriale di " + numero + " è " + fattoriale);
    }
}
public class Exercise5 {
    public static void main(String[] args) {
        int numbers[] = {1, 12, 35, 10, 7, 49, 195, 60, 492, 3, 95};
        int numeroMinimo = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numeroMinimo) {
                numeroMinimo = numbers[i];
            }
        }
        System.out.println("Il numero minimo è: " + numeroMinimo);
    }
}
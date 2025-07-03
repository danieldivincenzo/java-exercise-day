public class Exercise4 {
    public static void main(String[] args) {
        int numbers[] = {1, 12, 35, 10, 7, 49, 195, 60, 492, 3, 95};
        int numeroMassimo = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numeroMassimo) {
                numeroMassimo = numbers[i];
            }
        }
        System.out.println("Il numero massimo è: " + numeroMassimo);
    }
}

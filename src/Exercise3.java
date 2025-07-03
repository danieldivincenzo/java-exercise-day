public class Exercise3 {
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somma = 0;
        for(int i = 0; i < numbers.length; i++){
            somma = somma + numbers[i];
        }
        System.out.println(somma);
    }
}

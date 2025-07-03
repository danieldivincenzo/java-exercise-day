public class Exercise8 {
    public static void main(String[] args) {
        String nomi[] = {"Anna", "Luca", "Alberto", "Giulia", "Andrea", "Francesco", "Marco", "Annalisa"};
        char lettera = 'A';
        for (int i = 0; i < nomi.length; i++) {
            String nome = nomi[i];
            for (int j = 0; j < nomi[i].length(); j++) {
                if (nome.charAt(0) == lettera) {
                    System.out.println(nome);
                }
                break;
            }
        }
    }
}

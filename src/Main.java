public class Main {

    public static void main(String[] args) {

        /* przykład.2 pętle for */

        /* przykładowa pętla */
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int i = 5;
        for (; i > 0; ) {
            System.out.print(i + " ");
            i--;
        }

        /* Przykład z tablicą */
        System.out.println("\n");
        String[] tab = new String[]{"Ala", "ma", "kota"};
        for (int j = 0; j < tab.length; j++) {
            System.out.print(tab[j] + " ");
        }

        /* przykład forEach */
        String[] tablica = new String[]{"To", "jest", "moja", "tablica"};
        System.out.println("\n");
        for (String zmienna : tablica) {
            System.out.print(zmienna + " ");
        }

        /* Przykład forEach
         * toCharArray() - zamienia napis (String) na tablicę typu char[] (tworzymy tablicę znakową ze stringa)
         * return powoduje zakończenie metody (wyjście z funkcji) */
        String napis = "abcdefg xyz";
        for (char znak : napis.toCharArray()) {
            if (znak == 'z') {
                System.out.println("z");
                return;
            }
            System.out.print(znak + "-");
        }


    }
}

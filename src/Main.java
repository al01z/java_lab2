public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        /* przykła użycia break */
        for (int i = 100; i >= 0; i--) {
            if (i == 11)
                break;
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /* przykład użycia continue */
        for (int i = 100; i >= 0; i--) {
            if (i % 5 == 0)
                continue;
            System.out.print(i + " ");
        }
        System.out.println("\n");

        /* przykła użycia return */
        for (int i = 100; i >= 0; i--) {
            if (i == 33)
                return;
            System.out.print(i + " ");
        }


    }
}

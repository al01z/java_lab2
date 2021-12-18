public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        do {
            if ((i%27)==0) {
                System.out.println("Liczba " + i + " jest podzielna przez dwie ostatnie cyfry numeru indeksu 61527.");
            }
        } while (--i > 0);




        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int tab1[] = new int[]{1, 3, 2, 1, 4};
        i=0;
        while (i < tab1.length) {
            System.out.println(tab1[i]);
            i++;
        }
        double tab2[] = new double[]{1.2, 3.6, 6.2, 11.34, 0.12};
        i=0;
        while (i < tab2.length) {
            System.out.println(tab2[i]);
            i++;
        }
        String tab3[] = new String[]{"raz", "dwa", "zupa", "grypa", "konik"};
        i=tab3.length;
        while (i > 0) {
            System.out.println(tab3[i-1]);
            i--;
        }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        //while (true) {
        //    System.out.println("Raz"); // 'while' statement cannot complete without throwing an exception
        //}
        while (false) {
            System.out.println("Raz"); // Condition is always false
        }
    }
}

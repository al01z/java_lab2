import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        for (int i = 100; i >= 0; i--) {
            if ((i%7)==0) System.out.println("Liczba " + i + " jest podzielna przez ostatnią cyfrę numeru indeksu 61527.");
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */
        Scanner scan = new Scanner(System.in);
        int[] tab1 = new int[5];
        for (int i=0; i<(tab1.length);i++) {
            System.out.print("Podaj liczbe: ");
            tab1[i] = scan.nextInt();
        }
        for (int zmienna : tab1
             ) {
            System.out.println(zmienna);
        }

    }
}

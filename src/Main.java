import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */
        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        int[] tab1 = new int[20];
        metoda1(tab1);
        metoda2(tab1);
        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        String[] tab2 = new String[6];
        metoda3(tab2);
        metoda4(tab2);
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        metoda5("Artur");
        metoda5("Artur","Dampc");
        metoda5("Artur","Dampc",5);
        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */
        System.out.println("wynik: " + (metoda6(8, 9) + metoda6(2, 3, 4)));
    }
    public static void metoda1(int[] tablica) {
            for (int i=0; i<20; ++i) {
                tablica[i] = 40 - i;
            }
    }
    public static void metoda2(int[] tablica) {
        for (int i=0; i<20; ++i) {
            System.out.println(i + " " + tablica[i]);
        }
    }
    public static void metoda3(String[] tablica) {
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<=5; i++) {
            System.out.print("Podaj ciag znakow: ");
            tablica[i] = scan.next();
        }
    }
    public static void metoda4(String[] tablica) {
        for (int i=5; i>=0; i--) {
            System.out.println(i + " " + tablica[i]);
        }
    }
    public static void metoda5(String jakisTekst) {
        System.out.println(jakisTekst);
    }
    public static void metoda5(String jakisTekst1, String jakisTekst2) {
        System.out.println(jakisTekst1 + " " + jakisTekst2);
    }
    public static void metoda5(String jakisTekst1, String jakisTekst2, int wiek) {
        System.out.println(jakisTekst1 + " " + jakisTekst2 + " " + wiek);
    }
    public static int metoda6(int a, int  b) {
        return a+b;
    }
    public static int metoda6(int a, int  b, int c) {
        return a+b+c;
    }

}

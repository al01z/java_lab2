import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        List<String> lista1 = new ArrayList<>();
        metoda1(lista1,5);
        metoda2(lista1);
        metoda3(lista1,2);
        metoda1(lista1,3);
        metoda2(lista1);
        System.out.println(lista1.size());
         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */
        Set<Integer> setA = new TreeSet<>();
        metoda4(setA,10);
        ArrayList<Integer> listA = new ArrayList<>(setA);
        Collections.sort(listA); //Nie rozumiem chyba po co tu sortujemy
        System.out.println("posortowany set: ");
        for(int x: listA) {
            System.out.print(x + " ");
        }
        System.out.println("liczby: " + setA);
    }
    public static void metoda1(List<String> jakasLista, int liczbaWpisow) {
        Scanner scan = new Scanner(System.in);
        for (int i=1; i<=liczbaWpisow;i++) {
            System.out.print("Podaj zwierze: ");
            jakasLista.add(scan.next());
        }
    }
    public static void metoda2(List<String> jakasLista) {
        for(String zmienna : jakasLista) {
            System.out.println(zmienna);
        }
    }
    public static void metoda3(List<String> jakasLista, int liczbaWpisow) {
        for (int i=1; i<=liczbaWpisow;i++) {
            jakasLista.remove((jakasLista.size()-1));
        }
    }
    public static void metoda4(Set<Integer> jakisSet, int liczbaWpisow) {
        Scanner scan = new Scanner(System.in);
        for (int i=1; i<=liczbaWpisow;i++) {
            System.out.print("Podaj liczbe: ");
            jakisSet.add(scan.nextInt());
        }
    }
}

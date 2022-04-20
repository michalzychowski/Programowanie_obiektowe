import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        zadanie1();
        System.out.println();
        /*System.out.println("Zadanie 2: ");
        zadanie2();*/
    }

    //Zadanie 1 - Zadanie na ocenę 3.0
    //Napisz program obliczający iloczyn liczb od 1 do K, gdzie K podaje użytkownik, K > 0. W zadaniu nie wykorzystujemy tablic.
    public static void zadanie1() {
        int K = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę K z jakiego przedziału (1,K) iloczyn chcesz policzyć: "); //liczymy iloczyn liczb naturalnych z przedziału (1,K)
        K = scan.nextInt();
        double iloczyn = 1;
        if (K > 0) {
            for (int i = 1; i <= K; i++) {
                iloczyn = iloczyn * i;
            }
            System.out.println("Iloczyn liczb z przedziału od 1 do " + K + " wynosi " + iloczyn); //iloczyn to silnia K
        } else System.out.println("Błedne dane");
    }

    //Zadanie 2 - Zadanie na ocenę 4.0
    //W tablicy L na N=100 liczb rzeczywistych wpisać N losowych liczb z przedziału (0,1).
    // •Korzystając z metody printf(..) wypisać w jednym wierszu liczby tablicy z pierwszych 20 z dokładnością do 3 cyfr po przecinku.
    // •Wyzerować (wpisać 0) te liczby w tablicy, które są <0.3 lub >0.7. Wyznaczyć ile pozostało liczb różnych od 0.
    // •Przepisać pozostałe liczby do nowej tablicy o odpowiednio dobranym rozmiarze – po kolei, z pominięciem zer.
    /*public static void zadanie2(){

    }*/
}

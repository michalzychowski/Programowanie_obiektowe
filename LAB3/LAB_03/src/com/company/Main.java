package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        zadanie1();
        System.out.println();
        System.out.println("Zadanie 2: ");
        zadanie2();
        System.out.println();
        System.out.println("Zadanie 3: ");
        zadanie3();
        System.out.println();
        System.out.println("Zadanie 4: ");
        zadanie4();
        System.out.println();
        System.out.println("Zadanie 5: ");
        System.out.println(Palindrom("ala"));
        System.out.println(Palindrom("mama"));
        System.out.println(Palindrom("kajak"));
        System.out.println(Palindrom(12321));
        System.out.println(Palindrom(65444));


    }

    //Zadanie 1
    public static void zadanie1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość studentów w grupie");
        int n = scan.nextInt();
        double punkty, suma = 0, ile = 0;
        if (n > 0) {
            while (n > 0) {
                System.out.println("Podaj liczbę punktów od 0-50");
                punkty = scan.nextDouble();
                if (punkty >= 0 && punkty <= 50) {
                    suma += punkty;
                    ile++;
                    n--;
                }
            }//koniec while
            System.out.println("Suma punktów: " + suma);
            System.out.println("Średnia: " + (suma / ile));
        } else System.out.println("W grupie musi być co najmniej jeden student");
    }

    //Metoda Wczytaj (potrzebna do zadań)
    public static double Wczytaj() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        double n = input.nextDouble();
        return n;
    }

    //Zadanie 2
    public static void zadanie2() {
        int ile_d = 0, ile_u = 0;
        double suma_d = 0, suma_u = 0, liczba;
        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < 10; i++) {
            liczba = Wczytaj();
            if (liczba >= 0) {
                ile_d++;
                suma_d += liczba;
            } else {
                ile_u++;
                suma_u += liczba;
            }
        }//koniec for
        System.out.println("Ilość liczb dodatnich: " + ile_d + ", suma: " + suma_d);
        System.out.println("Ilość liczb ujemnych: " + ile_u + ", suma: " + suma_u);
    }

    //Zadanie 3
    public static void zadanie3() {
        double suma = 0, liczba;
        System.out.println("Podaj ile wyrazów ma ciąg liczbowy");
        double n = Wczytaj();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                liczba = Wczytaj();
                if (liczba % 2 == 0) suma += liczba;
            }//koniec for
            System.out.println("Suma liczb parzystych: " + suma);
        }//koniec if
        else System.out.println("Podano błędne dane");
    }

    //Zadanie 4
    public static void zadanie4() {
        Random rand = new Random();
        System.out.println("Wprowadź ile liczb chcesz wylosować.");
        double n = Wczytaj();
        int los;
        double suma = 0;
        System.out.println("Wylosowane liczby: ");
        if (n > 0) {
            while (n > 0) {
                los = rand.nextInt(-10, 45);
                System.out.println(los);
                if (los % 2 == 0) suma += los;
                n--;
            }
            System.out.println("Suma liczb parzystych ciągu: " + suma);
        } else System.out.println("Podano błędne dane");
    }

    //Zadanie 5
    public static boolean Palindrom(String tekst) {
        for (int i = 0; i < tekst.length() / 2; i++) {
            char znak = tekst.charAt(i);
            char przeciwnyZnak = tekst.charAt(tekst.length() - 1 - i);

            if (znak != przeciwnyZnak) return false;
        }
        return true;
    }

    public static boolean Palindrom(long liczba) {
        return Palindrom(Long.toString(liczba));
    }
}
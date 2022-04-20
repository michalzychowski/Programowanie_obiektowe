package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        zadanie1();
        System.out.println();
        System.out.println("Zadanie 2:");
        zadanie2(2, 3);
        System.out.println();
        System.out.println("Zadanie 3:");
        System.out.println(zadanie3(4));
        System.out.println(zadanie3(5));
        System.out.println();
        System.out.println("Zadanie 4:");
        System.out.println(zadanie4(15));
        System.out.println(zadanie4(6));
        System.out.println();
        System.out.println("Zadanie 5:");
        zadanie5(2);
        System.out.println();
        System.out.println("Zadanie 6:");
        zadanie6(9);
        System.out.println();
        System.out.println("Zadanie 7:");
        System.out.println(zadanie7());
    }


    //Zadanie 1
    public static void zadanie1() {
        String imie = "Michał";
        int wiek = 20;
        System.out.println("Imię: " + imie + "\nWiek: " + wiek);
    }

    //Zadanie 2
    public static void zadanie2(double a, double b) {
        double suma = a + b;
        double roznica = a - b;
        double iloczyn = a * b;
        System.out.println("Suma: " + suma + "\nRóżnica: " + roznica + "\nIloczyn: " + iloczyn);
    }

    //Zadanie 3
    public static boolean zadanie3(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    //Zadanie 4
    public static boolean zadanie4(int m) {
        if (m % 3 == 0 && m % 5 == 0)
            return true;
        else
            return false;
    }

    //Zadanie 5
    public static void zadanie5(int k) {
        double potega = Math.pow(k, 3.0);
        //double potega=k*k*k;
        System.out.println("Potęga " + k + ": " + potega);
    }

    //Zadanie 6
    public static void zadanie6(int l) {
        double pierwiastek = Math.sqrt(l);
        System.out.println("Pierwiastek z " + l + ": " + pierwiastek);
    }

    //Zadanie 7
    public static boolean zadanie7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj długość pierwszej przyprostokątnej trójkąta: ");
        double x = scan.nextDouble();
        System.out.println("Podaj długość drugiej przyprostokątnej trójkąta: ");
        double y = scan.nextDouble();
        System.out.println("Podaj długość przeciwprostokątnej trójkąta: ");
        double z = scan.nextDouble();
        if ((Math.pow(x, 2) + Math.pow(y, 2)) == Math.pow(z, 2))
            return true;
        else
            return false;
    }
}

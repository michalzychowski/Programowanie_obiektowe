package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1: ");
        zadanie1();
        System.out.println();
    }

    //Zadanie 1 - Zadanie na ocenę 3.0
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
            System.out.println("Iloczyn liczb z przedziału od 1 do " + K + " wynosi " + iloczyn);
        } else System.out.println("Błedne dane");
    }
}

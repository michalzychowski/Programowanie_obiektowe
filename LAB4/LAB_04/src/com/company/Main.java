package com.company;

import java.util.Random;

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
    }

    //Zadanie 1
    public static void zadanie1() {
        double suma = 0;
        int[] tab1 = {1, 2, 3, 4};
        for (int i = 0; i < tab1.length; i++) {
            suma = suma + tab1[i];
        }
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + suma / tab1.length);
    }

    //Zadanie 2
    public static void zadanie2() {
        boolean[] tab1 = new boolean[20];
        for (int i = 0; i < tab1.length; i++) {
            if (i == 0 || i % 2 == 0) System.out.println(tab1[i] = true);
            else System.out.println(tab1[i] = false);
        }
    }

    //Metoda Losuj
    public static double Losuj() {
        Random rand = new Random();
        double liczba = rand.nextInt(45) - 10;
        return liczba;
    }

    //Zadanie 3
    public static void zadanie3() {
        double[] array = new double[20];
        double suma = 0, sumaRoznic = 0, srednia;
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Losuj();
            suma += array[i];
            System.out.print(array[i] + "\t");
        }
        srednia = suma / (double) array.length;
        System.out.println("\nSuma: " + suma + "\nŚrednia pomiarów: " + srednia);
        for (int i = 0; i < array.length; i++) {
            sumaRoznic += (array[i] - srednia) * (array[i] - srednia);
            //sumaRoznic += Math.pow(array[i] - srednia, 2.0);
        }
        System.out.println("Suma różnic: " + sumaRoznic);
        System.out.println("Wariancja: " + sumaRoznic / (double) ((array.length) - 1));
    }
}

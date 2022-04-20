package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //Ćwiczenie
        System.out.println("Ćwiczenie: ");
        //Tworzenie obiektów klasy
        Osoba ob1 = new Osoba();
        Osoba ob2 = new Osoba("Jan", "Nowak", 22);
        ob2.Info();
        Osoba ob3 = new Osoba("Janina");
        System.out.println("Referencja do obiektu: \t"+ob3);
        System.out.println();

        //Zadanie 1
        System.out.println("Zadanie 1:");
        Prostokąt p1 = new Prostokąt(6,2);
        p1.pole();
        p1.obwod();
        p1.przekatna();
        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2:");
        Budynek b1 = new Budynek("XYZ",2020,8);
        b1.Info();
        b1.wiek();
        System.out.println();
        Budynek b2 = new Budynek("Burj Khalifa",2009,163); //2009 - rok ukończenia budowy
        b2.Info();
        b2.wiek();
        System.out.println();
        Budynek b3 = new Budynek("Eiffel Tower",1889,3); //1889 - rok ukończenia budowy
        b3.Info();
        b3.wiek();
    }
}

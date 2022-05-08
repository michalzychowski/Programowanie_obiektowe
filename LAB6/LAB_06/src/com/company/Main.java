package com.company;

public class Main {

    public static void main(String[] args) {

        //Zadanie 1
        System.out.println("Zadanie 1:");
        //Punkt 6 i 7
        Punkt pkt1 = new Punkt();
        Punkt pkt2 = new Punkt(2.5, 3.43);
        Punkt pkt3 = new Punkt(-21, 2);

        /*pkt1.opis();
        pkt1.przesun(2,3);
        pkt1.opis();

        pkt2.opis();
        pkt2.przesun(2,3);
        pkt2.opis();

        pkt3.opis();
        pkt3.przesun(2,3);
        pkt3.opis();*/

        //Punkt 9
        Prostokat p1 = new Prostokat(2.3, 23.2);
        Trojkat t1 = new Trojkat(4.54, 14.23);
        Figura f1 = new Figura();

        System.out.println(p1.getPowierzchnia());
        System.out.println("trojkat o wys: " + t1.wys + " i podstawie " + t1.podst);
        t1.wys = 1;
        t1.podst = 2.23;
        System.out.println("trojkat o wys: " + t1.wys + " i podstawie " + t1.podst);
        p1.przesun(3, 5);
        System.out.println("Prostokąt: Wysokość:" + p1.wys + " Szerokość: " + p1.szer);
        Kwadrat kw1 = new Kwadrat(5, 5, "czarny");
        System.out.println();
        kw1.opis();
        System.out.println();
        t1.opis();
        System.out.println();
        p1.opis();
        System.out.println();

        //Zadanie 2
        System.out.println("Zadanie 2:");
        Samochod s1 = new Samochod();
        Samochod s2 = new Samochod();
        s1.wypisz();
        s2.wypisz();
        SamochodOsobowy so1 = new SamochodOsobowy();
        so1.wypisz();
        System.out.println();

        //Zadanie 3
        System.out.println("Zadanie 3:");
        Ksiegarnia ksieg1 = new Ksiegarnia("Tania Książka", 30, 34567);
        Podrecznik p = new Podrecznik("Analiza matematyczna cz. 1", "Katarzyna", "Szary", 2020);
        Powiesc pow1 = new Powiesc("Alicja w Krainie Czarów", "Lewis", "Carroll", 1865, "fantasy");
        Klient k1 = new Klient("Jan", "Kowalski");
        Ksiazka ks1 = new Ksiazka("Latarnik", "Henryk", "Sienkiewicz", 1882);
        ksieg1.wypisz();
        System.out.println();
        p.wypisz();
        System.out.println();
        pow1.wypisz();
        System.out.println();
        ks1.wypisz();
        System.out.println();
        System.out.println(k1.przedstawSie());
    }
}

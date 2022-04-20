package com.company;

public class Osoba {
    String imie, nazwisko;
    int wiek;

    //Konstruktory
    public Osoba() {
        //
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Osoba(String imie) {
        this.imie = imie;
        System.out.println("Wynik działania this: " + this);
    }

    //Metody
    public void Info() {
        System.out.println("Imię i nazwisko: " + imie + " " + nazwisko + "\nWiek: " + wiek);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}

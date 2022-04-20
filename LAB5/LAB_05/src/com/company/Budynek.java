package com.company;

public class Budynek {
    String nazwa;
    int rokBudowy;
    int liczbaPieter;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public void Info() {
        System.out.println("Nazwa budynku: "+nazwa);
        System.out.println("Rok budowy budynku "+nazwa+" : "+rokBudowy);
        System.out.println("Liczba pięter budynku "+nazwa+" : "+liczbaPieter);
    }

    public void wiek() {
        int wiek = 2022 - rokBudowy;
        System.out.println("Budynek "+nazwa+" ma "+wiek+" lat.");
    }
}

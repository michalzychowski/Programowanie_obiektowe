package com.company;

public class Prostokąt {
    double dlugosc, szerokosc, pole, obwod, przekatna;

    public Prostokąt(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public void pole() {
        pole = dlugosc * szerokosc;
        System.out.println("Pole prostokąta wynosi: " + pole);
    }

    public void obwod() {
        obwod = 2 * dlugosc + 2 * szerokosc;
        System.out.println("Obwód prostokąta wynosi: " + obwod);
    }

    public void przekatna() {
        if (dlugosc > szerokosc) {
            przekatna = Math.sqrt(Math.pow(dlugosc,2.0) - Math.pow(szerokosc,2.0));
        } else if (dlugosc == szerokosc) {
            przekatna = dlugosc * Math.sqrt(2);
            //przekatna = szerokosc*Math.sqrt(2);
        } else przekatna = Math.sqrt(Math.pow(szerokosc,2.0) - Math.pow(dlugosc,2.0));
        System.out.println("Długość przekątnej prostokąta wynosi: " + przekatna);
    }
}

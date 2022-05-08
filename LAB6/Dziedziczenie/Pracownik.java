package PO_UR.Lab06.Dziedziczenie;

public class Pracownik {
    String imie, nazwisko;
    int wyplata;

    public Pracownik() {
        imie = " ";
        nazwisko = " ";
        wyplata = 0;
    }

    public Pracownik(String imie, String nazwisko, int wyplata) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplata = wyplata;
    }

    public void Wypisz(){
        System.out.println("jestem pracownikiem, moje dane: \tImie: "+imie+" \tNazwisko: "+nazwisko+" \tWyplata: "+wyplata);
    }
}

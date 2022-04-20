package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie 1:");
        zadanie1(0, 0, 0);
        System.out.println();
        zadanie1(0, 2, 4);
        System.out.println();
        zadanie1(1, 2, 1);
        System.out.println();
        zadanie1(2, 6, 10);
        System.out.println();
        zadanie1(2, 10, 8);
        System.out.println();
        System.out.println("Zadanie 2:");
        System.out.println(zadanie2a(0));
        System.out.println(zadanie2a(2));
        System.out.println(zadanie2a(-3));
        System.out.println();
        System.out.println(zadanie2b(2));
        System.out.println(zadanie2b(1));
        System.out.println(zadanie2b(-1));
        System.out.println();
        System.out.println(zadanie2c(3));
        System.out.println(zadanie2c(2));
        System.out.println(zadanie2c(1));
        System.out.println();
        System.out.println("Zadanie 3:");
        zadanie3(3, 2, 1);
        zadanie3(3, 1, 2);
        zadanie3(2, 3, 1);
        zadanie3(1, 3, 2);
        zadanie3(2, 1, 3);
        zadanie3(1, 2, 3);
        System.out.println();
        System.out.println("Zadanie 4:");
        zadanie4();
        System.out.println();
        System.out.println("Zadanie 5:");
        zadanie5();
        System.out.println();
        System.out.println("Zadanie 6:");
        zadanie6();
    }

    //Zadanie 1
    public static void zadanie1(double a, double b, double c) {
        if (a != 0) {
            double delta = Math.pow(b, 2.0) - 4 * a * c;
            if (delta == 0) {
                double x1 = (-b) / (2 * a);
                System.out.println("Równanie posiada jedno rozwiązanie: x= " + x1);
            } else if (delta > 0) {
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                double x3 = ((-b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("Równanie posiada dwa rozwiązania: x1= " + x2 + " i x2= " + x3);
            } else System.out.println("Brak rozwiązania");
        } else {
            System.out.println("To nie jest równanie kwadratowe, a liniowe");
            liniowe(b, c);
        }
    }

    public static void liniowe(double b, double c) {
        if (b == 0) {
            if (c == 0) System.out.println("Równanie tożsamościowe");
            else System.out.println("Równanie sprzeczne");
        } else {
            double x = (-c) / b;
            System.out.println("Rozwiązanie równania liniowego: x= " + x);
        }
    }

    //Zadanie 2
    public static double zadanie2a(double x) {
        if (x > 0) return 2 * x;
        else if (x == 0) return 0;
        else return -3 * x;
    }

    public static double zadanie2b(double x) {
        if (x >= 1) return Math.pow(x, 2.0);
        else return x;
    }

    public static double zadanie2c(double x) {
        if (x > 2) return 2 + x;
        else if (x == 2) return 8;
        else return x - 4;
    }

    //Zadanie 3
    public static void zadanie3(double a, double b, double c) {
        if (a > b && a > c && b > c)
            System.out.println("Liczby od najmniejszej do największej: " + a + " " + b + " " + c); //abc
        if (a > b && a > c && c > b)
            System.out.println("Liczby od najmniejszej do największej: " + a + " " + c + " " + b); //acb
        if (b > a && b > c && a > c)
            System.out.println("Liczby od najmniejszej do największej: " + b + " " + a + " " + c); //bac
        if (b > a && b > c && c > a)
            System.out.println("Liczby od najmniejszej do największej: " + b + " " + c + " " + a); //bca
        if (c > a && c > b && a > b)
            System.out.println("Liczby od najmniejszej do największej: " + c + " " + a + " " + b); //cab
        if (c > a && c > b && b > a)
            System.out.println("Liczby od najmniejszej do największej: " + c + " " + b + " " + a); //cba
    }

    //Zadanie 4
    public static void zadanie4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Czy pada deszcz? (true or false)");
        boolean deszcz = scan.nextBoolean();
        System.out.println("Czy jest autobus? (true or false)");
        boolean autobus = scan.nextBoolean();
        if (deszcz && autobus) System.out.println("Weź parasol. Dostaniesz się na uczelnie.");
        if (deszcz && !autobus) System.out.println("Nie dostaniesz się na uczelnie.");
        if (!deszcz && autobus) System.out.println("Dostaniesz się na uczelnie. Miłego dnia i pięknej pogody.");
    }

    //Zadanie 5
    public static void zadanie5() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Czy jest zniżka? (true or false)");
        boolean znizka = scan.nextBoolean();
        System.out.println("Czy otrzymałeś premię? (true or false)");
        boolean premia = scan.nextBoolean();
        if (!znizka || premia) {
            System.out.println("Możesz kupić samochód! Zniżki na samochód nie ma.");
        }
        if (!znizka || !premia) {
            System.out.println("Zakup samochodu trzeba odłożyć na później. Zniżki na samochód nie ma.");
        }
        if (znizka || premia) {
            System.out.println("Możesz kupić samochód!");
        }
    }

    //Zadanie 6
    public static void zadanie6() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę: a= ");
        double a = scan.nextDouble();
        System.out.println("Wprowadź drugą liczbę: b= ");
        double b = scan.nextDouble();
        System.out.println("1.Dodawanie \n2.Odejmowanie \n3.Mnożenie \n4.Dzielenie \n5.Reszta z dzielenia");
        double suma = a + b;
        double roznica = a - b;
        double iloczyn = a * b;
        double iloraz = a / b;
        double reszta = a % b;
        System.out.println("Wybierz jakie działanie chcesz wykonać z podanych wyżej opcji: ");
        for (int i = 1; i > 0; i--) {
            int choice = scan.nextInt();
            if (choice == 1) System.out.println("Suma " + a + " i " + b + " wynosi: " + suma);
            if (choice == 2) System.out.println("Różnica " + a + " i " + b + " wynosi: " + roznica);
            if (choice == 3) System.out.println("Iloczyn " + a + " i " + b + " wynosi: " + iloczyn);
            if (choice == 4) {
                if (b == 0) System.out.println("Nie można dzielić przez 0");
                else System.out.println("Iloraz" + a + " przez " + b + " wynosi: " + iloraz);
            }
            if (choice == 5) System.out.println("Reszta z dzielenia " + a + " przez " + b + " wynosi: " + reszta);
        }
    }
}

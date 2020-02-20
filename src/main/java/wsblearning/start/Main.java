package wsblearning.start;

import wsblearning.start.osoba.Osoba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean czyZalogowano = false;

        Scanner scanner = new Scanner(System.in);

        while (czyZalogowano == false) {

            System.out.println("Podaj login");
            String login = scanner.nextLine();

            System.out.println("Podaj hasło");
            String haslo = scanner.nextLine();

            Osoba osoba = Login.logowanie(login, haslo);

            if (osoba == null) {
                System.out.println("Logowanie nie powiodło się");
                continue;
            }
            czyZalogowano=true;
            System.out.println("Witaj, "+osoba.getImie()+" "+osoba.getNazwisko());
            System.out.println("Wooow, masz już "+osoba.getWiek()+" lat!!!");
        }


    }

}

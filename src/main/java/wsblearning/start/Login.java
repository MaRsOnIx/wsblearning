package wsblearning.start;

import wsblearning.start.osoba.Osoba;
import wsblearning.start.osoba.Profesor;
import wsblearning.start.osoba.Student;

import java.util.Arrays;
import java.util.List;

public class Login {

    private String login;
    private String haslo;
    private Osoba osoba;

    private static List<Login> logins = Arrays.asList(

            new Login("student", "haslo",
                    new Student("Bartek", "Kowalski", 20)),

            new Login("student", "jhgrjkhgeFFD",
                    new Student("Tomasz", "Kowalski", 23)),

            new Login("andrzej", "12345678",
                    new Profesor("Andrzej", "Janicki", 50))


    );

    private Login(String login, String haslo, Osoba osoba){
        this.login=login;
        this.haslo=haslo;
        this.osoba=osoba;
    }

    public static Osoba logowanie(String login, String haslo){

        for(Login l: logins){
            if(l.getLogin().equals(login) && l.getHaslo().equals(haslo)){
                return l.getOsoba();
            }
        }
        return null;
    }

    public String getLogin() {
        return login;
    }

    public String getHaslo() {
        return haslo;
    }

    public Osoba getOsoba() {
        return osoba;
    }
}

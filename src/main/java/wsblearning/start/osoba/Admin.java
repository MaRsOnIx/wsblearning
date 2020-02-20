package wsblearning.start.osoba;

public class Admin extends SzablonOsoby {

    public Admin(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    @Override
    public boolean czyStudent() {
        return false;
    }
}

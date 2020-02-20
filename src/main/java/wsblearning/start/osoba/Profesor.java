package wsblearning.start.osoba;

public class Profesor extends SzablonOsoby {

    public Profesor(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    @Override
    public boolean czyStudent() {
        return false;
    }
}

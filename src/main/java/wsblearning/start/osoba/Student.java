package wsblearning.start.osoba;

public class Student extends SzablonOsoby {


    public Student(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }


    @Override
    public boolean czyStudent() {
        return true;
    }
}

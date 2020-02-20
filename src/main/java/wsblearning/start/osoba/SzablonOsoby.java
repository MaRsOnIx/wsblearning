package wsblearning.start.osoba;

public abstract class SzablonOsoby implements Osoba {

    private String imie;
    private String nazwisko;
    private int wiek;

    SzablonOsoby(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }


    @Override
    public String getImie() {
        return this.imie;
    }

    @Override
    public String getNazwisko() {
        return this.nazwisko;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

}

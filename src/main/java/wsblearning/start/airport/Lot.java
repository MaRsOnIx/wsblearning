package wsblearning.start.airport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Lot {

    private Samolot samolot;
    private LocalDateTime dataWylotu;
    private LocalDateTime dataPrzylotu;
    private List<Person> osoby;
    private int koszt;

    public void dodajOsobe(Person person) throws PrzekroczonoIloscOsobException {
        if(osoby.size()+1>samolot.getIleOsobPomiesci())
            throw new PrzekroczonoIloscOsobException("Ilość możliwych osób została przekroczona");
        osoby.add(person);
    }

    public Lot(Samolot samolot, int minutes, int koszt){
        this.samolot=samolot;
        this.dataWylotu=LocalDateTime.now();
        this.dataPrzylotu=LocalDateTime.now().plusMinutes(minutes);
        this.osoby=new ArrayList<>(this.samolot.getIleOsobPomiesci());
        this.koszt=koszt;
    }

    public boolean czyLotZakonczony(){
        return LocalDateTime.now().isAfter(dataPrzylotu);
    }

    public Samolot getSamolot() {
        return samolot;
    }

    public LocalDateTime getDataWylotu() {
        return dataWylotu;
    }

    public LocalDateTime getDataPrzylotu() {
        return dataPrzylotu;
    }

    public int getKoszt() {
        return koszt;
    }
}

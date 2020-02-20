package wsblearning.start.airport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lotnisko {

    private List<Lot> odbyteLoty;
    private List<Lot> loty;
    private String nazwa;

    public static void main(String[] args) throws InterruptedException {

        Lotnisko lotnisko = new Lotnisko("Lotnisko 12 w Londynie");

        Samolot samolot = new Samolot("Samolot 12421", 2, 2010);


        Lot lot = new Lot(samolot, 5, 0);
        try {
            lot.dodajOsobe(new Person());
            lot.dodajOsobe(new Person());
        }catch (PrzekroczonoIloscOsobException ex){
            ex.printStackTrace();
        }

        lotnisko.dodajKolejnyLot(lot);

        Thread.sleep(1000);

        lotnisko.zaktualizuj();

        System.out.println(lotnisko.loty.size());
        System.out.println(lotnisko.odbyteLoty.size());


    }

    public Lotnisko(String nazwa){
        this.nazwa=nazwa;
        this.loty=new ArrayList<>();
        this.odbyteLoty=new ArrayList<>();
    }

    public void dodajKolejnyLot(Lot lot){
        this.loty.add(lot);
    }

    public void zaktualizuj(){

        Iterator<Lot> it = loty.iterator();
        while(it.hasNext()){
            Lot lot = it.next();
            if(lot.czyLotZakonczony()){
                it.remove();
                odbyteLoty.add(lot);
            }
        }

    }


}

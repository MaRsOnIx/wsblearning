package wsblearning.start.airport;

public class Samolot {

    private String name;
    private int ileOsobPomiesci;
    private int rokProdukcji;


    public Samolot(String name, int ileOsobPomiesci, int rokProdukcji) {
        this.name = name;
        this.ileOsobPomiesci = ileOsobPomiesci;
        this.rokProdukcji = rokProdukcji;
    }

    public String getName() {
        return name;
    }

    public int getIleOsobPomiesci() {
        return ileOsobPomiesci;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
}

package wsblearning.start;


import javax.swing.text.DateFormatter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

public class Basic {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.run();
    }

    private void run() {

        BigDecimal bi = new BigDecimal("9223372036832532325352325355334434534554335454354354354354775806");
      //  BigInteger bi2 = new BigInteger("92233720368547753353323232234335806");

        BigDecimal bd = new BigDecimal("5.5555");
        System.out.println(bd.multiply(bi));

      //  System.out.println(bi.add(bi2).toString());


        System.out.println("Program został poprawnie uruchomiony..");


        //System.out.println(Calendar.getInstance().getTime());
        Person person = new Person("Mateusz", "Rychłowski",
                21, "Malbork");


        Book book = new Book("Dziady", person, createDate(1, 12, 1900));

        System.out.println(book.getPublished());

        Shelf shelf = new Shelf("Literatura Polska");
        shelf.addBook(book);
        shelf.addBook(book);
        shelf.remove(book);
        shelf.remove(book);

        try {
            book.addPage("wefewfewfyregfjryfgjygfjgfuguiguigffrergrgergererewfewwe");
        }catch (PrzekroczonoIloscZnakowException e) {
            e.printStackTrace();
        }





        Autor autor = new Autor("Jan", "Kowalski", 30, "Warszawa");

        Book ksiazka = new Book("Książka", autor, createDate(1, 12, 2009));

        autor.getBooks().add(ksiazka);

       // System.out.println(autor);
        System.out.println(ksiazka);

    }

    private LocalDate createDate(int day, int m, int year){

        return LocalDate.of(year, m, day);

    }

}

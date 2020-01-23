package wsblearning.start;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Basic {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.run();
    }

    private void run(){
        System.out.println("Program został poprawnie uruchomiony..");


        //System.out.println(Calendar.getInstance().getTime());
        Person person = new Person("Mateusz", "Rychłowski",
                21, "Malbork");


        Book book = new Book("Dziady", person, LocalDate.now());

        Shelf shelf = new Shelf("Literatura Polska");
        shelf.addBook(book);
        shelf.addBook(book);
        shelf.remove(book);
        shelf.remove(book);

        boolean isAdded = book.addPage("wefewfewfewfewwe");

        if(!isAdded) System.out.println("Strona nie mogła zostać dodana, bo jest za długa");

    }

}

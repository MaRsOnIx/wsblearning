package wsblearning.start;


import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Basic {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.run();
    }

    private void run(){

        if(true){
            Autor autor = new Autor("", "Testowy", 12, "");
            autor.getBooks()
                    .add(new Book("Książka", autor,
                            createDate(1, 12, 2009)));


            System.out.println(autor.getLastname());
            if(true)return;
            int num = 2;
            int num2 = 1;


            String text = null;

            try {
                System.out.println(num / num2);
                System.out.println(text.length());
            }catch (ArithmeticException | NullPointerException e){
                System.out.println("Wystąpił błąd");
            }
            System.out.println("test");

            return;
        }


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

        boolean isAdded = book.addPage("wefewfewfewfewwe");

        if(!isAdded) System.out.println("Strona nie mogła zostać dodana, bo jest za długa");

    }

    private LocalDate createDate(int day, int m, int year){

        return LocalDate.of(year, m, day);

    }

}

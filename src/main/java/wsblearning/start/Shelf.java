package wsblearning.start;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Shelf {

    private static AtomicInteger ai = new AtomicInteger();

    private int id;
    private String category;
    private List<Book> books;

    Shelf(String category){
        this.id=ai.addAndGet(1);
        this.category=category;
        this.books=new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void addBook(Book book){
        if(this.books.contains(book)){
            System.out.println("Książka nie została dodana, bo istnieje już w półce..");
            return;
        }
        this.books.add(book);
        System.out.println("Książka autora "+book.getAuthor().getFullname()+" została pomyślnie dodana.");
    }

    public void remove(Book book){
        if(this.books.contains(book)) {
            this.books.remove(book);
            System.out.println("Książka została pomyślnie usunięta.");
            return;
        }
        System.out.println("Książka nie istnieje.");
    }
}

package wsblearning.start;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Book {

    private int id;
    private String title;
    private Person author;
    private List<String> pages;

    private static AtomicInteger ai = new AtomicInteger();


    Book(String title, Person author){
        this.pages=new ArrayList<>();
        this.id=ai.addAndGet(1);
        this.title=title;
        this.author=author;
    }

    public boolean addPage(String text){
        if(text.length()>50) return false;
        getPages().add(text);
        return true;
    }


    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String text){
        this.title=text;
    }
    public Person getAuthor(){
        return this.author;
    }
    public void setAuthor(Person author) {
        this.author = author;
    }
    public List<String> getPages(){
        return this.pages;
    }

}

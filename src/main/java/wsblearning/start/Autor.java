package wsblearning.start;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Person {

    private List<Book>books;

    public Autor(String firstname, String lastname, int age, String city) {
        super(firstname, lastname, age, city);
        this.books=new ArrayList<>();
    }
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString(){
       return getFullname()+" "+getCity()+" "+getAge()+" "+"["+getBooks().toString()+"]";
    }

}

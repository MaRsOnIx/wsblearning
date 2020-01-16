package wsblearning.start;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Basic {

    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.run();
    }

    private void run(){
        System.out.println("Program został poprawnie uruchomiony..");

        Person person = new Person("Mateusz", "Rychłowski",
                21, "Malbork");

        Book book = new Book("Dziady", person);

        boolean isAdded = book.addPage("wefewfewfewfewwe");

        if(!isAdded) System.out.println("Strona nie mogła zostać dodana, bo jest za długa");


        System.out.println(    book.getAuthor().getLastname()   );







//        String[] lines = new String[]{
//
//               "To jest linijka  1" ,
//               "To jest linijka  2" ,
//               "To jest linijka  3" ,
//               "To jest linijka  4" ,
//               "To jest linijka  5" ,
//               "To jest linijka  6" ,
//               "To jest linijka  7"
//
//        };

        List<String> linesArray = new ArrayList<>(8);

                linesArray.add("To jest linijka  1");
                linesArray.add("To jest linijka  2");
                linesArray.add("To jest linijka  3");
                linesArray.add("To jest linijka  4");
                linesArray.add("To jest linijka  5");
                linesArray.add("To jest linijka  6");
                linesArray.add("To jest linijka  7");

                linesArray.add("To jest linijka  8");


                Iterator<String> it = linesArray.iterator();
                while(it.hasNext()){
                    it.next();
                    it.remove();
                }
        System.out.println(linesArray);


//        for(String s : lines){
//            System.out.println(s);
//        }



    }

}

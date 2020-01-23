package wsblearning.start;


import java.util.*;
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



        Map<String, int[]> money = new HashMap<>();

        //money.put("Tomek Kowalski", new ArrayList<>());

        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("test2");

     //   money.put("Ada Kowalska", list);

        System.out.println(money.get("Ada Kowalska"));


         Map<String, Integer> map = new TreeMap<>();

         map.put("test1", 10);
         map.put("test2", 102424);
         map.put("test3", 1110);
         map.put("aATest99", 1990);
         map.put("aaaaTest1", 412104);

         Queue<String> queue = new PriorityQueue<>();

         queue.add("aaest1");
         queue.add("bbtest");
         queue.add("55bbtescct");
         queue.add("aa55bbtescct");
//
//        System.out.println(queue.poll());
//
//        System.out.println(queue.poll());
//
//        System.out.println(queue.peek());
//
//        System.out.println(queue.size());


        Iterator<String> it = queue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



        System.out.println(map);



//        for(String s : lines){
//            System.out.println(s);
//        }



    }

}

package Collections.Queue;
import java.util.*;
public class LinkedListQueueExample {
    public static void main(String[] args) {
        Queue q=new LinkedList(); // Queue LinkedList sınıfından nesne üretildi.
        // Oluşan nesneye elemanlar eklendi;
        q.add("Java");
        q.add("C#");

        q.forEach(item -> System.out.println(item)); // Veriler  ekrana yazıldı.


    }
}

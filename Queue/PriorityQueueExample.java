package Collections.Queue;
import java.util.*;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue(); // Queue Priority sınıfından nesne üretildi.

        // Oluşan nesneye veriler eklendi;
        q.add(20);
        q.add(10);
        q.add(50);
        q.add(25);
        q.add(35);

        while (!q.isEmpty()){
            System.out.println(q.poll()); // Veriler küçükten büyüğe doğru ekrana yazıldı.
        }
    }
}

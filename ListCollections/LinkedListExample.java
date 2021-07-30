package Collections.ListCollections;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList fruits= new LinkedList(); // LinkedList sınıfından nesne üretildi.

        // Oluşturulan fruits nesnesine veriler eklendi;
        fruits.add("Watermelon");
        fruits.add("Strawberry");
        fruits.add("Banana");
        fruits.add("Apple");

        fruits.forEach(item -> System.out.println(item)); // Veriler  ekrana yazıldı.

        System.out.println("----------");

        fruits.add(1,"Apple"); // Listenin 1. indexine Apple verisi eklendi
        fruits.forEach(item -> System.out.println(item)); // Veriler tekrar ekrana yazıldı.

        System.out.println("----------");

        fruits.remove("Strawberry"); // Strawberry verisi listeden kaldırıldı.
        fruits.forEach(item -> System.out.println(item)); // Veriler tekrar ekrana yazıldı.
    }
}

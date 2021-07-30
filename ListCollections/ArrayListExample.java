package Collections.ListCollections;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList country=new ArrayList(); // ArrayList sınıfından nesne üretildi.

        // Oluşturulan country nesnesine veriler eklendi;
        country.add("Istanbul");
        country.add("Ankara");
        country.add("Izmir");
        country.add("Konya");
        country.add("Bursa");

        country.forEach(item -> System.out.println(item)); // Eklenen veriler ekrana yazıldı.

        System.out.println("----------");

        country.add(2,"Gaziantep"); // 2. sıraya Gaziantep verisi eklendi.
        country.forEach(item -> System.out.println(item)); // Veriler tekrar ekrana yazıldı.

        System.out.println("----------");

        country.remove("Konya"); // Konya verisi kaldırıldı.
        country.forEach(item -> System.out.println(item)); // Veriler tekrar ekrana yazıldı.
    }
}

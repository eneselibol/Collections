package Collections.SetCollections;
import java.util.*;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set dayLHSet=new LinkedHashSet(); // LinkedHashSet sınıfından nesne oluşturuldu.

        // Oluşturulan LinkedHashSet nesnesine veriler eklendi;
        dayLHSet.add("Monday");
        dayLHSet.add("Tuesday");
        dayLHSet.add("Wednesday");
        dayLHSet.add("Thursday");
        dayLHSet.add("Friday");
        dayLHSet.add("Saturday");
        dayLHSet.add("Sunday");

        dayLHSet.forEach(item -> System.out.println(item)); // Eklenen veriler ekrana yazıldı.

        System.out.println("----------");

        dayLHSet.remove("Tuesday"); // Tuesday elemanı listeden kaldırılıyor.
        dayLHSet.forEach(item -> System.out.println(item)); // Kaldırıldıktan sonra veriler tekrar ekrana yazılıyor.

        System.out.println("----------");

        System.out.println(dayLHSet.contains("Monday")); // LinkedHashSet nesnesi içinde Monday verisi var mı? onu kontrol eder. Geriye true veya false değer dönderir.
        System.out.println(dayLHSet.contains("Tuesday"));
    }
}

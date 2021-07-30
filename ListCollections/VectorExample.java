package Collections.ListCollections;
import java.util.*;
public class VectorExample {
    public static void main(String[] args) {
        Vector month =new Vector(); // Vector sınıfından nesne üretildi.

        // Oluşturulan nesneye veriler eklendi;
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");

        System.out.println("Boyut : "+month.size()); // Eklenen verilerden sonra listenin boyutu
        System.out.println("Kapasite : "+ month.capacity()); // Eklenen verilerden sonra listenin kapasitesi

        System.out.println("----------");

        // Oluşturulan nesneye yeni veriler eklendi;
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        System.out.println("Boyut : "+month.size()); // Eklenen yeni verilerden sonra listenin boyutu
        System.out.println("Kapasite : "+ month.capacity()); // Eklenen yeni verilerden sonra listenin kapasitesi

    }
}

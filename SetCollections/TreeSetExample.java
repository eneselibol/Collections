package Collections.SetCollections;
import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet tree=new TreeSet(); // TreeSet sınıfından nesne oluşturuldu.

        // Oluşturulan TreeSet nesnesine veriler eklendi;
        tree.add(10);
        tree.add(200);
        tree.add(20);
        tree.add(18);
        tree.add(19);
        tree.add(100);

        try {
            tree.add(null); // null eklenemediği için burada java.lang.NullPointerException hatası verir!
        }catch (Exception e){
            System.out.println(e.toString());
        }

        tree.forEach(item -> System.out.println(item)); // Eklenen veriler ekrana yazıldı.
    }
}

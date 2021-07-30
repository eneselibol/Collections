package Collections.Map;
import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap std= new LinkedHashMap(); // LinkedHashMap sınıfından nesne oluşturuldu.
        //Veriler eklendi
        std.put("Ali",90);
        std.put("Veli",70);
        std.put("Ayşe",80);

        Set s=std.entrySet(); //Set nesnesine dönüştürüldü.
        Iterator i=s.iterator(); //Iterator oluşturuldu.

        //Veriler ekrana yazıldı.
        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => "+item.getValue());
        }
    }
}

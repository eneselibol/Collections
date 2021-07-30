package Collections.Map;
import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap std=new TreeMap(); // TreeMap sınıfından nesne oluşturuldu.

        //Veriler eklendi
        std.put(80,"Ali");
        std.put(60,"Veli");
        std.put(70,"Ayşe");

        Set s=std.entrySet(); //Set nesnesine dönüştürüldü.
        Iterator i=s.iterator(); //Iterator oluşturuldu.

        //Veriler ekrana yazıldı.
        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => "+item.getValue());
        }
    }
}

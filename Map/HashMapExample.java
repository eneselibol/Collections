package Collections.Map;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap m=new HashMap(); // HashMap sınıfından nesne oluşturuldu.

        m.put("Turkey","Ankara");
        m.put("France","Paris");
        m.put("England","Londra");

        Set s=m.entrySet();
        Iterator i=s.iterator();

        while (i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey() + " => "+item.getValue());
        }

    }
}

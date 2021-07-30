package Collections.SetCollections;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet hash=new HashSet<>(); // HashSet sınıfından nesne üretildi.

        System.out.println(hash.isEmpty());//Hash'in boş mu dolu mu olduğunu ekrana yazdırıyoruz.
        //Farklı türlerden veriler eklendi;
        hash.add("12 Str");
        hash.add(12);
        hash.add(12.0);
        hash.add(true);
        hash.add(null);

        hash.remove(12);//int türündeki 12 değeri listeden çıkarıldı.

        System.out.println("Boyut : "+hash.size());//Ekrana hash boyutu yazıldı.

        Iterator itr= hash.iterator();//hash nesnesinin elemanlarında gezecek iterator oluşturuldu.

        //itr ile tüm elemanlar gezilerek ekrana yazıldı;
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(hash.isEmpty());
    }
}

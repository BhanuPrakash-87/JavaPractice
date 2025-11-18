import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(100, "Apple");
        hmap.put(200, "Orange");
        hmap.put(null, "Mango");
        hmap.put(null,null);

        Iterator<Entry<Integer, String>> itr1 = hmap.entrySet().iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            hmap.put(300, "Grapes");
        }

        Map<Integer, String> conHmap = new ConcurrentHashMap()<>();
        conHmap.put(100, "Apple");
        conHmap.put(200, "Orange");
        conHmap.put(null, "Mango");
        conHmap.put(null,null);

        Iterator<Entry<Integer, String>> itr2 = conHmap.entrySet().iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
            conHmap.put(300, "Grapes");
        }
    }
}

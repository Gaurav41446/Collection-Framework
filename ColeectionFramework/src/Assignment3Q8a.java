import java.util.concurrent.*;
import java.util.*;

public class Assignment3Q8a {
    public static void main(String[] args) {
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        Iterator<Integer> iterator = map.keySet().iterator();
        new Thread(() -> {
            map.put(4, "Four");
        }).start();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " - " + map.get(key));
        }
    }
}

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Assignment3Q8b {
    public static CopyOnWriteArrayList<Integer> failFast(CopyOnWriteArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("Value: " + value);
            list.add(4);
        }
        return list;
    }
    public static void main(String args[]) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3});
        System.out.println("Before modification: " + list);

  failFast(list);

        System.out.println("After modification: " + list);
    }
}

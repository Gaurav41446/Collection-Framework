import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment3Q2 {
    public static void main(String[] args) {

        // Create a HashSet and add elements to it
        HashSet<String> unorderedSet = new HashSet<>();
        unorderedSet.add("Apple");
        unorderedSet.add("Banana");
        unorderedSet.add("Orange");

        System.out.println("HashSet elements:");
        for(String element: unorderedSet) {
            System.out.println(element);
        }

        // Create a LinkedHashSet and add elements to it
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("Apple");
        orderedSet.add("Banana");
        orderedSet.add("Orange");

        System.out.println("Linkedhashset elements:");
        for(String element: orderedSet) {
            System.out.println(element);
        }

    }
    public static LinkedHashSet<String> ordered(LinkedHashSet<String> linkedHashSet){
        return linkedHashSet;
    }
    public static HashSet<String> unordered(HashSet<String> hashSet){
        return hashSet;
    }
}

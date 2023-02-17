
import java.util.*;
public class Assignment3Q3 {
    public static List traverseReverse(ArrayList aList){
        ListIterator<Integer> List_Iterator = aList.listIterator(aList.size());
        while(List_Iterator.hasNext()) {
            List_Iterator.next();
        }
        System.out.println("Reversed : ");
        while(List_Iterator.hasPrevious()) {
            System.out.println(List_Iterator.previous());
        }
        return aList;

    }
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        // add elements
        aList.add(10);
        aList.add(9);
        aList.add(8);
        aList.add(7);
        aList.add(6);
        System.out.println(aList);
        traverseReverse(aList);




    }
}

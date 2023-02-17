import java.util.ArrayList;

public class BinarySearchArrayList {
    public static int binarySearch(ArrayList<Integer> list, int key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = list.get(mid);

            if (midValue < key) {
                low = mid + 1;
            } else if (midValue > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(13);

        int key = 7;
        int index = binarySearch(list, key);
        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}


import java.util.ArrayList;

public class QuickSortArrayList {

    public static void quickSort(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        sort(list, 0, list.size() - 1);
    }

    private static void sort(ArrayList<Integer> list, int left, int right) {
        int i = left;
        int j = right;
        int pivot = list.get(left + (right - left) / 2);

        while (i <= j) {
            while (list.get(i) < pivot) {
                i++;
            }
            while (list.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
                i++;
                j--;
            }
        }

        if (left < j) {
            sort(list, left, j);
        }
        if (i < right) {
            sort(list, i, right);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(3);
        list.add(9);

        System.out.println("Before sorting: " + list);
        quickSort(list);
        System.out.println("After sorting: " + list);
    }
}

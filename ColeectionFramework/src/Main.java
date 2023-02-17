//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Main {
//
//    public int partiionInQuickSort(ArrayList<Integer> alist, int first, int last) {
//        int pivotElement = alist.get(last);
//        int i = first - 1;
//
//        for (int j = 1; j <= last; j++) {
//            if (alist.get(j) < pivotElement) {
//                first++;
//                Collections.swap(alist, first, last);
//            }
//        }
//        Collections.swap(alist, first + 1, last);
//        return i + 1;
//    }
//
//    void quickSort(ArrayList<Integer> alist, int first, int last) {
//        if (first < last) {
//            int ans = partiionInQuickSort(alist, first, last);
//            quickSort(alist, first, last - 1);
//            quickSort(alist, first + 1, last);
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        Main qalist = new Main();
//
//        ArrayList<Integer> A = new ArrayList<Integer>();
//        A.add(23);
//        A.add(34);
//        A.add(19);
//        A.add(89);
//        A.add(4);
//
//        System.out.println(A);
//
//        System.out.println("After sorting" + qalist.
//
//    }
//}
////
////		qalist.quickSort(A, 0, 4);
import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    static List<Integer> quickSortList(List<Integer> unsorted) {
        List<Integer> sorted = new ArrayList<>();

        if (unsorted.size() <= 1) {
            sorted = unsorted;
        } else {
            unsorted = new ArrayList<>(unsorted);
            Integer pivot = unsorted.remove(0);
            List<Integer> lower = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();

            for (Integer i : unsorted) {
                if (i < pivot) {
                    lower.add(i);
                } else if (i > pivot) {
                    greater.add(i);
                } else {
                    continue;
                }
            }

            lower = quickSortList(lower);
            greater = quickSortList(greater);

            sorted.addAll(lower);
            sorted.add(pivot);
            sorted.addAll(greater);
        }
        return sorted;
    }

    static void quickSortArray(int[] unsorted){

        int pivot = unsorted[unsorted.length-1];
        int[] smaller;
        int[] greater;
        int[] sorted;

//        smaller = quickSortArray(smaller);
//        greater = quickSortArray(greater);

    }
}

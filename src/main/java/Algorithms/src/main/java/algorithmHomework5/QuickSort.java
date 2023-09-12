package algorithmHomework5;

import java.util.ArrayList;

public class QuickSort {
    public static ArrayList<Integer> quicksort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size() - 1);
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < pivot) leftArray.add(arr.get(i));
            else rightArray.add(arr.get(i));
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quicksort(leftArray));
        result.add(pivot);
        result.addAll(quicksort(rightArray));
        return result;
    }

}

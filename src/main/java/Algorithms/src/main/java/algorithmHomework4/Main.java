package algorithmHomework4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //#1.0
        int[] unsortedArray0 = {};
        int[] unsortedArray = {64, 34, 25, 12,44,15,7, 22, 11, 90};
        mergeSort(unsortedArray);
        System.out.println("#1.0:  { "+merge(unsortedArray0,unsortedArray0,unsortedArray0)+" }");
        System.out.println("#1.1"+Arrays.toString(unsortedArray));
        int[] array1 = {64, 34, 25, 12,44};
        int[] array2 = {15,7, 22, 11, 90};
        System.out.println(" #1.2 merge :  "+merge(unsortedArray,array1,array2));
        //#2
        int[] unsortedArr = {64, 34, 25, 12,44,15,7, 22, 11, 90};
        MengeSort mengeSort = new MengeSort();
        mengeSort.mengeSorting(unsortedArr);
        System.out.println("#2th method: "+Arrays.toString(unsortedArr));


// results :
// #1.0:  { 0 }
//#1.1[7, 11, 12, 15, 22, 25, 34, 44, 64, 90]
// #1.2 merge :  5
//#2th method: [7, 11, 12, 15, 22, 25, 34, 44, 64, 90]
//Process finished with exit code 0
    }
        public static void mergeSort ( int[] arr){
            if (arr.length <= 1) {
                return;
            }

            int middle = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, middle);
            int[] right = Arrays.copyOfRange(arr, middle, arr.length);

            mergeSort(left);
            mergeSort(right);

            merge(arr, left, right);
        }

        public static int merge (int[] arr, int[] left, int[] right){
            int i = 0, j = 0, k = 0;

            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }
            return i;
        }

}
package algorithmsHomework4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //#1
        int[] unsortedArray = {64, 34, 25, 12,44,15,7, 22, 11, 90};
        mergeSort(unsortedArray);
        System.out.println("#1"+Arrays.toString(unsortedArray));
        // #2
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] array0 = {};
        int[] array1 = {64, 34, 25, 12,44,15,7, 22, 11, 90};
        int[] array2 = {64, 34, 25, 12, 22, 11};
        System.out.println("#2:  "+merge(array0,array0,array0));
        System.out.println("#3:  "+merge(arr,array1,array2));
        //#3
        int[] unsortedArr = {64, 34, 25, 12,44,15,7, 22, 11, 90};
        MengeSort mengeSort = new MengeSort();
        mengeSort.mengeSorting(unsortedArr);
        System.out.println("#4"+Arrays.toString(unsortedArr));

// results :
// #1[7, 11, 12, 15, 22, 25, 34, 44, 64, 90]
//#2:  0
//#3:  10
//#4[7, 11, 12, 15, 22, 25, 34, 44, 64, 90]
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
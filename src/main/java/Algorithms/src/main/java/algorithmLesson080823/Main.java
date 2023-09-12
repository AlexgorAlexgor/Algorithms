package algorithmLesson080823;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        System.out.println(Arrays.toString(mergeSort(arr)));

        int[] arr1 = {5, 7, 2, 4, 6, 8};
        int[] arr2 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(arr1, arr2)));


        int[] arr3 = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        int[] sortedArr = quickSort(arr3);
        System.out.println(Arrays.toString(sortedArr));

        int[] arr4 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArr4 = quickSort1(arr4);
        System.out.println(Arrays.toString(sortedArr4));

        int[] arr5 = {0, 1, 0, 1, 1, 0, 0, 0, 1};
        sort(arr5);
        System.out.println(Arrays.toString(arr5));

        /*  Results

        [1, 2, 3, 4, 5, 6, 7, 8]
        [2, 4, 5, 6, 7, 2, 4, 6, 8, 8]
        [2, 3, 5, 6, 7, 9, 10, 11, 12, 14]
        [1, 2, 3, 4, 5, 6, 7, 8]
        [0, 0, 0, 0, 0, 1, 1, 1, 1]

        Process finished with exit code 0
        */
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int m = 0;
        int[] arr = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) arr[m++] = arr1[i++];
            else arr[m++] = arr2[j++];
        }
        while (i < arr1.length) {
            arr[m++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr[m++] = arr2[j++];
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int pivot = arr[arr.length - 1];
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < pivot) {
                left[leftIndex++] = arr[i];
            } else {
                right[rightIndex++] = arr[i];
            }
        }
        left = Arrays.copyOf(left, leftIndex);
        right = Arrays.copyOf(right, rightIndex);

        int[] sortedLeft = quickSort(left);
        int[] sortedRight = quickSort(right);
        int[] result = new int[sortedLeft.length + sortedRight.length + 1];
        System.arraycopy(sortedLeft, 0, result, 0, sortedLeft.length);
        result[sortedLeft.length] = pivot;
        System.arraycopy(sortedRight, 0, result, sortedLeft.length + 1, sortedRight.length);

        return result;
    }

    public static int[] quickSort1(int[] arr) {
        if (arr.length <= 1) return arr;
        int k = arr[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < k) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[index];
        arr[index] = temp;

        int[] leftPart = quickSort(Arrays.copyOfRange(arr, 0, index));
        int[] rightPart = quickSort(Arrays.copyOfRange(arr, index + 1, arr.length));

        int[] result = new int[arr.length];
        System.arraycopy(leftPart, 0, result, 0, leftPart.length);
        result[index] = k;
        System.arraycopy(rightPart, 0, result, index + 1, rightPart.length);

        return result;
    }


    public static void sort(int[] A) {
        int zeros = 0;
        for (int value : A) {
            if (value == 0) {
                zeros++;
            }
        }
        int k = 0;
        while (zeros-- != 0) {
            A[k++] = 0;
        }
        while (k < A.length) {
            A[k++] = 1;
        }
    }


}

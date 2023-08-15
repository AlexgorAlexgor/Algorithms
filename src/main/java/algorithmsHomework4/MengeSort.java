package algorithmsHomework4;

import java.util.Arrays;

public class MengeSort {

    public void mengeSorting(int[] arr) {
        if ( arr.length <= 1) return ;
        int pivot =arr.length/2;
        int[] leftArray = Arrays.copyOfRange(arr,0,pivot);
        int[] rightArray=Arrays.copyOfRange(arr,pivot,arr.length);
        mengeSorting(leftArray);
        mengeSorting(rightArray);
     //   merge(arr, left, right);
        mengeInt(arr,leftArray, rightArray);
    }
    public int mengeInt(int[] arr, int[] leftArray, int[] rightArray){
        int i = 0, j = 0, k = 0;
        while (i < leftArray .length  && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArray.length) {
            arr[k++] = rightArray[j++];
        }
        return i;
    }
}
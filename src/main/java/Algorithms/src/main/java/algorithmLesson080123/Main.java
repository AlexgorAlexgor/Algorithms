package algorithmLesson080123;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
   //#1
        System.out.println(Hanoi(10,"A","C","B"));
//#2
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(unsortedArray);
        System.out.println("#2"+Arrays.toString(unsortedArray));
        // #3
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {64, 34, 25, 12, 22, 11, 90};

       // merge(int array1,int array2);
    }
    public static String Hanoi(int n,String A,String C,String B){
        if (n==1) return A+C+" ";
        return Hanoi(n-1,A,B,C)+A+C+" "+Hanoi(n-1,B,C,A);
    }

    public static void mergeSort(int[] arr) {
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

    public static void merge(int[] arr, int[] left, int[] right) {
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
    }
    //public static  int []
}
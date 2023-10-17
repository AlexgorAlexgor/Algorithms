package algorithmLesson070423;

public class SumPair {

    public static void main(String args[]) {
        int[] array = {1, 5, 3, 7, 8, 2, 9, 6, 4};
        sum(array, 10);
        sum3(array, 10);
    }

    public static void sum(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i]+ " "+arr[j]+" ");
                }
            }
        }
    }

    public static void sum3(int[] arr, int k) {
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int n = j + 1; n < arr.length ; n++) {
                    if (arr[i] + arr[j] +arr[n]== k) {
                        System.out.println(arr[i]+ " "+arr[j]+" "+arr[n]+ " ");
                    }
                }return;
            }
        }

    }
}
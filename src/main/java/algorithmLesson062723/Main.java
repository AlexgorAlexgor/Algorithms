package algorithmLesson062723;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            boolean x = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) x = true;
            }
            if (!x) System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("#0");

//        Написать алгоритм сортирования следующим образом: после каждого пробега числа "падают" на свои места. (После первого пробега самое маленькое число под нулевой индекс, после следующего пробега второе по величине число на под первый индекс, и т.д)


                int[] arr = {5, 4, 3, 2, 1};
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr.length - 1 - i; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));
        System.out.println("#1");

                int[] arr1 = {5, 4, 3, 2, 1};
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = arr1.length - 2 ; j >=i; j--) {
                        if (arr1[j] > arr1[j + 1]) {
                            int temp = arr1[j];
                            arr1[j] = arr1[j + 1];
                            arr1[j + 1] = temp;
                        }
                    }
                    System.out.println(Arrays.toString(arr1));
                }
        System.out.println("#2");
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binary(arr2,9));
    }
    public static int binary(int[] arr2, int k) {
        int start = 0;
        int end = arr2.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (k == arr2[mid]) return mid;
            else if (k > arr2[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
            }
        }



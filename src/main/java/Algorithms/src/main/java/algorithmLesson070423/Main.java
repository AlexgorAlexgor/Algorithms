package algorithmLesson070423;

import java.util.Arrays;

public class Main extends Exception {
    public static void main(String args[]) throws Exception {


        int[] array = {5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(array)+"*");
        System.out.println(Arrays.toString(bubbleSort(array)));

       System.out.println(progressionRecursive(8));
       System.out.println(progression(5));
        System.out.println("Посчитать факториал двумя способами: рекурсивно и итеративно (факториал числа - это все числа умноженные друг на друга начиная с 1 включая это число. f(5)=1*2*3*4*5)");
        System.out.println(factorialRecursive(-2));
        System.out.println(factorial(5));

    }
public static int progressionRecursive(int n) throws Exception {
    if (n<0) throw new Exception("the number should be positive");
    if (n==1) return 1;
        return progressionRecursive(n-1)+n;
}
    public static int factorialRecursive(int n) {

        if (n > 0) {
            if (n == 1) return 1;
            return factorialRecursive(n - 1) * n;
        } else {
            //         throw new Exception("the number should b positive");
        }
        return n;
    }

    public static int factorial(int n) {
     //   if (n<0) throw Exception("the number should b positive");
        int multi = 1;
        for (int i=1;i<=n;i++){
            multi=multi*i;
        }
        return multi;
    }
    public static int progression(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
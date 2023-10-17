package algorithmLesson071123;
class Main {
    public static void main(String[] args) {
        System.out.println(Hanoi(6, "A", "C", "B"));

        System.out.println(progression(15));

        System.out.println(progressionRecursion(15));

        System.out.println(fibonacci(33));

        System.out.println(fibonacciRecursive(32));

        int[] array = {3, 4, 5, 6, 7, 8, 1, 2};
        System.out.println(index(array));


    }

    public static String Hanoi(int n, String A, String C, String B) {
        if (n == 1) return A + C + " ";
        return Hanoi(n - 1, A, B, C) + A + C + " " + Hanoi(n - 1, B, C, A);
    }

    public static int progression(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int progressionRecursion(int number) {
        if (number == 1) return 1;
        return progression(number - 1) + number;
    }

    public static int fibonacci(int number) {
        if (number == 1) return 0;
        if (number == 2) return 1;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static int fibonacciRecursive(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;
        int el = 0;
        int el1 = 0;
        int el2 = 1;
        for (int i = 2; i <= number; i++) {
            el = el1 + el2;
            el1 = el2;
            el2 = el;
        }
        return el;
    }

    public static int index(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return i + 1;
        }
        return -1;
    }
}
   /* Hanoi(n,A,C,B) = Hanoi(n-1,A,B,C)+AC+Hanoi(n-1,B,C,A)
        Hanoi(3,A,C,B) = Hanoi(2,A,B,C)+AC+Hanoi(2,B,C,A)
        Hanoi(2,A,B,C) = Hanoi(1,A,C,B)+AB+Hanoi(1,C,B,A) = AC+AB+CB
        Hanoi(2,B,C,A) = Hanoi(1,B,A,C)+BC+Hanoi(1,A,C,B) = BA+BC+AC
        Hanoi(3,A,C,B) = AC+AB+CB+AC+BA+BC+AC

        AB AC BC AB CA CB AB AC BC BA CA BC AB AC BC AB CA CB AB CA BC BA CA CB AB AC BC AB CA CB AB AC BC BA CA BC AB AC BC BA CA CB AB CA BC BA CA BC AB AC BC AB CA CB AB AC BC BA CA BC AB AC BC
120
120
2178309
2178309

        */
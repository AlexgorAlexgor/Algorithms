package algorithmLesson090523;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //#1
        LinkedList train = new LinkedList(10);
        train.push(20);
        train.push(30);
        System.out.println("#1 :" + train.next.value);

        //#2
        int[] array = {25, 10, 5, 1};
        int num = 63;
        System.out.println("#2 :" + minCoins(array, num));
        //#3
        int[] array1 = {25, 10, 5, 4};
        System.out.println("#3 arr:" + Arrays.toString(array1)+ ", num is : "+num);

        int number = 63;
        System.out.println("#3 :" + Arrays.toString(minCoins1(array1, number)));
//#4
        int[][] array2 = {{1, 3}, {0, 4}, {1, 4}, {3, 4}, {3, 5}, {4, 5}, {1, 6}, {2, 7}, {7, 9}, {10, 12}};
        /*int[][] array2 = {{1, 3},
                {0, 4},
                {1, 8},
                {3, 4},
                {3, 5},
                {4, 5},
                {1, 3},
                {2, 7},
                {7, 9},
                {10, 12}};*/
        for (int[] act : activities(array2))
            System.out.println("#4 :" + Arrays.toString(act));
        //#5
        int[] array3 = {1, 2, -3, -2,4};
        System.out.println("#5 : " + zeroSubarray((array3)));

    }
        public static int minCoins(int[] arr, int num) {
            int count = 0;
            for (int coin : arr) {
                while (coin <= num) {
                    num = num - coin;
                    count++;
                    System.out.print(coin+" ");
                }
            }
            System.out.println();
            return num == 0 ? count : -1;

        }
// "#3 :" +

    public static int[] minCoins1(int[] arr, int num) {
            int[] dp = new int[num+1];
            dp[0] = 0;
            for(int i=1;i<=num;i++){
                dp[i] = Integer.MAX_VALUE;
            }
            for (int coin:arr) {
                for (int i = coin; i <= num; i++) {
                    if (dp[i - coin]!=Integer.MAX_VALUE)
                        dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
            return dp;
        }
        //#3
     //   public static minLift(int[] arr, int x) {
//int[] dif = new int[num+1];
           // dif[0] = 0;
         //   for (int i = 0; i < num; i++) {
          //      dif[i] = Math.min(dp[i], dp[i - coin] + 1);
        //   }

    //#4

    public static ArrayList<int[]> activities(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        ArrayList<int[]> result = new ArrayList<>();
        int finish = arr[0][1];
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] >= finish) {
                result.add(arr[i]);
                finish = arr[i][1];
            }
        }
        return result;
    }

    // #5
    public static boolean zeroSubarray(int[] arr) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for (int x:arr) {
            sum += x;
            if (set.contains(sum)) return true;
            set.add(sum);
        }
        return false;
    }
    // Result:
    //#1 :20
    //25 25 10 1 1 1
    //#2 :6
    //#3 arr:[25, 10, 5, 4], num is : 63
    //#3 :[0, 2147483647, 2147483647, 2147483647, 1, 1, 2147483647, 2147483647, 2, 2, 1, 2147483647, 3, 3, 2, 2, 4, 4, 3, 3, 2, 5, 4, 4, 3, 1, 5, 5, 4, 2, 2, 6, 5, 3, 3, 2, 6, 4, 4, 3, 3, 5, 5, 4, 4, 3, 6, 5, 5, 4, 2, 6, 6, 5, 3, 3, 7, 6, 4, 4, 3, 7, 5, 5]
    //#4 :[1, 3]
    //#4 :[3, 4]
    //#4 :[4, 5]
    //#4 :[7, 9]
    //#4 :[10, 12]
    //#5 : true
    //
    //Process finished with exit code 0

}











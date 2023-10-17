package algorithmLesson062023;


public class NonDecreasingNumbers {
    // Требуется проверить является ли последовательность целых чисел неубывающей

    // a - последовательность
    // a_i -> элемент последовательности
    // int[] a = {1,2,3}
    // a_0 -> 1
    // a_1 -> 2
    // a_2 -> 3
    // неубывающая: a_(i-1) <= a_(i)

    // [1,2,3]
    // a_0 -> 1
    // a_1 -> 2
    // a_2 -> 3
    // i = 0, a_(-1) -> ошибка
    // i = 1, a_0 <= a_1 -> 1 <= 2 -> true
    // i = 2, a_1 <= a_2 -> true
    // i = 3 не существует

    // Примеры:
    // [1,2,3] -> true
    // [1,1,2] -> true
    // [] -> false
    // [1,2,1,0,-1] -> false
    // [3,2,1] -> false
    // [1,2,3,4,5,6,7,8,10,15,20] -> true
    // [1,2,3,4,5,6,20,7,8,10,15] -> false

    // разница js и java
    // int a = 1; js -> var a = 1;
    // int[] arr - {1,2,3} -> js var a = [1,2,3]

    // function isNonDecreasing(nums) {}

    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        int[] nums = {};
        int[] nums = {3,2,1};
        System.out.println("The result is " + isNonDecreasingQuadratic(nums));
    }

    private static boolean isNonDecreasingQuadratic(int[] nums) {
        // [] -> false
        if (nums.length == 0) {
            return false;
        }

        // [1,2]
        for (int i = 0; i < nums.length; i++) {
            int leftElement = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int rightElement = nums[j];
                if (leftElement <= rightElement) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isNonDecreasing(int[] nums) {
        // [] -> false
        if (nums.length == 0) {
            return false;
        }
        // неубывающая: a_(i-1) <= a_(i)
        for (int i = 1; i < nums.length; i++) {
            int leftElement = nums[i-1]; // 3
            int rightElement = nums[i]; // 2
            // 3 <= 2
            if (leftElement <= rightElement) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
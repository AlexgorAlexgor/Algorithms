package algorithmLesson081523;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> circleSort
            (ArrayList<Integer> arr4) {
        if (arr4.size() <= 1) return arr4;
        // int pivot = arr4.get(arr4.size() - 1);
        for (int i = 0; i < arr4.size() - 1; i++) {
            if (arr4.get(i) < arr4.get(arr4.size() - i)) ;
            int index = i;

        System.out.println("#5  "+i);}
        return arr4;
    };


        //[7, 8, -1, 0, 1, 2, 3, 4, 5, 6];

    public static int findRotation(int[] numbers){
        int left = 0;
        int right = numbers.length-1;

        while (left<=right){
            if (numbers[left]<numbers[right]){
                return left;
            }

            int mid = (left+right)/2;

            int next = (mid+1)%numbers.length;
            int prev = (mid-1 +numbers.length)%numbers.length;

            if(numbers[mid]<=numbers[next] && numbers[mid]<=numbers[prev]) {
                return mid;
            }
            else if (numbers[mid]<=numbers[right]){
                right = mid-1;
            }
            else if (numbers[mid]>=numbers[left]){
                left = mid+1;
            }
        }
        return -1;
    }

    public static int[] sort(int[] array){
        int count = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]==0) count++;
        }
        for (int i=0;i<count;i++){
            array[i]=0;
        }
        for (int i=count;i<array.length;i++){
            array[i]=1;
        }
        return array;
    }
    public static ArrayList<Integer> quicksort(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size() - 1);
        ArrayList<Integer> leftArray = new ArrayList<>();
        ArrayList<Integer> rightArray = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < pivot) leftArray.add(arr.get(i));
            else rightArray.add(arr.get(i));
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quicksort(leftArray));
        result.add(pivot);
        result.addAll(quicksort(rightArray));
        return result;
    }

    public static ArrayList<Integer> quicksort1(ArrayList<Integer> arr1) {
        if (arr1.size() <= 1) return arr1;
        int index = 0;
        int pivot = arr1.get(arr1.size() - 1);
        for (int i = 0; i < arr1.size() - 1; i++) {
            if (arr1.get(i) < pivot) {
                int temp = arr1.get(i);
                arr1.set(i, arr1.get(index));
                arr1.set(index, temp);
                index++;
            }
        }
        int temp = arr1.get(arr1.size() - 1);
        arr1.set(arr1.size() - 1, arr1.get(index));
        arr1.set(index, temp);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quicksort(new ArrayList<>(arr1.subList(0, index))));
        result.add(pivot);
        result.addAll(quicksort(new ArrayList<>(arr1.subList(index + 1, arr1.size()))));
        return result;
    }

    public static void main(String[] args) {
        //#1
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(4);
        array.add(6);
        array.add(2);
        array.add(1);
        array.add(7);
        System.out.println("#1:" + quicksort((array)));
//#2

        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(5);
        array1.add(4);
        array1.add(3);
        array1.add(2);
        array1.add(1);
        array1.add(9);
        System.out.println("#2:" + quicksort1((array1)));
        // #3
        int[] array3 = {1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1};
        System.out.println("#3:" + Arrays.toString(sort(array3)));
        //4
        int[] arr4 = {7, 8, -1, 0, 1, 2, 3, 4, 5, 6};
        /*ArrayList<Integer> arr4 =  new ArrayList<>();
        arr4.add(7);
        arr4.add(8);
        arr4.add(-1);
        arr4.add(0);
        arr4.add(1);
        arr4.add(2);
        arr4.add(3);
        arr4.add(4);
        arr4.add(5);
        arr4.add(6);
*/

        // {7, 8, -1, 0, 1, 2, 3, 4, 5, 6};
        System.out.println("#4:" + Arrays.toString(arr4));
       // System.out.println("#4:" + Arrays.toString(circleSort(arr4)));

        int[] numbers = {8,9,10,1,2,3,4,5,6,7};

        System.out.println("#4:  " +findRotation(numbers));
    }
}

/*import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> quicksort(ArrayList<Integer> arr) {
        if (arr.size()<=1) return arr;
        int index = 0;
        int pivot = arr.get(arr.size()-1);
        for (int i=0;i<arr.size()-1;i++){
            if (arr.get(i)<pivot){
                int temp = arr.get(i);
                arr.set(i,arr.get(index));
                arr.set(index,temp);
                index++;
            }
        }
        int temp = arr.get(arr.size()-1);
        arr.set(arr.size()-1,arr.get(index));
        arr.set(index,temp);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quicksort(new ArrayList<>(arr.subList(0,index))));
        result.add(pivot);
        result.addAll(quicksort(new ArrayList<>(arr.subList(index+1,arr.size()))));
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        System.out.println(quicksort((array)));

    }
}

import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> quicksort(ArrayList<Integer> arr) {
        if (arr.size()<=1) return arr;
        int index = 0;
        int pivot = arr.get(arr.size()-1);
        for (int i=0;i<arr.size()-1;i++){
            if (arr.get(i)<pivot){
                int temp = arr.get(i);
                arr.set(i,arr.get(index));
                arr.set(index,temp);
                index++;
            }
        }
        int temp = arr.get(arr.size()-1);
        arr.set(arr.size()-1,arr.get(index));
        arr.set(index,temp);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quicksort(new ArrayList<>(arr.subList(0,index))));
        result.add(pivot);
        result.addAll(quicksort(new ArrayList<>(arr.subList(index+1,arr.size()))));
        return result;
    }


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        System.out.println(quicksort((array)));

    }
}
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] sort(int[] array){
        int count = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]==0) count++;
        }
        for (int i=0;i<count;i++){
            array[i]=0;
        }
        for (int i=count;i<array.length;i++){
            array[i]=1;
        }
        return array;
    }



    public static void main(String[] args) {
      int [] array = {1,0,1,0,0,1,1,1};
        System.out.println(Arrays.toString(sort(array)));

    }
}
public class Main {
    public static int findRotation(int[] numbers){
        int left = 0;
        int right = numbers.length-1;

        while (left<=right){
            if (numbers[left]<numbers[right]){
                return left;
            }

            int mid = (left+right)/2;

            int next = (mid+1)%numbers.length;
            int prev = (mid-1 +numbers.length)%numbers.length;

            if(numbers[mid]<=numbers[next] && numbers[mid]<=numbers[prev]) {
                return mid;
            }
            else if (numbers[mid]<=numbers[right]){
                right = mid-1;
            }
            else if (numbers[mid]>=numbers[left]){
                left = mid+1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(findRotation(numbers));

    }
}
*/



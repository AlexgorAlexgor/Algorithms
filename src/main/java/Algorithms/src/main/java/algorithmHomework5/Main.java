package algorithmHomework5;

import java.util.ArrayList;

import static algorithmHomework5.QuickSort.quicksort;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(4);
        array.add(6);
        array.add(2);
        array.add(1);
        array.add(7);
        out.println("#1 entered Array :" +array);
        out.println("#2:sorted Array :" + quicksort((array)));
    }
}
/*
Results:
        #1 entered Array :[5, 4, 6, 2, 1, 7]
        #2:sorted Array :[1, 2, 4, 5, 6, 7]

        Process finished with exit code 0*/

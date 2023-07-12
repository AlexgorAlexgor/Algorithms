package algorithmsHomework3;
/*Algorithms recRk8eLnHE4w57x9
        Описание задания.
        1 уровень сложности: Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на k-й позиции в конечном отсортированном массиве.
        Массив 1 - 100 112 256 349 770
        Массив 2 - 72 86 113 119 265 445 892
        к = 7
        Вывод : 256
        Окончательный отсортированный массив -
        72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
        7-й элемент этого массива равен 256.*/


public class FindKthElement {


    public static int findKthElement(int[] array1, int[] array2, int k) {
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];

        int i = 0, j = 0, index = 0;

        // Слияние двух отсортированных массивов в один
        while (i < length1 && j < length2) {
            if (array1[i] <= array2[j]) {
                mergedArray[index++] = array1[i++];
            } else {
                mergedArray[index++] = array2[j++];
            }
        }

        // Добавление оставшихся элементов из первого массива
        while (i < length1) {
            mergedArray[index++] = array1[i++];
        }

        // Добавление оставшихся элементов из второго массива
        while (j < length2) {
            mergedArray[index++] = array2[j++];
        }

        // Возврат элемента на k-й позиции
        return mergedArray[k - 1];
    }

    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int result = findKthElement(array1, array2, k);

        System.out.println("Элемент на " + k + "-й позиции: " + result);
    }
}

 /*   Элемент на 7-й позиции: 256

        Process finished with exit code 0*/
package algorithmHomework7;

import java.util.ArrayList;

public class SpecialStack<I extends Number> {
    /*   Задача getMin() и getMax()
        Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком, такие как push(), pop(), isEmpty(), … и дополнительные операции getMin() и getMax(), которые должны возвращать минимальный и максимальный элементы из SpecialStack.
   */
    public ArrayList<Integer> numbers;

    public SpecialStack() {
        numbers = new ArrayList<>();
    }

    public void push(Integer number) {
        numbers.add(number);
    }

    public boolean isEmpty() {
        return numbers.size() == 0;
    }

    public Integer pop() {
        if (!isEmpty()) {
            Integer poppedNumber = numbers.get(numbers.size() - 1);
            numbers.remove(numbers.size() - 1);
            return poppedNumber;
        } else {
            throw new RuntimeException("pop from an empty stack");
        }
    }

    public int getMin() {
        if (isEmpty()) {throw new RuntimeException("getMin from an empty stack");};
        if (numbers.size() - 1 == 0) {return 0;};
        int current = numbers.size() - 1;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(current) > numbers.get(i )) {current = i ;}
        }
        return current;
    }
       public int getMax () {
           if (isEmpty()) {throw new RuntimeException("getMax from an empty stack");};
           if (numbers.size() - 1 == 0) {return 0;};
           int current = numbers.size() - 1;
           for (int i = 0; i < numbers.size()-1 ; i++) {
               if (numbers.get(current) < numbers.get(i )) {current = i ;}
           }
           return current;
       }
}



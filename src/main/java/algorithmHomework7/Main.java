package algorithmHomework7;

public class Main {
    public static void main(String[] args) {
     /*   Задача getMin() и getMax()
        Реализовать структуру данных SpecialStack, которая поддерживает все операции со стеком, такие как push(), pop(), isEmpty(), … и дополнительные операции getMin() и getMax(), которые должны возвращать минимальный и максимальный элементы из SpecialStack.
   */
        SpecialStack<Integer> specialStack= new SpecialStack<>();
        System.out.println("#0_specialStack.isEmpty_: " + specialStack.isEmpty());
      // System.out.println("#3 min index=(getMin from an empty stack) "+specialStack.getMin());

      /*  Exception in thread "main" java.lang.RuntimeException: getMin from an empty stack
        at algorithmHomework7.SpecialStack.getMin(SpecialStack.java:34)
        at algorithmHomework7.Main.main(Main.java:10)

        Process finished with exit code 1*/

        specialStack.push(3);
        System.out.println("#3 min index= "+specialStack.getMin());

        specialStack.push(6);
        specialStack.push(11);
        System.out.println("#1_specialStack.push_: " + specialStack.numbers);
        int x = specialStack.pop();
        System.out.println("#2 popped element _: " + x);

        specialStack.push(11);
        specialStack.push(6);
        specialStack.push(1);
        System.out.println("#3_specialStack_: " + specialStack.numbers);
        System.out.println("#3 min index= "+specialStack.getMin());
        System.out.println("#3 min number is : "+ specialStack.numbers.get(specialStack.getMin()));
        System.out.println("#3 max index= "+specialStack.getMax());
        System.out.println("#3 max number is : "+ specialStack.numbers.get(specialStack.getMax()));


    }
}
    /*
Results:
#0_specialStack.isEmpty_: true
#3 min index= 0
#1_specialStack.push_: [3, 6, 11]
#2 popped element _: 11
#3_specialStack_: [3, 6, 11, 6, 1]
#3 min index= 4
#3 min number is : 1
#3 max index= 2
#3 max number is : 11

Process finished with exit code 0
      */

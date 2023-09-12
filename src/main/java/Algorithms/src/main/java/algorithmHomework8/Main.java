package algorithmHomework8;

public class Main {
    // Реализовать методы в LinkedList, которые не успели в классе.
    //pushToTail(int data),
    //pushToIndex(int index, int data) ,   removeLast(),
    //remove(int index)     ,    get(int index).
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.pushToTail(10);
        list.pushToTail(20);
        list.pushToTail(30);
        list.pushToTail(40);

        list.printList(); // Вывод: 1 2 3 4

        list.pushToIndex(2, 50);

        list.printList(); // Вывод: 10 20 50 30 40

        list.removeLast();

        list.printList(); // Вывод: 10 20 50 30

        list.remove(1);

        list.printList(); // Вывод: 10 50 30

        System.out.println("Элемент с индексом 1: " + list.get(1)); // Вывод: 50
    }
}

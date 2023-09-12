package algorithmHomework8;

import java.util.NoSuchElementException;


// Реализовать методы в LinkedList, которые не успели в классе.
    //pushToTail(int data),
    //pushToIndex(int index, int data) ,   removeLast(),
    //remove(int index)     ,    get(int index).
    public class LinkedList {
        private Node head;

        public LinkedList() {
            head = null;
        }

        // Метод для добавления элемента в конец списка
        public void pushToTail(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Метод для добавления элемента по индексу
        public void pushToIndex(int index, int data) {
            if (index < 0) {
                throw new IllegalArgumentException("Индекс должен быть неотрицательным");
            }

            if (index == 0) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            } else {
                Node newNode = new Node(data);
                Node current = head;
                int currentIndex = 0;

                while (current != null && currentIndex < index - 1) {
                    current = current.next;
                    currentIndex++;
                }

                if (current == null) {
                    throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
                }

                newNode.next = current.next;
                current.next = newNode;
            }
        }

        // Метод для удаления последнего элемента
        public void removeLast() {
            if (head == null) {
                throw new NoSuchElementException("Список пуст");
            }

            if (head.next == null) {
                head = null;
            } else {
                Node current = head;
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }
        }

        // Метод для удаления элемента по индексу
        public void remove(int index) {
            if (index < 0) {
                throw new IllegalArgumentException("Индекс должен быть неотрицательным");
            }

            if (index == 0) {
                if (head == null) {
                    throw new NoSuchElementException("Список пуст");
                }
                head = head.next;
            } else {
                Node current = head;
                int currentIndex = 0;

                while (current != null && currentIndex < index - 1) {
                    current = current.next;
                    currentIndex++;
                }

                if (current == null || current.next == null) {
                    throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
                }

                current.next = current.next.next;
            }
        }

        // Метод для получения элемента по индексу
        public int get(int index) {
            if (index < 0) {
                throw new IllegalArgumentException("Индекс должен быть неотрицательным");
            }

            Node current = head;
            int currentIndex = 0;

            while (current != null && currentIndex < index) {
                current = current.next;
                currentIndex++;
            }

            if (current == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
            }

            return current.data;
        }

        // Метод для вывода списка
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
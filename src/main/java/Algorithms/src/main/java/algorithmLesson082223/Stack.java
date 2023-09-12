package algorithmLesson082223;
import java.util.ArrayList;

public class Stack<T> {
    public ArrayList<T> items;

    public Stack() {
        items = new ArrayList<>();
    }


    public void push(T item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.size() == 0;
    }

    public T pop() {
        if (!isEmpty()) {
            T poppedItem = items.get(items.size() - 1);
            items.remove(items.size() - 1);
            return poppedItem;
        } else {
            throw new RuntimeException("pop from an empty stack");
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            throw new RuntimeException("peek from empty stack");
        }
    }

    public void clear() {
        items.removeAll(items);
    }

    public int search(T item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) return i;
        }
        return -1;
    }
}



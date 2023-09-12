package algorithmLesson082923;

import java.util.EmptyStackException;

public class LinkedList {
    int value;
    LinkedList next;

    public LinkedList(int value){
        this.value = value;
        this.next = null;
    }

    public void push(int value){
        LinkedList node = new LinkedList(value);
        LinkedList current = this;
        while (current.next!=null){
            current = current.next;
        }
        current.next = node;
    }
    public void pop(){
        LinkedList current = this;
        if (current.next==null) throw new EmptyStackException();
        while (current.next.next!=null){
            current = current.next;
        }
        current.next = null;
    }
    public void pushIndex(int value,int index){
        LinkedList node = new LinkedList(value);
        LinkedList current = this;
        for (int i=0;i<index-1;i++){
            current=current.next;
        }
        node.next = current.next;
        current.next=node;
    }
}

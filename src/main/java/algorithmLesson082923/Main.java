package algorithmLesson082923;



public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.push(3);

        System.out.println(stack.items);
        System.out.println(stack);
        System.out.println(stack.getMax());
        //#2
        LinkedList node = new LinkedList(11);
        System.out.println("#2 node >> " + node.value);

        node.push(2);
        System.out.println(node.value);

        System.out.println("node.push >> " + node.next.value);

        node.push(5);
       System.out.println("node.push >> " + node.next.next.value);
        node.push(23);
        System.out.println("node.push >> " + node.next.next.next.value);
        node.pop();
        System.out.println("node.pop >> node.next.next.next >> " + node.next.next.next+"; node.next.next.value >> "+ node.next.next.value);
        node.pop();
        System.out.println("node.pop >> node.next.next >> " + node.next.next+"; node.next.value >> "+ node.next.value);
        node.pop();
        System.out.println("node.pop >> node.next >> " + node.next+"; node.value >> "+node.value);
        node.push(2);
        node.push(3);
        node.push(4);
        node.push(6);
        node.pushIndex(5,4);
        System.out.println("#3 node.pushIndex >> " + node.next.next.next.value+"; node.next.next.next.next.value >> "+ node.next.next.next.next.value);

    }

}
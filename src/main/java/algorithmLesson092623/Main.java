package algorithmLesson092623;

class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.add(12);
        tree.add(11);
        tree.add(9);
        tree.add(1);
        tree.add(5);
        tree.add(4);
        Tree tree1 = new Tree(11);
        tree1.add(12);
        tree1.add(15);
        tree1.add(1);
        tree1.add(2);
        tree1.add(9);
        System.out.println("\n  #01 tree.height :"+tree.height(tree)+"<<this tree.count :"+tree.count(tree));
        tree.print(tree);
        System.out.println("\n  #02 tree1.height :"+tree1.height(tree1)+"<<this tree.count :"+tree1.count(tree1));
        tree.print(tree1);
        if (tree1.count(tree1)>tree.count(tree))
            System.out.println("\n  #03 tree1 has more elements as tree ");
        else if (tree1.count(tree1)<tree.count(tree))
            System.out.println("\n  #03 tree has more elements as tree1");
        else
            System.out.println("\n  #03 Both tress have the same amount of elements");

        System.out.println("#1 tree.left.left.value 10_9_1 :"+tree.left.left.value);
        System.out.println("#1 tree.left.right.value 10_9_5 :"+tree.left.left.right.value);
        System.out.println("#1 tree.left.right.value 10_9_5 :"+tree.left.left.right.value);
        System.out.println("#1 tree.left.right.value 10_9_5_4 :"+tree.left.left.right.left.value);
        System.out.println("#2 tree.find 11 :"+tree.find(11));
        System.out.println("#3 tree.find1 11 :"+tree.find1(11));
        tree.delete(12);
       System.out.println("#4 tree.find 11 , after delete 12 :"+tree.find(11));
        System.out.println("#5 tree.find 12 :"+tree.find(12));
        tree.remove(9);
        System.out.println("#6 tree.find 4 , after delete 9 :"+tree.find(4));
        System.out.println("#07 tree.height :"+tree.height(tree)+"<<this tree.count :"+tree.count(tree)+" tree.value <10> :"+tree.value);


        }


//Results :
// #01 tree.height :5<<this tree.count :7
// >   10 >   9 >   1 >   5 >   4 >   12 >   11
//  #02 tree1.height :4<<this tree.count :6
// >   11 >   1 >   2 >   9 >   12 >   15
//  #03 tree has more elements as tree1
//#1 tree.left.left.value 10_9_1 :1
//#1 tree.left.right.value 10_9_5 :5
//#1 tree.left.right.value 10_9_5 :5
//#1 tree.left.right.value 10_9_5_4 :4
//#2 tree.find 11 :true
//#3 tree.find1 11 :true
//#4 tree.find 11 , after delete 12 :false
//#5 tree.find 12 :false
//#6 tree.find 4 , after delete 9 :false
//#07 tree.height :1<<this tree.count :1 tree.value <10> :10
//
//Process finished with exit code 0
}
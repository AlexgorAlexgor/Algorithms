package algorithmLesson091923;
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree(10);
        tree.add(5);
        tree.add(2);
        tree.add(11);
        tree.add(8);
        tree.add(7);
        tree.add(3);
        tree.add(9);
        tree.add(4);
        tree.dp(tree);
        System.out.println(" < size : "+tree.size(tree));
        System.out.println("left.left.value 10>5>2 : "+tree.left.left.value);
        System.out.println("find : "+tree.find(11));
        tree.remove(11);
        System.out.println("find : "+tree.find(11));
        System.out.println("max : "+tree.max()+" min : "+tree.min());
        System.out.println("height : "+tree.height(tree));
        tree.dp(tree);
        System.out.println(" < size : "+tree.size(tree));
        System.out.println(" bp :> "+tree.bp());
    }
//Result :2  tree.left.left.value  10>5>2
//true  --(10>11)  ->>  remote --(11)
//false --(10>_)
//max : 10 min : 2
//height : 5
//10 5 2 3 4 8 7 9  < size : 8
// bp :> [10, 5, 2, 8, 3, 7, 9, 4]
//Process finished with exit code 0
}

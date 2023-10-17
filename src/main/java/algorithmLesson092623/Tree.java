package algorithmLesson092623;

public class Tree {

    int value;
    Tree left;
    Tree right;
     int element;

    public Tree(int value){
        this.value = value;
        left = null;
        right= null;
    }

    public void add(int value) {
        Tree current = this;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new Tree(value);
                    return ;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Tree(value);
                    return ;
                } else current = current.right;
            }
        }
    }
    public boolean find(int value){
        Tree current = this;
        while (current!=null){
            if (value==current.value) return true;
            else if (value<current.value) current = current.left;
            else current = current.right;
        }
        return false;
    }
    public boolean find1(int value) {
        if (value == this.value) return true;
        Tree current = this;
        while (true) {
            if (value < current.value) {
                if (current.left == null)
                    return false;
                else if (value == current.left.value) return true;
                else current = current.left;
            } else {
                if (current.right == null)
                    return false;
                else if (value == current.right.value) return true;
                else current = current.right;
            }
        }
    }
    public void delete (int value){
        Tree current = this;
        if (!this.find(value)) throw new IllegalArgumentException();
        if (value== current.value) throw new IllegalArgumentException();
        while (true){
            if (value<current.value){
                if (current.left!=null && value==current.left.value){
                    current.left = null;
                    return;
                }
                else current=current.left;
            }
            else {
                if (current.right!=null && value==current.right.value){
                    current.right = null;
                    return;
                }
                else current=current.right;
            }
        }
    }
    public void remove(int value) {
        if (!find(value)) {
            System.out.println("The value you're looking for is not in the tree");
            return;
        }
        if (value==this.value) {
            System.out.println("You can't remove the root value");
            return;
        }
        Tree current = this;
        while (true) {
            if (value < current.value) {
                if (value==current.left.value ) {
                    current.left = null;
                    return;
                } else current = current.left;
            } else {
                if (value==current.right.value) {
                    current.right = null;
                    return;
                } else current = current.right;
            }
        }
    }
    public int count(Tree tree){
        if (tree==null) return 0;
        return 1+ count(tree.left)+count(tree.right);
    }
    public void print(Tree tree){
        if (tree==null) return;
        System.out.print(" >   " +tree.value);

        print(tree.left);
        print(tree.right);

    }
    public int height(Tree tree){
        if (tree==null) return 0;
        return 1+ Math.max(height(tree.left),height(tree.right));
    }

}

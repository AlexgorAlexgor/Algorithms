package algorithmLesson091923;

import java.util.ArrayList;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void add(int value) {
        Tree current = this;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = new Tree(value);
                    return;
                } else current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Tree(value);
                    return;
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
    public void remove (int value){
        Tree current = this;
        if (!this.find(value)) throw new IllegalArgumentException();
        if (value==current.value) throw new IllegalArgumentException();
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
    public int max(){
        Tree current = this;
        while (current.right!=null){
            current = current.right;
        }
        return current.value;
    }
    public int min(){
        Tree current = this;
        while (current.left!=null){
            current = current.left;
        }
        return current.value;
    }
    public int height(Tree tree){
        if (tree==null) return 0;
        return 1+Math.max(height(tree.left),height(tree.right));
    }
    public int size(Tree tree){
        if (tree==null) return 0;
        return 1+size(tree.left)+size(tree.right);
    }
    public void dp(Tree tree){
        if (tree==null) return;
        System.out.print(tree.value+" ");
        dp(tree.left);
        dp(tree.right);
    }
   /* bp() {
    const result = [];
    const queue = [this];

        while (queue.length > 0) {
      const node = queue.shift();
            result.push(node.value);
            if (node.left) {
                queue.push(node.left);
            }
            if (node.right) {
                queue.push(node.right);
            }
        }
        return result;
    }*/
   public ArrayList<Integer> bp() {
       ArrayList<Integer> result = new ArrayList<>();
       ArrayList<Tree> queue = new ArrayList<>();
       queue.add(this);

       while (queue.size() > 0) {
           Tree node = queue.get(0);
           queue.remove(0);
           result.add(node.value);
           if (node.left!=null) {
               queue.add(node.left);
           }
           if (node.right!=null) {
               queue.add(node.right);
           }
       }
       return result;
   }
}

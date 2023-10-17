package algorithmLesson101023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Graph {
    HashMap<Character, ArrayList<Character>> vertices = new HashMap<>();

    public void addVertex(char A) {
        if (vertices.containsKey(A)) throw new IllegalArgumentException();
        vertices.put(A, new ArrayList<>());
    }
    public void addEdge(char A, char B){
        if (!vertices.containsKey(A) || !vertices.containsKey(B)) throw new Error("We don't have all the edges you're trying to connect");
        if (A==B) throw new Error("You can't connect an edge with itself");
        if (vertices.get(A).contains(B) ||vertices.get(B).contains(A)) throw new Error("This edge already exists");
        vertices.get(A).add(B);
        vertices.get(B).add(A);
    }
    public void print()
    {
        for (char x: vertices.keySet()){
            System.out.print(x+" -> ");
            for (char y:vertices.get(x))
                if (y!=vertices.get(x).get(vertices.get(x).size()-1))
                    System.out.print(y+", ");
                else
                    System.out.print(y);
            System.out.println();
        }
    }
    /*public void print1(char A)
    {
        for (char x: vertices.keySet()){
            if (x ==A){System.out.print(x+" -> ");}

            for (char y:vertices.get(x))
                if (y!=vertices.get(x).get(vertices.get(x).size()-1))
                {if (x ==A) {  System.out.print(y+", ");}}
                else
                    System.out.print(y);
            System.out.println();
        }
    }*/
    public void neighbor(char A){

        System.out.println(A+"-> "+vertices.get(A));
    }
    public void dfs (char start){
        HashSet<Character> visited = new HashSet<>();
        dfsRecursion(start,visited);
    }

    public void dfsRecursion(char vertex, HashSet<Character> visited){
        visited.add(vertex);
        System.out.println(vertex +" ");
        for (char neighbor: vertices.get(vertex)){
            if (!visited.contains(neighbor)){
                dfsRecursion(neighbor,visited);
            }
        }
    }

}
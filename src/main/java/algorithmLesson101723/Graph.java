package algorithmLesson101723;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    HashMap<Character, ArrayList<Character>> vertices = new HashMap<>();

    public void addVertex(Character vertex) {
        if (vertices.containsKey(vertex)) throw new Error("You already have this vertex");
        vertices.put(vertex, new ArrayList<>());
    }

    public void addEdge(Character vertex1, Character vertex2) {
        if (!vertices.containsKey(vertex1) || !vertices.containsKey(vertex2))
            throw new Error("At least on of the vertices is missing");
        if (vertices.get(vertex1).contains(vertex2)) throw new Error("The edge already exists");
        vertices.get(vertex1).add(vertex2);
        vertices.get(vertex2).add(vertex1);
    }

    public void print() {
        for (Character X : vertices.keySet()) {
            System.out.print(X + " -> ");
            for (Character Y : vertices.get(X)) {
                if (vertices.get(X).get(vertices.get(X).size() - 1) != Y)
                    System.out.print(Y + ", ");
                else
                    System.out.print(Y);
            }
            System.out.println();
        }
    }

    public void neighbor(Character vertex) {

        System.out.println("neighbors for <<" + vertex + ">> are in :" + vertices.get(vertex));
    }

    public ArrayList<Character> dfs(Character vertex){
        ArrayList<Character> visited = new ArrayList<>();
        dfsRecursion(vertex, visited);
        System.out.println();
        return visited;
    }

    public void dfsRecursion(Character vertex, ArrayList<Character> visited){
        visited.add(vertex);
        System.out.print(vertex +" >> ");
        for (Character X: vertices.get(vertex)){
            if (!visited.contains(X)){
                dfsRecursion(X, visited);
            }
        }

    }
    public int dfs1(Character vertex){
        ArrayList<Character> visited = new ArrayList<>();
        int count = dfsRecursion1(vertex, visited);
        return count;
    }

    public int dfsRecursion1(Character vertex, ArrayList<Character> visited){
        int count = 1;
        visited.add(vertex);
        for (Character X: vertices.get(vertex)){
            if (!visited.contains(X)){
                count+=dfsRecursion1(X, visited);
            }
        }
        return count;
    }
}
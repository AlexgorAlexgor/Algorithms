package algorithmLesson101023;

class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println(graph.vertices);
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addEdge('A', 'B');
        graph.addEdge('B', 'D');
        graph.addEdge('A', 'C');

        System.out.println(graph.vertices);
      /*  System.out.println("A -> "+graph.vertices.get('A'));
        System.out.println("B -> "+graph.vertices.get('B'));
        System.out.println("C -> "+graph.vertices.get('C'));
        System.out.println("D -> "+graph.vertices.get('D'));*/
        System.out.println("#2 ");
        graph.print();
        System.out.println("#3 ");
        graph.dfs('A');
//graph.print1('B');
      /*  graph.neighbor('B');
        HashSet<Character> set = new HashSet<>();
        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('E');
        System.out.println(set);*/
    }
// # Results:
// {}
//{A=[B, C], B=[A, D], C=[A], D=[B], E=[]}
//#2
//A -> B, C
//B -> A, D
//C -> A
//D -> B
//E ->
//#3
//A
//B
//D
//C
//Process finished with exit code 0
}

package algorithmLesson101723;

class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Graph graph1 = new Graph();
        Graph graph2 = new Graph();

        System.out.println("#1 <<graph.addVertex >> <<graph.addEdge>>");
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addEdge('A','B');
        graph.addEdge('A','C');
        graph.addEdge('B','D');

        System.out.println(graph.vertices);

        System.out.println("#2    <<graph.print>>");
        graph.print();

        System.out.println("#3     <<graph.neighbor>>");
        graph.neighbor('A');
        graph.neighbor('B');
        graph.neighbor('C');
        graph.neighbor('D');

        System.out.println("#4     <<graph.dfsRecursion>>");
        graph.dfs('A');
        graph.dfs('B');
        graph.dfs('C');
        graph.dfs('D');

        System.out.println("#5 <<graph1.addVertex >> <<graph1.addEdge>>");
        graph1.addVertex('A');
        graph1.addVertex('B');
        graph1.addVertex('C');
        graph1.addVertex('D');
        graph1.addEdge('A','B');
        graph1.addEdge('A','C');
        graph1.addEdge('B','D');
        System.out.println(graph1.vertices);
        graph1.neighbor('A');
        graph1.neighbor('B');
        graph1.neighbor('C');
        graph1.neighbor('D');

        System.out.println("#6 <<graph2.addVertex >> <<graph2.addEdge>>");
        graph2.addVertex('A');
        graph2.addVertex('B');
        graph2.addVertex('C');
        graph2.addVertex('D');
        graph2.addVertex('E');

        graph2.addEdge('A','B');
        graph2.addEdge('A','C');
        graph2.addEdge('C','D');
        System.out.println(graph2.vertices);
        graph2.neighbor('A');
        graph2.neighbor('B');
        graph2.neighbor('C');
        graph2.neighbor('D');

        System.out.println("#7     <<graph1.dfsRecursion>>");
        graph1.dfs('A');
        graph1.dfs('B');
        graph1.dfs('C');
        graph1.dfs('D');

        System.out.println("#8     <<graph2.dfsRecursion>>");
        graph2.dfs('A');
        graph2.dfs('B');
        graph2.dfs('C');
        graph2.dfs('D');
        graph2.dfs('E');

        System.out.println("#9 <<graph1.dfs('vertex').equals(graph2.dfs('vertex'))> ");
        System.out.println(" graph1.dfs('A').equals(graph2.dfs('A')) >> "+graph1.dfs('A').equals(graph2.dfs('A')));
        System.out.println(" graph1.dfs('B').equals(graph2.dfs('B')) >> "+graph1.dfs('B').equals(graph2.dfs('B')));
        System.out.println(" graph1.dfs('C').equals(graph2.dfs('C')) >> "+graph1.dfs('C').equals(graph2.dfs('C')));
        System.out.println(" graph1.dfs('D').equals(graph2.dfs('D') >> "+graph1.dfs('D').equals(graph2.dfs('D')));

        System.out.println("#10");
        System.out.print("dfs1 A>{ "+graph.dfs1('A'));
        System.out.print(" } dfs1 B>{ "+graph2.dfs1('B'));
        System.out.print(" } dfs1 C>{ "+graph2.dfs1('C'));
        System.out.print(" } dfs1 E >{ "+graph2.dfs1('E')+" }");



    }
// Results  main(...){...}:
// #1 <<graph.addVertex >> <<graph.addEdge>>
//{A=[B, C], B=[A, D], C=[A], D=[B]}
//#2    <<graph.print>>
//A -> B, C
//B -> A, D
//C -> A
//D -> B
//#3     <<graph.neighbor>>
//neighbors for <<A>> are in :[B, C]
//neighbors for <<B>> are in :[A, D]
//neighbors for <<C>> are in :[A]
//neighbors for <<D>> are in :[B]
//#4     <<graph.dfsRecursion>>
//A >> B >> D >> C >>
//B >> A >> C >> D >>
//C >> A >> B >> D >>
//D >> B >> A >> C >>
//#5 <<graph1.addVertex >> <<graph1.addEdge>>
//{A=[B, C], B=[A, D], C=[A], D=[B]}
//neighbors for <<A>> are in :[B, C]
//neighbors for <<B>> are in :[A, D]
//neighbors for <<C>> are in :[A]
//neighbors for <<D>> are in :[B]
//#6 <<graph2.addVertex >> <<graph2.addEdge>>
//{A=[B, C], B=[A], C=[A, D], D=[C], E=[]}
//neighbors for <<A>> are in :[B, C]
//neighbors for <<B>> are in :[A]
//neighbors for <<C>> are in :[A, D]
//neighbors for <<D>> are in :[C]
//#7     <<graph1.dfsRecursion>>
//A >> B >> D >> C >>
//B >> A >> C >> D >>
//C >> A >> B >> D >>
//D >> B >> A >> C >>
//#8     <<graph2.dfsRecursion>>
//A >> B >> C >> D >>
//B >> A >> C >> D >>
//C >> A >> B >> D >>
//D >> C >> A >> B >>
//E >>
//#9 <<graph1.dfs('vertex').equals(graph2.dfs('vertex'))>
//A >> B >> D >> C >>
//A >> B >> C >> D >>
// graph1.dfs('A').equals(graph2.dfs('A')) >> false
//B >> A >> C >> D >>
//B >> A >> C >> D >>
// graph1.dfs('B').equals(graph2.dfs('B')) >> true
//C >> A >> B >> D >>
//C >> A >> B >> D >>
// graph1.dfs('C').equals(graph2.dfs('C')) >> true
//D >> B >> A >> C >>
//D >> C >> A >> B >>
// graph1.dfs('D').equals(graph2.dfs('D') >> false
//#10
//dfs1 A>{ 4 } dfs1 B>{ 4 } dfs1 C>{ 4 } dfs1 E >{ 1 }
//Process finished with exit code 0
}
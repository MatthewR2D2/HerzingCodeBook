import java.util.*;
/*
* this graph will store generic data which is very powerful as you can put what ever you want in it
* */
class Graph<T> {
    // Use Hashmap to store the edges in the graph
    private Map<T, List<T> > map = new HashMap<>();

    // Adds a new node to the graph
    // This is used when creating a new edge or adding an edge 
    public void addNode(T s) {map.put(s, new LinkedList<T>());}

    // This function adds the edg between source to destination vertex
    public void addEdge(T source, T destination)
    {
        if (!map.containsKey(source))
            addNode(source);
        if (!map.containsKey(destination))
            addNode(destination);
        map.get(source).add(destination);
        map.get(destination).add(source); //Make the graph bidirectial by default you can make this a boolean if you want it single direction 
        
    }
    
    // Prints the adjancency list of each vertex.
    public void printGraph()
    {
        StringBuilder builder = new StringBuilder();
        for (T n : map.keySet()) {
            builder.append(n.toString() + ": ");
            for (T e : map.get(n)) {
                builder.append(e.toString() + " ");
            }
            builder.append("\n");
        }
        System.out.print(builder.toString()); 

    }
}
public class GraphExample{
    public static void main(String[] args) {

        Graph<Integer> g = new Graph<Integer>();
        g.addEdge(0, 2);
        g.addEdge(0, 6);
        g.addEdge(1, 4);
        g.addEdge(1, 8);
        g.addEdge(1, 1);
        g.addEdge(2, 2);
        g.addEdge(3, 9);

        // Printing the graph
        g.printGraph();

    }
}
public class Assignment01Q05 {
    /**
     * Finds the shortest path between two nodes in a directed graph represented by an adjacency matrix.
     * @param m the adjacency matrix representing the graph
     * @param i the starting node
     * @param j the target node
     * @return the length of the shortest path from node i to node j, or -1 if no path exists
     */
    public static int findShortestPath(int[][] m, int i, int j) {
        int n = m.length;
        int[] distances = new int[n];
        for (int k = 0; k < n; k++) {
            distances[k] = -1;
        }
        distances[i] = 0;
        for (int currentDist = 0; currentDist < n; currentDist++) {
            for (int k = 0; k < n; k++) {
                if (distances[k] == currentDist) {
                    for (int neighbor = 0; neighbor < n; neighbor++) {
                        if (m[k][neighbor] == 1 && distances[neighbor] == -1) {
                            distances[neighbor] = currentDist + 1;
                        }
                    }
                }
            }
        }
        return distances[j];
    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
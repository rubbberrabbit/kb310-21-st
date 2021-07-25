public class main {
    public static void main(String[] args){
         Dijkstra dijkstra = new Dijkstra();
         int[][] graph = { //测试图，表示无向有权图，-1为不直接连接 0为本节点
                 {0,1,4,-1,2,-1,-1,-1},
                 {1,0,-1,2,-1,-1,5,-1},
                 {4,-1,0,-1,-1,6,-1,-1},
                 {-1,2,-1,0,3,-1,-1,3},
                 {2,-1,-1,3,0,4,-1,-1},
                 {-1,-1,6,-1,4,0,1,-1},
                 {-1,5,-1,-1,-1,1,0,7},
                 {-1,-1,-1,3,-1,-1,7,0}
         };
         char[] nodes = {'A','B','C','D','E','F','G','H'};
         int[] Shortestpath = dijkstra.getShortestPaths(graph);
         System.out.println("A点到其他节点的最短路径：");
         for(int i=0;i<Shortestpath.length;i++){
             System.out.print(nodes[i]);
             System.out.println(Shortestpath[i]);
        }
    }
}

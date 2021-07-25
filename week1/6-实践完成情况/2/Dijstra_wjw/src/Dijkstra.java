public class Dijkstra {
    public int[] getShortestPaths(int[][] graph) {
        int[] result = new int[graph.length];   //最短路径表
        boolean[] used = new boolean[graph.length];  //判断顶点是否被遍历
        used[0] = true;
        for(int i = 1;i < graph.length;i++) {
            result[i] = graph[0][i];
            used[i] = false;
        }

        for(int i = 1;i < graph.length;i++) {
            int min = 2147483647;    //初始化最短路径为无穷大，java中的32位最大int
            int k = 0;
            for(int j = 1;j < graph.length;j++) {  //找到顶点0到其它顶点中距离最小的一个顶点
                if(!used[j] && result[j] != -1 && min > result[j]) {
                    min = result[j];
                    k = j;
                }
            }
            used[k] = true;    //更新节点状态
            for(int j = 1;j < graph.length;j++) {  //更新最短距离
                if(!used[j]) {  //当顶点j未被遍历时
                    if(graph[k][j] != -1 && (result[j] > min + graph[k][j] || result[j] == -1))
                        result[j] = min + graph[k][j];
                }
            }
        }
        return result;
    }
}

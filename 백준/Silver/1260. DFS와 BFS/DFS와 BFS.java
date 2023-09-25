import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static boolean[] visited; // 노드의 방문여부
    public static boolean[][] edge; // 엣지
    public static int n; // 노드 개수


    public static void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");

        for(int i = 1; i < n+1; i++){
            if (edge[node][i] == true && visited[i] == false){
                dfs(i);
            }
        }
    }

    public static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        // add는 오류 날 때 예외처리 ~ remove, element
        // offer는 오류 날 때 false처리 ~ poll, peek
        visited[node] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            System.out.print(temp + " ");

            for(int i = 1; i < n+1; i++){
                if(edge[temp][i] == true && visited[i]== false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        // 여기서 n을 int n으로 선언해버려서 인스턴스 변수를 생성해버림...
        // 클래스 변수 유의하면서 쓰기

        int m = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);

        edge = new boolean[1001][1001];
        visited = new boolean[1001];

        for(int i = 0; i<m; i++){ // 인접행렬 만들기
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            edge[a][b] = edge[b][a] = true;
        }

        dfs(v);

        System.out.println();
        Arrays.fill(visited, false); // bfs 방문을 위해서 초기화

        bfs(v);

    }
}
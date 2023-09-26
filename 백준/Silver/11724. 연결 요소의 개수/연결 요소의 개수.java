import java.io.*;

public class Main {
    public static boolean[] visited; // 노드의 방문여부
    public static boolean[][] edge; // 엣지
    public static int n; // 노드 개수


    public static void dfs(int node){
        visited[node] = true;

        for(int i = 1; i < n+1; i++){
            if (edge[node][i] == true && visited[i] == false){
                dfs(i);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);

        int m = Integer.parseInt(input[1]);
        int cnt = 1;
        int v = 1;

        edge = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        for(int i = 0; i<m; i++){ // 인접행렬 만들기
            String[] temp = br.readLine().split(" ");


            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            edge[a][b] = edge[b][a] = true;

            if (i == 0){
                v = a;
            }
        }
        dfs(v);

        for(int i = 1; i<n+1; i++){
            if (visited[i] == false){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
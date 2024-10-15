import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n, m;
    static int[][] input;
    static int[][] result;
    static boolean[][] visited;
    static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상 하 좌 우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String[] temp = br.readLine().split(" ");
        n = Integer.parseInt(temp[0]);
        m = Integer.parseInt(temp[1]);

        input = new int[n][m];
        result = new int[n][m];
        visited = new boolean[n][m];

        int startX = 0;
        int startY = 0;

        for (int i = 0; i < n; i++) {
            temp = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                input[i][j] = Integer.parseInt(temp[j]);
                if (input[i][j] == 2) {
                    startY = i;
                    startX = j;
                }
                result[i][j] = (input[i][j] == 0) ? 0 : -1;
            }
        }

        bfs(startY, startX);

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j]);
                if (j != m - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void bfs(int startY, int startX) {
        // 시작 지점 방문 처리
        visited[startY][startX] = true;
        result[startY][startX] = 0;

        // 큐를 통해 다음 검사가 끝나고 가야 하는 좌표 저장
        int[][] queue = new int[n * m][2];
        int head = 0;
        int tail = 0;

        // 시작 지점 추가
        queue[tail++] = new int[]{startY, startX};

        while (head < tail) {
            // 현재 위치
            int[] current = queue[head++];
            int y = current[0];
            int x = current[1];

            // 상하좌우 탐색
            for (int[] dir : directions) {
                // 이동한 좌표
                int newY = y + dir[0];
                int newX = x + dir[1];

                // 갈 수 있는 곳인지 확인
                if (newY >= 0 && newY < n && newX >= 0 && newX < m) {
                    if (input[newY][newX] == 1 && !visited[newY][newX]) {
                        visited[newY][newX] = true;
                        result[newY][newX] = result[y][x] + 1;
                        queue[tail++] = new int[]{newY, newX};
                    }
                }
            }
        }
    }
}

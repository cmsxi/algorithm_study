import java.io.*;

public class Main {
    static int[] rx = new int[]{-1, 0, 1, 0};
    static int[] ry = new int[]{0, 1, 0, -1};
    static int width;
    static int height;
    static int[][] field;

    public static void dfs(int a, int b) {
        field[b][a] = 2;

        for (int i = 0; i < 4; i++) {
            int nextA = a + rx[i];
            int nextB = b + ry[i];

            if(nextA >= width || nextA < 0 || nextB >= height || nextB < 0){
                continue;
            }

            if (field[nextB][nextA] == 1) {
                dfs(nextA, nextB);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int testCaseNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCaseNum; i++) {
            String[] input = br.readLine().split(" ");
            width = Integer.parseInt(input[0]);
            height = Integer.parseInt(input[1]);
            int cabbageNum = Integer.parseInt(input[2]);

            int earthworm = 0;

            field = new int[height][width];

            for (int j = 0; j < cabbageNum; j++) {
                String[] inputCabbage = br.readLine().split(" ");
                int x = Integer.parseInt(inputCabbage[0]);
                int y = Integer.parseInt(inputCabbage[1]);

                field[y][x] = 1;
            }

            for (int j = 0; j < width; j++) {
                for (int k = 0; k < height; k++) {

                    if(j >= width || k >= height){
                        continue;
                    }

                    if (field[k][j] == 1) {
                        dfs(j, k);
                        earthworm++;
                    }

                }
            }
            System.out.println(earthworm);


//            array 확인용
//            for(int j = 0; j < height; j++){
//                System.out.println(Arrays.toString(field[j]));
        }
    }
}


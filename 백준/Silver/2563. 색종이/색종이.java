import java.io.*;

public class Main {
    public static int[][] whitePaper = new int[100][100];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            int tempA = Integer.parseInt(temp[0]);
            int tempB = Integer.parseInt(temp[1]);

            paintBlack(tempA, tempB);
        }
        System.out.println(sumArea());
    }

    public static void paintBlack(int a, int b){
        for(int i = a; i < a + 10; i++){
            for(int j = b; j < b + 10; j++){
                whitePaper[j][i] = 1;
            }
        }
    }

    public static int sumArea(){
        int area = 0;
        for(int i = 0; i <100; i++){
            for(int j = 0; j <100; j++) area += whitePaper[j][i];
        }
        return area;
    }
}

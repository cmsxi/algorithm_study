import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempNums = br.readLine().split(" ");
        int n = Integer.parseInt(tempNums[0]);
        int m = Integer.parseInt(tempNums[1]);
        int[][] numberList = new int[n+1][n+1];
        int[][] sumNumberList = new int[n+1][n+1];

        for(int i = 0; i < n; i++){
            tempNums = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                numberList[i+1][j+1] = Integer.parseInt(tempNums[j]);
                if(i==0){
                    sumNumberList[1][j+1] = numberList[1][j+1] + sumNumberList[1][j];
                } else if(j == 0){
                    sumNumberList[i+1][1] = numberList[i+1][1] + sumNumberList[i][1];
                } else{
                    sumNumberList[i+1][j+1] = numberList[i+1][j+1] + sumNumberList[i+1][j] + sumNumberList[i][j+1] - sumNumberList[i][j]; ;
                }
            }
        }

//        for(int i = 0; i < n+1; i++){
//            for(int j = 0; j < n+1; j++){
//                System.out.print(numberList[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//        for(int i = 0; i < n+1; i++){
//            for(int j = 0; j < n+1; j++){
//                System.out.print(sumNumberList[i][j] + " ");
//            }
//            System.out.println();
//        }

        int x1, x2, y1, y2;

        for(int i = 0; i < m; i++){
            String[] tempPoints = br.readLine().split(" ");
            x1 = Integer.parseInt(tempPoints[0]);
            y1 = Integer.parseInt(tempPoints[1]);
            x2 = Integer.parseInt(tempPoints[2]);
            y2 = Integer.parseInt(tempPoints[3]);

            if(x1 == x2 && y1 == y2){
                System.out.println(numberList[x1][y1]);
            } else {
//                System.out.println();
//                System.out.println(sumNumberList[x2][y2]);
//                System.out.println(sumNumberList[x1][y1]);
//                System.out.println(sumNumberList[x2][y1]);
//                System.out.println(sumNumberList[x1][y2]);
                System.out.println(sumNumberList[x2][y2] - sumNumberList[x1-1][y2] - sumNumberList[x2][y1-1] + sumNumberList[x1-1][y1-1]);
//                System.out.println();
            }
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;

public class Main {
    public static int n;
    public static int m;

    public static int paint(boolean[][] Board){
        int cnt = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if((i+j)%2 == 0 && Board[i][j]){
                    cnt++;
                }
                if((i+j)%2 == 1 && !Board[i][j]){
                    cnt++;
                }
            }
        }
        if(cnt > 32) cnt = 64-cnt;

        return cnt;
    }

    public static boolean[][] makeNewBoard(int a, int b, boolean[][] oldBoard){
        boolean[][] tempBoard = new boolean[8][8];
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                tempBoard[i][j] = oldBoard[a+i][b+j];
            }
        }

        return tempBoard;
    }

    public static void main(String[] args) throws IOException{

//        boolean[][] newBoard = new boolean[8][8];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        boolean[][] chessBoard = new boolean[n][m];

        for(int i = 0; i<n; i++) {
            String[] temp = br.readLine().split("");
            for(int j = 0; j < m; j++){
                if(temp[j].equals("W")){
                    chessBoard[i][j] = true;
                    continue;
                }
                if(temp[j].equals("B")) chessBoard[i][j] = false;
            }
        }

        int min = 2500;

        for(int i = 0; i < n-7; i++){
            for(int j = 0; j < m -7; j++){
                int tempCount = paint(makeNewBoard(i, j, chessBoard));
                if(tempCount < min) min = tempCount;
            }
        }

        System.out.println(min);
    }
}

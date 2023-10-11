import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[]  dp = new int[11];

        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for(int i = 3; i <11; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i = 0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            System.out.println(dp[m-1]);
        }

    }
}

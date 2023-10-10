import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] stairs = new int[n+1];
        int[] dp = new int[n+1];

        stairs[0] = 0;
        for(int i = 1; i <= n; i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }

        if(n <= 1) {
            System.out.println(stairs[1]);
            return;
        }

//      a[n] = a[n-1] + a[n-2]
        dp[0] = 0;
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

        for(int i = 3; i <= n; i++){
            dp[i] = Math.max(dp[i-2], dp[i-3]+stairs[i-1]) + stairs[i];
        }

        System.out.println(dp[n]);
    }
}
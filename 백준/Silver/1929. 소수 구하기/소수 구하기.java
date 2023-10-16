import java.io.*;

public class Main {
    public static boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for(int i = n; i < m+1; i++){
            if(i == 1) continue;
            if(isPrime(i)) System.out.println(i);
        }
    }
}

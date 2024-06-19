import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        int p1 = n;
        int p2 = n;
        int tempSum = 0;



        while(p1 > 0 && p2 != 1) {

            if (p1 == p2) {
                if (p1 == n) {
                    result++;
                    p1--;
                    p2--;
                } else {
                    p1--;
                    tempSum = p1 + p2;
                }
            } else if (tempSum > n){
                p2--;
                p1 = p2;
            } else if (tempSum == n){
                result++;
                p2--;
                p1=p2;
            } else{
                p1--;
                tempSum += p1;
            }
        }

        if(n == 1){
            System.out.println(1);
        }else{
            System.out.println(result);
        }

    }
}

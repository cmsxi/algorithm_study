import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputArray = br.readLine().split(" ");
        int max = 0;
        double result = 0;

        for(String s : inputArray){
            if (Integer.parseInt(s) > max){
                max = Integer.parseInt(s);
            }
            result += Integer.parseInt(s);
        }

        System.out.println(result/n/max*100);
    }
}

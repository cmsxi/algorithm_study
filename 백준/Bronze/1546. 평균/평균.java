import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxScore = 0;
        double result = 0;

        int n = Integer.parseInt(br.readLine());
        String[] inputArray = br.readLine().split(" ");

        for(String s : inputArray){
            if (Integer.parseInt(s) > maxScore){
                maxScore = Integer.parseInt(s);
            }
            result += Integer.parseInt(s);
        }

        System.out.println(result/n/maxScore*100);
    }
}

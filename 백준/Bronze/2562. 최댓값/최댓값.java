import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxIdx = 0;
        int maxNum = 0;
        for(int i = 1; i<10; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp > maxNum){
                maxIdx = i;
                maxNum = temp;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxIdx);

    }
}
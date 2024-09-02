import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max =  -1000000;
        int min = 1000001;
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        for(String s : inputs){
            if(Integer.parseInt(s) > max){
                max = Integer.parseInt(s);
            }
            if(Integer.parseInt(s) < min){
                min = Integer.parseInt(s);
            }
        }
        System.out.println(min + " " + max);
    }
}

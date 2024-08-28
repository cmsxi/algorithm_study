import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int num = 665;
        int idx = 0;
        while(idx != input){
            num++;
            String temp = num + "";
            if(temp.contains("666")){
                idx ++;
            }
        }
        System.out.println(num);
    }
}
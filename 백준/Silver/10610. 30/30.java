import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        String result = "";

        if(num.contains("0")){
            String[] temp = num.split("");
            int temp_num = 0;
            Arrays.sort(temp, Collections.reverseOrder());

            for(String s:temp) {
                result += s;
                temp_num += Integer.parseInt(s);
            }

            if(temp_num % 3 == 0) {
                System.out.println(result);
            }else{
                System.out.println(-1);
            }
        }
        else System.out.println(-1);
    }
}

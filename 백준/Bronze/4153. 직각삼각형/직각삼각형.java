import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] lengths = new int[3];

        while(!"0 0 0".equals(input)){
            String[] temp = input.split(" ");
            for(int i = 0; i < 3; i++){
                lengths[i] = Integer.parseInt(temp[i]);
            }
            Arrays.sort(lengths);

            System.out.println(Math.pow(lengths[0], 2) + Math.pow(lengths[1],2) == Math.pow(lengths[2],2) ? "right" : "wrong");
            input = br.readLine();
        }
    }
}

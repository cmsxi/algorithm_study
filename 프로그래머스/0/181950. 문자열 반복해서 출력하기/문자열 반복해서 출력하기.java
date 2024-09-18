import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < Integer.parseInt(inputs[1]); i++){
            System.out.print(inputs[0]);
        }
    }
}
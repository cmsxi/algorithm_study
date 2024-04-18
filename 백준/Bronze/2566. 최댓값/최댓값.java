import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int[] maxIndex = {0, 0};

        for (int i = 0; i < 9; i++) {
            String[] tempArr = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                if (Integer.parseInt(tempArr[j]) >= max) {
                    max = Integer.parseInt(tempArr[j]);
                    maxIndex[0] = i+1;
                    maxIndex[1] = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxIndex[0] + " " + maxIndex[1]);
    }
}

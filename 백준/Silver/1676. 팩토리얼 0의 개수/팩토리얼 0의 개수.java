import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        int zeroCount = 0;
        long tempFac = 1;

        for (int i = 1; i <= input; i++) {
            tempFac *= i;
            
            if (tempFac >= 10 && tempFac % 10 == 0) {
                while (tempFac >= 10 && tempFac % 10 == 0) {
                    tempFac /= 10;
                    zeroCount++;
                }
                tempFac %= 10;
            }
        }

        System.out.println(zeroCount);
    }
}

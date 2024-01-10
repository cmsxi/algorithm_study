import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static String isPalindrome(String[] inputNum) {

        for (int i = 0; i < inputNum.length / 2; i++) {
            if (!inputNum[i].equals(inputNum[inputNum.length - i - 1])) {
                return "no";
            }
        }

        return "yes";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("");

        while (!input[0].equals("0")) {
            System.out.println(isPalindrome(input));
            input = br.readLine().split("");
        }

    }
}

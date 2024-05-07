import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int temp = 0;
        int result = 0;

        List<Integer> nums = new ArrayList<>();


        for (int i = 0; i < K; i++) {
            temp = Integer.parseInt(br.readLine());
            if (temp == 0) {
                nums.remove(nums.size() - 1);
            } else {
                nums.add(temp);
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            result += nums.get(i);
        }

        System.out.println(result);

    }
}

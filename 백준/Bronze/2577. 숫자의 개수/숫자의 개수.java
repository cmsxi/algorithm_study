import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        int mul = 1;
        for(int i = 0; i < 3; i ++){
            mul *= Integer.parseInt(br.readLine());
        }
        String[] strNums = (mul + "").split("");
        for(String strNum : strNums){
            nums[Integer.parseInt(strNum)] += 1;
        }
        for(int num : nums){
            System.out.println(num);
        }

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int result = 0;

        String[] inputs = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr);

        int start = 0;
        int end = 1;

        while(start != arr.length-1){
            if(start != end && arr[start] + arr[end] == m) {
                result++;
            }
            if(end < arr.length-1){
                end++;
            }
            else {
                start++;
                end = start + 1;
            }
        }
        System.out.println(result);
    }
}

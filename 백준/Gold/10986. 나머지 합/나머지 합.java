import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tempInput = br.readLine().split(" ");
        int n = Integer.parseInt(tempInput[0]);
        int m = Integer.parseInt(tempInput[1]);
        long result = 0;

        String[] inputs = br.readLine().split(" ");
        long[] preSum = new long[n+1];
        Map<Long, Long> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            preSum[i+1] = Integer.parseInt(inputs[i]) + preSum[i];
            long remain = preSum[i+1] % m;
            if (map.containsKey(remain)) {
                map.put(remain, map.get(remain) + 1L);
            } else{
                map.put(remain, 1L);
            }
//            System.out.println(preSum[i+1] + ":" + remain);
        }
        if(map.containsKey(0L)){
            result += map.get(0L);
        }

        for (long key : map.keySet()) {
            long temp = map.get(key);
            result += temp * (temp - 1) / 2;
        }

        System.out.println(result);
    }
}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("");

        int sixNine = 0;
        int result = 0;

        Arrays.sort(input);

        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String num : input){
            int cnt = map.get(num)==null ? 0 : map.get(num);
            if(cnt == 0) {
                map.put(num, 1);
            } else{
                map.put(num, cnt+1);
            }
        }
        for(String num : map.keySet()){
            if("6".equals(num) || "9".equals(num)){
                sixNine += map.get(num);
            }
            else if(result < map.get(num))
                result = map.get(num);
        }

        if(result < Math.ceil((sixNine/2.0))){
            result = (int)Math.ceil((sixNine)/2.0);
        };
        System.out.println(result);

    }
}

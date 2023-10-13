import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input =br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashMap<String, Integer> map =  new HashMap<>();
        int cnt = 0;

        for(int i =0; i < n; i++){
            String temp =br.readLine();
            if(map.containsKey(temp)) continue;
            map.put(temp, 1);
        }

        for(int i =0; i < m;  i++){
            String temp =br.readLine();
            if (map.containsKey(temp)){
                map.replace(temp, 2);
                cnt++;
                continue;
            }
            map.put(temp, 1);
        }

        List<String> name = new ArrayList<>();
        for(Entry<String, Integer> entrySet : map.entrySet()){
            if(entrySet.getValue().equals(2)){
                name.add(entrySet.getKey());
            }
        }

        System.out.println(cnt);
        Collections.sort(name);

        for(String str: name){
            System.out.println(str);
        }
    }
}
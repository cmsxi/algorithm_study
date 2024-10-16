import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String[]> arr = new ArrayList<>();

        for(int i= 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            arr.add(temp);
        }

        Collections.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
//                if(o1[0].equals(o2[0])){
//                    return o1[1].compareTo(o2[1]);
//                }
                return Integer.parseInt(o1[0]) -  Integer.parseInt(o2[0]);
            }
        });

        for(String[] s : arr){
            System.out.println(s[0] + " " +s[1]);
        }
    }
}

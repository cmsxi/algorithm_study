import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int input = Integer.parseInt(br.readLine());
        for(int i = 0; i < input; i++){
                arr.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(arr);

        for(int n : arr){
            System.out.println(n);
        }
    }
}
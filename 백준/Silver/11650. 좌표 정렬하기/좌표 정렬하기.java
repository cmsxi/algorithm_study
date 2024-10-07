import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> arr = new ArrayList<>();

        int input = Integer.parseInt(br.readLine());
        for (int i = 0; i < input; i++) {
            int[] temp = new int[2];
            String[] tempStr = br.readLine().split(" ");
            temp[0] = Integer.parseInt(tempStr[0]);
            temp[1] = Integer.parseInt(tempStr[1]);
            arr.add(temp);
        }

        Collections.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                        return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];

                }
            }
        });


        for (int[] n : arr) {
            System.out.println(n[0] + " " + n[1]);
        }
    }

}
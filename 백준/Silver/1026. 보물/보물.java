import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");

        int[] A = new int[len];
        int[] B = new int[len];

        for(int i = 0; i < len; i++){
            A[i] = Integer.parseInt(strA[i]);
            B[i] = Integer.parseInt(strB[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;

        for(int i =0; i<len; i++){
            result += A[i]*B[len-i-1];
        }

        System.out.println(result);
    }
}
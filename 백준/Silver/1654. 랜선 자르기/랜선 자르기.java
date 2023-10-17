import java.io.*;

public class Main {
    public static long max;
    public static int k, n;
    public static long findLength(long[] cableList){
        // 이진 탐색으로 풀 수 있다. 모든 케이블에서 나누어 떨어지는 길이 찾기
        long left = 1;
        long right = max;
        long mid, cnt;

        while(left<=right){
            cnt = 0;
            mid = (left+right) / 2;
            for(int i =0; i < k; i++) cnt += cableList[i] / mid;

            if(cnt < n) {
                right = mid - 1;
                continue;
            }
            if(cnt >= n){
                left = mid +1;
            }
        }

        return(right);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        k = Integer.parseInt(input[0]);
        n = Integer.parseInt(input[1]);
        max = 1;

        long[] cable = new long[n];

        for(int i =0; i < k; i++){
            cable[i] = Long.parseLong(br.readLine());
            if (cable[i] > max) max = cable[i];
        }

        System.out.println(findLength(cable));
    }
}

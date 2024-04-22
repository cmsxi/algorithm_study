import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numerator = 1; // 분자
        int denominator = 1; // 분모
        int line = 1; // 몇번째 줄인지
        int nextLineNum = 1; // 다음 줄에 숫자 개수

        List<Integer> arr = new ArrayList<>(); // 앞에 숫자 몇개 있는지 계산하는 arraylist
        arr.add(1);

        int x = Integer.parseInt(br.readLine());
        String result = "";

        for(int i = 1; i < x; i += nextLineNum){ // 몇 번째 줄인지
        //   해당 줄 이전에 몇 개의 숫자 요소 존재하는지
            line++;
            nextLineNum++;
            arr.add(i);
        }

        if(line % 2 == 1) {
            numerator = line;
            for(int temp = x - arr.get(line-1); temp > 1; temp--){
                denominator++;
                numerator--;

            }
        }
        else {
            denominator = line;
            for(int temp = x - arr.get(line-1); temp > 1; temp--){
                denominator--;
                numerator++;
            }
        }

        result = numerator + "/" + denominator;
        System.out.println(result);
    }
}

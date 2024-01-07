import java.io.*;
import java.util.*;
// 코드 수정하기
public class Main {
    static int MAX_LENGTH = 50;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        // 1. 길이 비교
        // 2. 같은 길이 내에서 내림차순 비교
        // 3. 중복 문자 거르기

        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();

        for(int i = 0; i < num; i++){
            String temp = br.readLine();
            int tempLength = temp.length();

            if(hashMap.containsKey(tempLength)){
                if(hashMap.get(tempLength).contains(temp)){
                    continue;
                }
                
                hashMap.get(tempLength).add(temp);
                continue;
            }

            ArrayList<String> tempArray = new ArrayList<>();
            tempArray.add(temp);

            hashMap.put(tempLength, tempArray);
        }

        for(int i = 1; i <= MAX_LENGTH; i++){
            if(hashMap.containsKey(i)){
                hashMap.get(i).sort(Comparator.naturalOrder());
                for (String word : hashMap.get(i)) {
                    System.out.println(word);
                }
            }
        }
    }
}

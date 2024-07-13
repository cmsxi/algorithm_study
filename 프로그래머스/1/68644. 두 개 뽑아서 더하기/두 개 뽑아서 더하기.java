import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i; j < numbers.length; j++){
                if(i!=j && !answer.contains(numbers[i] + numbers[j])){
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
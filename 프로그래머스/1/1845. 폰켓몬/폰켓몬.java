import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
            
        }
        answer = map.size();
        if(answer > nums.length /2){
            answer = nums.length/2;
        }
        
        return answer;
    }
}
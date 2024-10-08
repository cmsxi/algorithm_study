import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : citations){
            arr.add(num);
        }
        Collections.sort(arr, Comparator.reverseOrder());
        
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) < i+1){
                answer = i;
                break;
            }
        }
        
        if(answer == -1) answer = citations.length;
        
        return answer;
    }
}
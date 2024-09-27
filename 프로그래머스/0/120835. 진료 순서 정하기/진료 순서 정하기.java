import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] emergency) {
        ArrayList<Integer> answer = new ArrayList<>();
       
        int[] emergencyCopy = emergency.clone();
        // sort -> map으로 indexing -> answer에 원래 순서대로 출력
        
        // 1. sort
        Arrays.sort(emergencyCopy);
        
        // 2. map으로 indexing 
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < emergency.length; i++){
            map.put(emergencyCopy[i], emergency.length - i);
        }
        
        
        for(int idx : emergency){
            answer.add(map.get(idx));
        }
               
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> map = resetMap(want, number);
             
        int idx = 0;
        while(9 + idx < discount.length){
            map = resetMap(want, number);
            for(int i = 0; i < 10; i++){
                if(map.containsKey(discount[i+idx])){
                    if(map.get(discount[i+idx]) == 1){
                        map.remove(discount[i+idx]);
                    }
                    else{
                        map.put(discount[i+idx], map.get(discount[i+idx])-1);
                    }
                }
                if(map.size() == 0){
                    answer++;
                }
            }
            idx++;
        }
        
        return answer;
    }
    
    public HashMap<String, Integer> resetMap(String[] want, int[] number){
        HashMap<String, Integer> tempMap = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            tempMap.put(want[i], number[i]);
        }
        return tempMap;
    }
}
import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String person : completion){
            if(map.get(person) == null){
                map.put(person, 1);
            }
            else{
                map.put(person, map.get(person)+1);
            }
        }
        for(String person : participant){
            if(map.get(person) == null){
                answer = person;
                break;
            }
            map.put(person, map.get(person)-1);
            
            if(map.get(person) == 0){
                map.remove(person);
            }
            
        }
        
        return answer;
    }
}
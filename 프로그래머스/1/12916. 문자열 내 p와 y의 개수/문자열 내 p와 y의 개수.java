import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] sTemp = s.split("");
        Map<String, Integer> pyMap = new HashMap<>();
        pyMap.put("p", 0);
        pyMap.put("y", 0);
        for(String temp : sTemp){
            if("p".equals(temp) || "P".equals(temp)){
                pyMap.put("p", pyMap.get("p")+1);
            }
            else if("y".equals(temp) || "Y".equals(temp)){
                pyMap.put("y", pyMap.get("y")+1);
            }
        }
        if(pyMap.get("y")!=pyMap.get("p")){
            answer = false;
        }

        return answer;
    }
}
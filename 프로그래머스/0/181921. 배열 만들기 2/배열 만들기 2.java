import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean found = false; 
        
        for(int i = l; i <= r; i++) {
            String[] temp = (i + "").split("");
            boolean valid = true; 
            
            for(String s: temp) {
                if(!(s.equals("5") || s.equals("0"))) {
                    valid = false; 
                    break; 
                }
            }
            
            if (valid) {
                answer.add(i); 
                found = true; 
            }
        }
        
        if (!found) {
            answer.add(-1); 
        }
        
        return answer;
    }
}

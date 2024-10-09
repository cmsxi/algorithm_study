import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] signs = letter.split(" ");
        
        HashMap<String, String> map = new HashMap();   
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        for(int i = 0; i < 26; i++){
            map.put(morse[i], alphabet.charAt(i) + "");
        }
        
        for(String sign : signs){
            answer += map.get(sign);
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++){
            String current = phone_book[i];
            int currentLen = current.length();

            String next = phone_book[i+1];
            int nextTempLen = next.length();
            if(currentLen < nextTempLen){
                next = next.substring(0, currentLen);
            }
            
            if(current.equals(next))
                return false;
        }
        
        return answer;
    }
}
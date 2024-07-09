import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : priorities){
            pQ.offer(i);
        }
        
        while(!pQ.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(pQ.peek() == priorities[i]){
                    pQ.poll();
                    answer += 1;
                    
                    if(i == location){
                        return answer;
                    }
                }
            }
            
        }
        
        return answer;
    }
}
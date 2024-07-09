import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int[] temp = new int[speeds.length+1];
        for(int i = 0; i < progresses.length; i++){
            if((100-progresses[i]) % speeds[i] == 0){
                temp[i] = (100-progresses[i]) / speeds[i];
            }
            else{
                temp[i] = ((100-progresses[i]) / speeds[i]) + 1;
            }
        }
        temp[speeds.length] = 101;
        
        
        int cnt = 0;
        int idx = temp[0];
        
        for(int i = 0; i < temp.length; i++){
            if(idx < temp[i]){
                answer.add(cnt);
                cnt = 0;     
                idx = temp[i];
            }
            cnt++;
        }
        
        return answer;
    }
}
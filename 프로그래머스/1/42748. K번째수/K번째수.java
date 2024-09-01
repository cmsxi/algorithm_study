import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> tempArr = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int[] cmd : commands){
            System.out.println(cmd[0]+"+"+cmd[1]);
            for(int i = cmd[0] -1 ; i < cmd[1]; i++){
                tempArr.add(array[i]);   
            }
            Collections.sort(tempArr);
            answer.add(tempArr.get(cmd[2]-1));
            
            tempArr = new ArrayList<>();
        }
        return answer;
    }
}
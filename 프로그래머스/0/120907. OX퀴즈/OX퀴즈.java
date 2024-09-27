import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] expression = quiz[i].split(" ");
            if ("+".equals(expression[1])){
                if(Integer.parseInt(expression[0]) + Integer.parseInt(expression[2]) != Integer.parseInt(expression[4])){
                    answer[i] = "X";
                    continue;
                }
            }else if ("-".equals(expression[1])){
                if(Integer.parseInt(expression[0]) - Integer.parseInt(expression[2]) != Integer.parseInt(expression[4])){
                    answer[i] = "X";
                    continue;
                }
            }
            answer[i] = "O";
        }
        return answer;
    }
}
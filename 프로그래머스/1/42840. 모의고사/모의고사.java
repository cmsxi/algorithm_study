import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 학생 답안지
        int[][] stds = new int[][] {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        // 각 학생별 정답 개수
        int[] answerCnt = new int[] {0, 0, 0};
    
        // 학생 별로 답안지와 비교
        for(int i = 0; i < stds.length; i++){
            for(int j = 0; j < answers.length; j++){
                if(answers[j] == stds[i][j%stds[i].length]){
                    answerCnt[i] += 1;
                } 
            }
        }
        
        // 가장 고득점자의 정답 개수 
        int tempMax = 0;
        
        
        for(int cnt : answerCnt){
            if(cnt > tempMax){
                tempMax = cnt;
            }
        }
        
        for(int i = 0; i < answerCnt.length; i++){
            if(answerCnt[i] == tempMax){
                answer.add(i+1);
            }
        }
        
        // System.out.println(Arrays.toString(answerCnt));

        return answer;
    }
}
class Solution {
    public long solution(int balls, int share) {
        long answer = 1;
        
        if(balls == 1 || balls == share){
            return 1;
        }
        else if(share == 1){
            return balls;
        }
        for (int i = 0; i < share; i++) {
            answer = answer * (balls - i) / (i + 1);
        }
        
        return answer;
    }
}
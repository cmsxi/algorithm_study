class Solution {
    public long solution(int a, int b) {
        if(a > b){
            int temp = b; 
            b = a; 
            a = temp;
        }
        
        long answer = 0;
        for(int i = a; i < b+1; i++){
            answer += i;
        }
        return answer;
    }
}
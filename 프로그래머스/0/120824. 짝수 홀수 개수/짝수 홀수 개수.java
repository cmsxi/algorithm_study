class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for(int num : num_list){
            if(num % 2 == 1){
                answer[1] += 1;
            }
            else{
                answer[0] += 1;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] tempArr = my_string.split("");
        
        for(int i = 0; i < tempArr.length; i++){
            answer += tempArr[tempArr.length - i - 1];
        }
        return answer;
    }
}
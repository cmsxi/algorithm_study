class Solution {
    public String solution(int age) {
        String answer = "";
        String[] word = "abcdefghijklmnopqrstuvwxyz".split("");
        String[] ageStr = (age + "").split("");
        for(String s : ageStr){
            answer += word[Integer.parseInt(s)];
        }
        return answer;
    }
}
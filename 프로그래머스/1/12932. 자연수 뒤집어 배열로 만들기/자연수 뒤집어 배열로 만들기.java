class Solution {
    public static int[] solution(long n) {
        String[] temp = (n + "").split("");
        int size = temp.length;
        int[] answer = new int[size];
        for (int i = 0; size > i; i++) {
            answer[i] = Integer.parseInt(temp[size-1-i]);
        }
        return answer;
    }
}
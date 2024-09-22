class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price > 499999){
            answer = price * 8 / 10;
        }
        else if(price > 299999){
            answer = price * 9 / 10;
        }
        else if(price > 99999){
            answer = price * 95 / 100;
        }
        else{
            answer = price;
        }
        return answer;
    }
}
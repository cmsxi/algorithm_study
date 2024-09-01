class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        if(denom1 != denom2){
            numer1 *= denom2;
            numer2 *= denom1;       
            answer[1] = denom1 * denom2;
        }
        else{
            answer[1] = denom1;    
        }

        answer[0] = numer1 + numer2;
        
        
        int gcdNum = gcd(answer[0], answer[1]);
        
        answer[0] /= gcdNum;
        answer[1] /= gcdNum;
        
        return answer;
    }
    
    public int gcd(int a, int b){
        int temp, n;
        
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        
        while(b != 0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }
}
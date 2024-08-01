class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        String strd = "01232456789";
        int stringLen = s.length();
        
        String[] stringArr = s.split("");
        
        if(stringLen == 4 || stringLen ==6){
            for(String c : stringArr){
                if(!strd.contains(c)){
                    return false;
                }
            }
            return answer;
        }
        return false;
        
    }
}
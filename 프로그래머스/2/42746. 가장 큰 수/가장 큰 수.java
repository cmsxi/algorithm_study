import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String> arr = new ArrayList<>();
        boolean allZero = true;
        
        for(int num : numbers){
            if(num != 0){
                allZero = false;
            }
            arr.add(num+"");
        }
        
        
        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);
            } 
        });
        
        for(String s : arr){
            answer += s;
        }
        
        if(allZero) answer = "0";
        return answer;
    }
    
}
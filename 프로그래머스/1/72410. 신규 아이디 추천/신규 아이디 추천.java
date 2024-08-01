import java.util.*;

class Solution {
    public String solution(String new_id) {
        // step1
        String[] strArr = new_id.toLowerCase().split("");
        String str = new_id.toLowerCase();

        
        // step2
        String standard = "abcdefghijklmnopqrstuvwxyz0123456789.-_";
        for(int i = 0; i < strArr.length; i++){
            if(!standard.contains(strArr[i])){
                str = str.replace(strArr[i], "");
            }
        }
        strArr = str.split("");
        
        
        // step3
        for(int i = 0; i < strArr.length; i++){
            if(i > 0 && (strArr[i-1].equals(".") || strArr[i-1].equals("*")) && strArr[i].equals(".")){
                strArr[i] = "*";
            }
        }
        str = String.join("", strArr);
        str = str.replaceAll("\\*", "");
        strArr = str.split("");
        
        
        // step4
        if(strArr[0].equals(".")){
            strArr[0] = "";
        }
        if(strArr[strArr.length - 1].equals(".")){
            strArr[strArr.length - 1] = "";
        }
        
        str = String.join("", strArr);
        
        // step5 
        if(str.length() == 0){
            str = "a";
        }
        System.out.println(str);
    
        
        // step6
        if(str.length() > 15){
            str = str.substring(0, 15);
            strArr = str.split("");
            int tempIdx = 14;
            while(strArr[strArr.length - 1].equals(".")){
                str = str.substring(0, tempIdx);
                strArr = str.split("");
                tempIdx--;
            }
        }
        
        // step7
        while(str.length() < 3){
            strArr = str.split("");
            str += strArr[strArr.length-1];
        }
        
        
        return str;
    }
}
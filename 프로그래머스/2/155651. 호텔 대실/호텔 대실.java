// import java.util.*;

// class Solution {
//     public int solution(String[][] book_time) {
//         int answer = 0;
//         ArrayList<int[]> rentList = new ArrayList<>();
        
//         for(String[] b :book_time){
//             int start = Integer.parseInt(b[0].replace(":", ""));
//             int end = Integer.parseInt(b[1].replace(":", "")) + 10;
//             if (end % 100 == 60){
//                 end = end - 60 + 100;
//             }
//             int[] rentTime = new int[]{start, end};
//             rentList.add(rentTime);
//         }
//         Collections.sort(rentList, new Comparator<int[]>() {
//             @Override
//             public int compare(int[] o1, int[] o2){
//                 if(o1[1] == o2[1]){
//                     return o1[0] - o2[0];
//                 }
//                 return o1[1] - o2[1];
//             }
//         });
        
//         // for(int[] arr :rentList){
//         //     System.out.println(Arrays.toString(arr));
//         // }
        
//         int startIdx = rentList.get(0)[0];
//         int endIdx = rentList.get(0)[1];
//         int flag = 0;
        
//         for(int i = 0; i < rentList.size(); i++){
//             if(endIdx > rentList.get(i)[0]){
//                 flag++;
//             } 
                
//             if(flag > answer){
//                 answer = flag;
//             }
            
//         }
        
//         // System.out.println(flag);
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int[] rooms = new int[24 * 60 + 10]; // 하루의 분 단위 + 청소 시간
        
        for (String[] time : book_time) {
            int start = timeToMinutes(time[0]);
            int end = timeToMinutes(time[1]) + 10; // 청소 시간 추가
            
            rooms[start]++;
            rooms[end]--;
        }
        
        int answer = 0;
        int current = 0;
        for (int i = 0; i < rooms.length; i++) {
            current += rooms[i];
            answer = Math.max(answer, current);
        }
        
        return answer;
    }
    
    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
// import java.util.*;

// class Solution {
//     public int[] solution(int N, int[] stages) {
//         int[] answer = new int[N];
        
//         // 스테이지별로 몇 명이 방문했는지. visited[k-1]에는 k번째 스테이지에 몇명의 사람이 방문했었는지 나옴
//         int[] visited = new int[N];
        
//         for(int s : stages){
//             if(s > N) continue;
//             visited[s-1] += 1;
//         }
        
//         // 해당 스테이지에서의 도전자
//         int challenger = stages.length;
        
//         // 스테이지별 실패율을 저장
//         ArrayList<double[]> failAndStage = new ArrayList<>();
        
//         // 안의 괄호의 0번째는 실패율, 1번째는 스테이지 번호
//         for(int i = 0; i < N; i++){
//             double fail;
            
//             if(challenger <= 0){
//                 fail = 0;
//             } else{
//                 fail = visited[i] / (double)challenger;
//                 challenger -=  visited[i];     
//             }
            
//             // 각 실패율과 시테이지 번호를 리스트에 저장
//             double[] tempFailAndStage = new double[2];
            
//             tempFailAndStage[0] = fail;
//             tempFailAndStage[1] = i+1.0;
            
//             failAndStage.add(tempFailAndStage);
//         }
        
//         // 실패율을 기준으로 방문자를 정렬, 내림차순
//         Collections.sort(failAndStage, new Comparator<double[]>() {
//            @Override
//             public int compare(double[] o1, double[] o2){
//                 if(o2[0] == o1[0]){
//                     if(o2[1] > o2[1]){
//                         return -1;
//                     }
//                     else{
//                         return 1;
//                     }
//                 } else if (o2[0] > o1[0]){
//                     return 1;
//                 } 
//                 return -1;
//             }
//         });
        
        
//         for(int i =0; i < answer.length; i++){
//             double[] temp = failAndStage.get(i);
            
//             // 제대로 저장되었는지 확인
//             // System.out.println(Arrays.toString(temp));
//             answer[i] = (int)temp[1];
//         }
        
//         return answer;
//     }
// }

import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        // 스테이지별로 몇 명이 방문했는지. visited[k-1]에는 k번째 스테이지에 몇명의 사람이 방문했었는지 나옴
        int[] visited = new int[N];
        
        for(int s : stages){
            if(s > N) continue;
            visited[s-1] += 1;
        }
        
        // 해당 스테이지에서의 도전자
        int challenger = stages.length;
        
        // 스테이지별 실패율을 저장
        ArrayList<double[]> failAndStage = new ArrayList<>();
        
        // 안의 괄호의 0번째는 실패율, 1번째는 스테이지 번호
        for(int i = 0; i < N; i++){
            double fail;
            
            if(challenger <= 0){
                fail = 0;
            } else {
                fail = visited[i] / (double)challenger;
                challenger -= visited[i];     
            }
            
            // 각 실패율과 스테이지 번호를 리스트에 저장
            failAndStage.add(new double[]{fail, i + 1});
        }
        
        // 실패율을 기준으로 방문자를 정렬, 내림차순
        Collections.sort(failAndStage, new Comparator<double[]>() {
           @Override
            public int compare(double[] o1, double[] o2){
                if(Double.compare(o2[0], o1[0]) == 0){ // 실패율이 같을 때
                    return Double.compare(o1[1], o2[1]); // 스테이지 번호 오름차순
                } else {
                    return Double.compare(o2[0], o1[0]); // 실패율 내림차순
                }
            }
        });
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = (int) failAndStage.get(i)[1]; // 스테이지 번호 저장
        }
        
        return answer;
    }
}


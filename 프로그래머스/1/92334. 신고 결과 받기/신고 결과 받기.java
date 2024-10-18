import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        
        // acceptedReport: 이미 받은적 있는 신고 저장
        // 한 유저가 같은 유저를 여러번 신고할 경우를 대비 
        HashMap<String, ArrayList<String>> acceptedReport = new HashMap<>(); 

        // reportByUser: user별 신고 횟수 
        HashMap<String, Integer> reportByUser = new HashMap<>();
        
        for(String id:id_list){
            reportByUser.put(id, 0);
        }
        
        for(String s:report){
            String a = s.split(" ")[0];
            String b = s.split(" ")[1];
            
            // a가 b를 신고한 이력이 없다면 신고 횟수 추가 
            // a의 신고 내역이 아예 없다면 생성
            if(acceptedReport.get(a) == null){
                ArrayList<String> temp = new ArrayList<>();
                temp.add(b);
                acceptedReport.put(a, temp);
                reportByUser.put(b, reportByUser.get(b)+1);
            }
            // a의 신고 내역이 있으나, 그게 b가 아니라면 원래 list에 추가
            else if(!(acceptedReport.get(a)).contains(b)){
                ArrayList<String> temp = acceptedReport.get(a);
                temp.add(b);
                acceptedReport.put(a, temp);
                reportByUser.put(b, reportByUser.get(b)+1);
            }
        }
        
        for(int i = 0; i < id_list.length; i++){
            ArrayList<String> reportIDbyUser = acceptedReport.get(id_list[i]);
            if(reportIDbyUser == null){
                continue;
            }
            for(String user : reportIDbyUser){
                if(reportByUser.get(user) >= k){
                    result[i] += 1;
                }
            }
        }
        
        return result;
    }
}
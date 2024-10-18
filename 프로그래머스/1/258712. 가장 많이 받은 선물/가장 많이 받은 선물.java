import java.util.*; 

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        
        // resultByUser: 유저별 받는 선물의 개수
        // 이 배열의 최대값이 answer
        int[] resultByUser = new int[friends.length];
        int[] giftScore = new int[friends.length];
        
        // userInfo: 사용자별 선물 주고 받은 정보
            // userInfo.get(0)은 0번째 사용자의 선물 준 총 횟수가 나옴
            // (userInfo.get(1))[0]은 1번째 사용자가 0번째 사용자에게 선물을 준 횟수가 나옴
        HashMap<String, int[]> userInfo = new HashMap<>();
        for(String friend : friends){
            int[] temp = new int[friends.length];
            userInfo.put(friend, temp);
        }
        
        
        // 주고 받은 선물 별 정보 저장
        for(String gift : gifts){
            String a = gift.split(" ")[0];
            String b = gift.split(" ")[1];
            
            int[] temp = userInfo.get(a);
            
            int bIdx = Arrays.asList(friends).indexOf(b);
            temp[bIdx] += 1;
            userInfo.put(a, temp);
            
            giftScore[Arrays.asList(friends).indexOf(a)]++;
            giftScore[bIdx]--;
        }
        
        // 저장 내용 기반으로 각 사용자가 받을 선물의 개수 구함
        for(String friend:friends){
            int idx = Arrays.asList(friends).indexOf(friend);
            
            for(int i = 0; i < friends.length; i++){
                if(i == idx) continue;
                
                // a가 b에게 준 선물이 받은 선물보다 많을 경우 a의 result 배열 ++
                if(userInfo.get(friend)[i] > userInfo.get(friends[i])[idx]){
                    resultByUser[idx]++;
                }
                // 만약 주고 받은 게 같다면 a와b의 선물 지수 비교
                else if(userInfo.get(friend)[i] == userInfo.get(friends[i])[idx]){
                    if(giftScore[idx] > giftScore[i]){
                        resultByUser[idx]++;
                    }
                }
            }
        }
        
        answer = Arrays.stream(resultByUser).max().getAsInt();
        return answer;
    }
}
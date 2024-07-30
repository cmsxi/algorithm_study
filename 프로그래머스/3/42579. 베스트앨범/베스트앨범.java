import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 1. 사용할 변수 정의 및 입력 값에 따른 저장
        // HashMap<Integer, Integer> music = new HashMap<>();
        // int[][] music = new int[plays.length][2]; 
        
        HashMap<String, ArrayList<int[]>> musicByGenres = new HashMap<>(); // 장르별 노래 저장 
        
        HashMap<String, Integer> playCntByGenres = new HashMap<>(); // 장르별 총 재생 횟수
        
        for(int i = 0; i < plays.length; i++){  
            int[] music = new int[2];// 각 노래의 고유번호, 재생횟수
            music[0] = i;
            music[1] = plays[i];
            
            // 장르별 노래를 저장할 때 재생횟수 많은 2곡까지만 저장하도록 하기 
            ArrayList<int[]> tempArr = new ArrayList<>();
            
            // 해당 장르에 노래가 존재할 경우 2곡까지만 저장 
            if(musicByGenres.containsKey(genres[i])){
                tempArr = musicByGenres.get(genres[i]);
                tempArr.add(music);
                
                // 만약 2곡보다 많이 들었을 경우 내림차순으로 정렬
                if(tempArr.size() > 2){
                    Collections.sort(tempArr, new Comparator<int[]>() {
                        @Override
                        public int compare(int[] o1, int[] o2) {
                            return o2[1] - o1[1]; // 배열 2번째 요소로 비교, 내림차순
                        }
                    });
                    
                    // 3번째로 많이 들은 곡 삭제
                    tempArr.remove(2);
                }
                // 저장
                musicByGenres.put(genres[i], tempArr);
                
            }
            else{
                // 해당 장르에 노래가 없다면 그냥 바로 저장
                tempArr.add(music);
                musicByGenres.put(genres[i], tempArr);
            }
            
            // 장르별 총 재생 횟수 저장
            if(playCntByGenres.containsKey(genres[i])){
                playCntByGenres.put(genres[i], playCntByGenres.get(genres[i]) + plays[i]);
            }
            else{
                playCntByGenres.put(genres[i], plays[i]);
            }
        }
        
        // 장르별 확인
        // for(String key : musicByGenres.keySet()){
        //     ArrayList<int[]> temp = musicByGenres.get(key);
        //     for(int[] arr : temp){
        //         System.out.println("[고유번호, 재생횟수]: " + Arrays.toString(arr));   
        //     }
        // }
        
        // System.out.println(playCntByGenres);
        
        
        // 2. 정렬하기 
        // (1) 총 재생횟수별 장르별 정렬/내림차순 
        // (2) 재생 횟수별 노래 정렬/내림차순 
        // (3) 노래 고유 번호 정렬/오름차순
        
        // (1) 총 재생횟수별 장르별 정렬/내림차순
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(playCntByGenres.entrySet()); // 장르별 총 재생 횟수를 담은 list

        Collections.sort(list, new Comparator<>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // 내림차순
            }
        });

        // 장르별 정렬이 되어있는 상태에서 접근
        for(Map.Entry<String, Integer> entry : list){
            // 한 장르 내에서 비교
            String tempGenres = entry.getKey();
            
            if(musicByGenres.containsKey(tempGenres)){
                ArrayList<int[]> temp = musicByGenres.get(tempGenres);
                
                Collections.sort(temp, new Comparator<int[]>() {
                    @Override
                    public int compare(int[] o1, int[] o2) {
                        if(o2[1] != o1[1])
                            return o2[1] - o1[1]; // 재생 횟수별 노래 정렬/내림차순 
                        else 
                            return o1[0] - o2[0]; // 노래 고유 번호 정렬/오름차순
                    }
                });
            
                for(int[] arr : temp){
                    // 제대로 됐는지 확인
                    // System.out.println(tempGenres + "[고유번호, 재생횟수]: " + Arrays.toString(arr));  
                    answer.add(arr[0]);
                }
            }
        }
        
        return answer;
    }
}
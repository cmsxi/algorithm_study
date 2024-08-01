import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int length = stages.length;
        int[] arr = new int[N+1]; //index에 stage, 저장된 값에 각 stage가 나온 횟수
        //각 스테이지에 해당하는 유저가 몇 명인지 저장
        for(int i=0; i<length; i++){ //인원수만큼 반복
            if (stages[i] <= N) {
                arr[stages[i] - 1] += 1; //각 스테이지에 몇 명이 있는지 저장
            }
        }
        //각 방의 번호는 1이 아니라 0부터 시작
        double[] rate = new double[N+1]; //실패율을 저장할 배열
        
        //[][0] index, [][1] 값
        //정렬. 실패율로 내림차순 정렬. 만약 같다면 번호 순 오름차순 정렬
        ArrayList<double[]> list = new ArrayList<>();
        
        int total = stages.length;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                rate[i] = 0.0;
            }else{
                double percent = (double) arr[i] / (double) total;
                total = total - arr[i]; //그 단계만큼의 인원을 빼기
                rate[i] = percent;
            }
            double[] indexAndRate = new double[2]; //double[0]에 index, double[1]에 rate 저장
            indexAndRate[0] = i+1; //스테이지 번호는 1부터 시작하기 때문
            indexAndRate[1] = rate[i];
            list.add(indexAndRate);
        }

        Collections.sort(list, new Comparator<double[]>(){ //arraylist안에서의 double형 배열을 가지고만 정렬을 할 것
            @Override
            public int compare(double[] o1, double[] o2){
                if(o1[1] == o2[1]){
                    return Double.compare(o1[0], o2[0]);
                }else{
                    return Double.compare(o2[1], o1[1]);
                }
            }
        });
        
        //정렬 후 
        int[] answer = new int[N];
        for(int i=0; i<N; i++){
            answer[i] = (int) list.get(i)[0];
        }
        
        return answer;
    }
}
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int k = arr2[0].length;
        int[][] answer = new int[n][k];
        
        // 3중 for문을 써야하나
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                for(int l = 0; l < k; l++){
                    answer[i][l] += arr1[i][j] * arr2[j][l];
                }
            }
        }
        
        return answer;
    }
}
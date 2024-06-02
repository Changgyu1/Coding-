class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length; // 행
        int col = arr1[0].length; // 열
        int[][] answer = new int[row][col];
        
        for(int i =0; i < row; i++){ // 행의 index
            for(int k = 0; k < col; k++){ // 열의 index
                answer[i][k] = arr1[i][k] + arr2[i][k];
            }
        }
        return answer;
    }
}
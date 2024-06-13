import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 결과 값 길이
        
        for(int a = 0; a < commands.length; a++) {
            int i = commands[a][0];
            int j = commands[a][1];
            int k = commands[a][2];
            
            int[] slice = Arrays.copyOfRange(array, i -1 , j);
            // array 배열에서 i - i 번째 위치부터 j까지 slice 배열 복사
            Arrays.sort(slice);  // 오름차순 정렬
            answer[a] = slice[k - 1]; // k번째 값 넣기
        }
        return answer;
    }
}
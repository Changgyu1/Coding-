class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int l = 0; l < array.length; l++){
            if(array[l] > height){
                answer++;
            }
        }
        return answer;
    }
}
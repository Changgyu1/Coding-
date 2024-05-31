class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length -1];
        int min = arr[0];
        int count = 0;
        if (arr.length == 1) {
            return new int[]{-1};
        }
        for(int a : arr){
          if (a < min){
                min = a;
         }
        }
        for (int b : arr){
            if(b != min) {
                answer[count] = b;
                count++;
            }

        }
       return answer;
        
    }
}
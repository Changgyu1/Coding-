class Solution {
    public int solution(int n) {
 int answer = 1;
    for(int i = 1; i <= n; i++){
        int number = i;
        for(int a = i+1; a <= n; a++){
            number += a;
            
          if(number == n){
            answer++;
              break;
        } else if(number > n){
              break;
          }
        }
        
    }
    
    return answer;
    }
}
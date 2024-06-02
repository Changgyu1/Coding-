class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        
    for(int i = left; i <= right; i++) { // ex) i = 13 ~ 17 
    	for(int j = 1; j <= i; j++) { 
    		if(i % j == 0) { // ex) 13 % 1 == 0 , 13 % 2 == 0 ~~~~ , 13 % 13 == 0;
    			count++; // 약수 개수
    		}
    	}
		if(count % 2 == 0) { // 약수의 개수가 짝수
			answer += i;
		}else { // 홀수
			answer -= i;
		}
        // 약수의 개수 초기화
    	count = 0;
    	}
        return answer;
    }
}
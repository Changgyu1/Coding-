class Solution {
    public String solution(String s) {
	    String[] str = s.split("");
	    String answer ="";
	    int count = 0;
	        for(String st1 : str) {
	        	if(st1.contains(" ")) { // 공백 일시 0 초기화
	        		count = 0;
	        	} else { // 아닐 경우 +
	        		count++;
	        	}
	        	
	        	if(count % 2 == 0) { // count++ -> 홀수 : 대문자
	        		answer += st1.toLowerCase();
	        	}else { // 짝수 : 소문자
	        		answer += st1.toUpperCase();
	        	}
	        }
        return answer;
    }
}
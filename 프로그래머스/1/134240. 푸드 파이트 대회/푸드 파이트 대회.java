class Solution {
    public String solution(int[] food) {
        String answer = "";
        
		for(int i = 1; i < food.length; i++) {
			
			if(food[i] / 2 != 0) {
				for(int b = 0; b < food[i] / 2; b++) {
				answer += Integer.toString(i);
				}
			}
		}
		answer += "0";
		for(int i = food.length - 1; i > 0; i--) {
			System.out.println(i + " 작동");
			if(food[i] / 2 != 0) {
				for(int b = 0; b < food[i] / 2; b++) {
				answer += Integer.toString(i);
				}
			}
		}
		return answer;
	}    
}

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>(); // 중복 제거
        
		for(int i = 0; i < numbers.length; i++) {
			for(int k = i + 1; k < numbers.length; k++) {
				answer.add(numbers[i] + numbers[k]);
			}
        }
        return answer.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
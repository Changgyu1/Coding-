import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int[] answer = new int[photo.length];
		
		for(int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		for(int i = 0; i < photo.length; i++) {
			for(int k = 0; k < photo[i].length; k++) {
				if(map.containsKey(photo[i][k])) {
				answer[i] += map.get(photo[i][k]);
				}
			}
		}
        return answer;
    }
}
import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] result = solutions(s);;
        return result;
    }
        public static int[] solutions(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> last = new HashMap<>(); // 각 문자의 마지막 위치를 저장할 HashMap 생성
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자
            char currentChar = s.charAt(i); 
            
            if (last.containsKey(currentChar)) {// 현재 문자가 이전에 나온 적이 있는지 확인
                // 이전에 나온 적이 있다면 현재 위치와 마지막 위치의 차이를 계산하여 결과 배열에 저장
                answer[i] = i - last.get(currentChar);
            } else {
                // 이전에 나온 적이 없다면 결과 배열에 -1을 저장
                answer[i] = -1;
            }    
            // 현재 문자의 위치를 HashMap에 추가
            last.put(currentChar, i);
        }
        return answer;
    }
}
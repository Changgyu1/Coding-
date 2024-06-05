import java.util.HashMap;
class Solution {
    public int solution(String s) {
        
        return conversion(s);
    }
    public static int conversion(String s){
        HashMap<String, String> map = new HashMap<>(); // 문자 숫자
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder result = new StringBuilder(); // 변환할 문자열 저장
        
        StringBuilder word = new StringBuilder(); // 임시 영단어 저장
        
        // 문자열 순차적 탐색
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){ // 문자가 숫자일 경우 그대로 저장
                result.append(c);
            }else{ // 그렇지 않을경우
                word.append(c); // 임시 영단어에 저장
                if(map.containsKey(word.toString())){ // 임시 영단어가 문자열에 있는지 확인
                    result.append(map.get(word.toString())); // 있을경우 숫자에 추가
                    word.setLength(0);; // 임시 영단어 초기화
                    
                }
            }
        }
        return Integer.parseInt(result.toString()); // 정수로 변환
    }
}
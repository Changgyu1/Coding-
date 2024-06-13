import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        int count = 0;
        
        for(int i = 97; i < 123; i++) { // 소문자 a ~ z 숫자( 97 ~ 122 )
            for(int k = 0; k < strings.length; k++){
                if(strings[k].charAt(n) == (char) i) {
                    answer[count] = strings[k];
                    count++;
                }
            }
        }
        
        return answer;
    }
}
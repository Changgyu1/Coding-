class Solution {
    public String solution(String s) {
        int len = s.length() / 2;
        String answer = s.length() % 2 != 0 ?  s.substring(len, len + 1) : s.substring(len - 1, len + 1);
        return answer;
    }
}
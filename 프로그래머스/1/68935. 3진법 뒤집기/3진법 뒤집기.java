class Solution {
    public int solution(int n) {
        String num = Integer.toString(n, 3); // 3진법 변환 
        StringBuffer rev = new StringBuffer();
        rev.append(num); 
        num = rev.reverse().toString(); // 문자열 뒤집기
        int answer = Integer.parseInt(num, 3); // 3진법 10진법으로 변환
        return answer;
    }
}
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int Cola = (n / a) * b;
            answer += Cola;
            n = (n % a) + Cola; // 교환 후 남은 병 수 + 새로 받은 콜라 병 수
        }
        return answer;
    }
}
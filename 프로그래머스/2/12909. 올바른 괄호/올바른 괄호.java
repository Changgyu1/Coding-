class Solution {
    boolean solution(String s) {
        int openCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                openCount--;
                // 열린 괄호보다 닫힌 괄호가 먼저 나오는 경우
                if (openCount < 0) {
                    return false;
                }
            }
        }
        return openCount == 0;
    }
}
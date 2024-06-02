class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int count = p.length();
        Long pLong = Long.parseLong(p);
        String sub = null;
        for(int i = 0; i <= t.length() - count; i ++) {	
            sub = t.substring(i, i+count);
            
	        if(Long.parseLong(sub) <= pLong){
	            answer++;
	        }
        }
        return answer;
    }
}
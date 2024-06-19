class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int i = 0;
        int k = 0;
        
        for(String w : goal){
            if(i < cards1.length && cards1[i].equals(w)){
                i++;
            }else if(k < cards2.length && cards2[k].equals(w)){
                k++;
            }else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}
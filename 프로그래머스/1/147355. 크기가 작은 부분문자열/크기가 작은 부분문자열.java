class Solution {
    public int solution(String t, String p) {
      int answer = 0;

        int tLength = t.length();
        int pLength = p.length();
        for(int i =0; i<=tLength-pLength; i++) {
            String subT = t.substring(i,pLength+i);
            if(p.equals(subT) || Long.parseLong(p) > Long.parseLong(subT)){
                answer++;
            }
        }
        return answer;
    }
}
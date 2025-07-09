class Solution {
    public boolean solution(String s) {
 boolean answer = true;
        int slen = s.length();
        if (slen == 4 || slen == 6) {
            for (char c : s.toCharArray()) {
                if (!(Character.isDigit(c))) {
                    return false;   //숫자가 아닌경우
                }
            }
        } else {
            return false;   //길이가 4 , 6 이  아닌 경우
        }
        return answer;
         }
}
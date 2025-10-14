class Solution {
    public String solution(String s, String skip, int index) {
  StringBuilder answer = new StringBuilder();

        for(char c : s.toCharArray()){ //문자열 s를 일단 돔
            int count = 0; 
            char next = c;

            while(count < index){
                next ++;
                if(next > 'z') next = 'a';

                if(skip.contains(String.valueOf(next))){continue;}

                count++;
            }
            answer.append(next);
        }
        return answer.toString();
    }
}
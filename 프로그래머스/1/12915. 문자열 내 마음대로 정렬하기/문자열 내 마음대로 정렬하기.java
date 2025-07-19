import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
  for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                char a = strings[i].charAt(n);
                char b = strings[j].charAt(n);

                if (a > b) {
                    // swap
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if (a == b) {
                    // 같은 글자일 경우, 사전순 비교
                    if (strings[i].compareTo(strings[j]) > 0) {
                        String temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
                    }
                }
            }
        }
        return strings;
    }
}

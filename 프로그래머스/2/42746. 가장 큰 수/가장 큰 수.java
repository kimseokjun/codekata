import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        String[] chars = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            chars[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(chars, (a, b) -> (b + a).compareTo(a + b));

        // 예외 처리: [0, 0, 0] → "0"
        if (chars[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : chars) {
            sb.append(s);
        }

        return sb.toString();
    }
}

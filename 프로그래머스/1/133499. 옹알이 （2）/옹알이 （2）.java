class Solution {
    public int solution(String[] babbling) {
 int answer = 0;
 
        // 발음 가능한 단어 배열
        String[] canBabble = {"aya", "ye", "woo", "ma"};
 
        // 입력 문자열 배열을 순회
        for (String word : babbling) {
            boolean isValid = true;
 
            // 연속된 같은 발음을 방지하기 위한 초기화
            String prev = "";
 
            // 발음 가능한 단어를 대체하며 검증
            for (String sound : canBabble) {
                // 연속 발음을 체크
                if (word.contains(sound + sound)) {
                    isValid = false;
                    break;
                }
                // 발음 가능한 단어를 모두 제거
                word = word.replace(sound, " ");
            }
 
            // 검증: 모든 발음 가능한 단어 제거 후 남은 문자열이 공백이어야 함
            if (isValid && word.trim().isEmpty()) {
                answer++;
            }
        }
 
        return answer;
    }
}
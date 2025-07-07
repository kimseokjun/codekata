package condingtest;

import java.util.ArrayList;
import java.util.Arrays;

public class p04 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(answers))); // 배열 출력은 이렇게!
    }

    public static int[] solution(int[] answers) {
        int[] per1 = {1, 2, 3, 4, 5};
        int[] per2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] per3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = {0, 0, 0}; // 각 수포자 점수

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == per1[i % per1.length]) scores[0]++;
            if (answers[i] == per2[i % per2.length]) scores[1]++;
            if (answers[i] == per3[i % per3.length]) scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));

        ArrayList<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == maxScore) {
                answerList.add(i + 1); // 수포자 번호는 1부터 시작
            }
        }

        // ArrayList -> int[]
        int[] result = new int[answerList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = answerList.get(i);
        }

        return result;
    }
}

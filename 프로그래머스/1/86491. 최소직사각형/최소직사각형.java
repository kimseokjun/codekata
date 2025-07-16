

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int bigw = 0;
        int bigh = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }

            bigw = Math.max(bigw, sizes[i][0]);
            bigh = Math.max(bigh, sizes[i][1]);

        }

        answer = bigw * bigh;


        return answer;
    }
}
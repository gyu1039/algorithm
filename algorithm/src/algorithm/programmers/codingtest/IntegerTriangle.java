package algorithm.programmers.codingtest;

public class IntegerTriangle {

    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = new int[triangle.length][];

        dp[0] = new int[1];
        dp[0][0] = triangle[0][0];

        for(int i=1; i<triangle.length; i++) {
            dp[i] = new int[triangle[i].length];

            for(int j=0; j<triangle[i].length; j++) {

                if(j == 0) {
                    dp[i][j] = triangle[i][j] + dp[i-1][j];

                } else if(j == triangle[i].length-1) {
                    dp[i][j] = triangle[i][j] + dp[i-1][j-1];

                } else {

                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }

            }

        }

        for(int n : dp[triangle.length - 1]) {
            if(n > answer) {
                answer = n;
            }
        }

        return answer;
    }
}

package algorithm.programmers.codingtest;

public class JumpAndTeleport {

	public int solution(int n) {
        int ans = 0;

        while(n > 2) {
            
            if(n%2 == 0) {
                n /= 2;
            } else {
                ans++;
                n--;
            }
        }

        return ans + 1;
    }
}

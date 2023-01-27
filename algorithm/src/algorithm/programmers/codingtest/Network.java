package algorithm.programmers.codingtest;

public class Network {

    static boolean[] isVisited;
    static int[][] computers;
    static int answer;
    static int n;

    public int solution(int nn, int[][] com) {
        isVisited = new boolean[nn];
        computers = com;
        n = nn;

        for(int i=0; i<n; i++) {
            if(!isVisited[i]) {
                bfs(i);
                answer++;
            }
        }
        return answer;
    }

    public void bfs(int i) {

        isVisited[i] = true;

        int[] arr = computers[i];
        for(int j=0; j<n; j++) {
            if(i==j) continue;

            if(arr[j] == 1 && !isVisited[j]) {
                bfs(j);
            }
        }


    }
}

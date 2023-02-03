package algorithm.programmers.codingtest;

public class DartGame {

    public int solution(String dartResult) {

        int[] arr = new int[3];
        int size = 0;

        int start = 0;
        int end = start + 1;

        for(int i=0; i<arr.length; i++) {

            for(int j=end; j<dartResult.length(); j++) {
                if(end != start+1 && Character.isDigit(dartResult.charAt(end))) {
                    break;
                }
                end++;
            }

            String s = dartResult.substring(start, end);

            boolean isDigit = Character.isDigit(s.charAt(1));
            int tmp = 1;
            if(isDigit) {
                tmp++;
            }

            int n = Integer.parseInt(s.substring(0, tmp));
            arr[size] = n;

            char s2 = s.charAt(tmp);
            if(s2 == 'D') {
                arr[size] = (int)Math.pow(arr[size], 2);
            } else if(s2 == 'T') {
                arr[size] = (int)Math.pow(arr[size], 3);
            }

            tmp++;
            if(tmp < s.length()) {
                char s3 = s.charAt(tmp);

                if(s3 == '*' && size == 0) {
                    arr[size] *= 2;
                } else if(s3 == '*' && size > 0) {
                    arr[size] *= 2;
                    arr[size - 1] *= 2;
                } else if(s3 == '#') {
                    arr[size] *= -1;
                }
            }

            size++;
            start = end;
            end++;
        }

        int answer = 0;
        for(int n : arr) {
            answer += n;
        }
        return answer;
    }


}

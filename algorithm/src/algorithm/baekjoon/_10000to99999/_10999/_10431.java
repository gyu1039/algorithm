    package algorithm.baekjoon._10000to99999._10999;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    public class _10431 {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while(t-- > 0) {
                String[] input = br.readLine().split(" ");
                int[] nums = new int[20];
                for(int i=0; i<nums.length; i++) {
                    nums[i] = Integer.parseInt(input[i+1]);
                }
                sb.append(input[0]);

                int count = 0;
                for(int i=0; i<20; i++) {

                    for(int j=0; j<i; j++) {
                        if(nums[j] > nums[i]) {
                            int tmp = nums[i];
                            for(int k=i; k>j; k--) {
                                nums[k] = nums[k-1];
                                count += 1;
                            }
                            nums[j] = tmp;
                        }
                    }
                }
                sb.append(" ").append(count).append("\n");
            }

            System.out.println(sb);
        }
    }

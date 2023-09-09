package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5635 {

    static class PersonalInformation {

        String name;
        int dd;
        int mm;
        int yyyy;

        public PersonalInformation(String name, int dd, int mm, int yyyy) {
            this.name = name;
            this.dd = dd;
            this.mm = mm;
            this.yyyy = yyyy;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PersonalInformation[] arr = new PersonalInformation[n];
        for(int i=0; i<n; i++) {

            String[] input = br.readLine().split(" ");

            arr[i] = new PersonalInformation(input[0],
                    Integer.parseInt(input[1]),
                    Integer.parseInt(input[2]),
                    Integer.parseInt(input[3]));
        }
        br.close();

        Arrays.sort(arr, (p1, p2)
                -> p1.yyyy != p2.yyyy ? Integer.compare(p1.yyyy, p2.yyyy) :
                p1.mm != p2.mm ? Integer.compare(p1.mm, p2.mm) :
                        Integer.compare(p1.dd, p2.dd));

        System.out.println(arr[n-1].name + "\n" + arr[0].name);
    }
}

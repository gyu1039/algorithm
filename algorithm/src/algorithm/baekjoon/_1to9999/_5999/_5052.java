package algorithm.baekjoon._1to9999._5999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _5052 {

    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int t = Integer.parseInt(br.readLine());

            StringBuilder answer = new StringBuilder();
            while(t-- > 0) {

                int n = Integer.parseInt(br.readLine());
//                String[] arr = new String[n];
//                for(int i=0; i<n; i++) {
//                    arr[i] = br.readLine();
//                }
//
//                Arrays.sort(arr);
//
//                boolean flag = true;
//                for(int i=0; i<n-1; i++) {
//                    if (arr[i + 1].startsWith(arr[i])) {
//                        flag = false;
//                        break;
//                    }
//                }
//
//                answer.append(flag ? "YES\n" : "NO\n");


                Trie root = new Trie();
                String[] arr = new String[n];
                for(int i=0; i<n; i++) {
                    arr[i] = br.readLine();
                }

                boolean flag = true;
                for(int i=0; i<n; i++) {
                    if (!root.insert(arr[i])) {
                        flag = false;
                        break;
                    }
                }
                answer.append(flag ? "YES\n" : "NO\n");
            }


            System.out.println(answer);

        } catch (IOException e) {

        }
    }


    static class Trie {

        TrieNode root = new TrieNode();

        boolean insert(String word) {

            TrieNode curNode = root;
            int len = word.length();

            for(int i=0; i<len; i++) {

                char n = word.charAt(i);
                if(curNode.childNodes.get(n) == null) {
                    curNode.childNodes.put(n, new TrieNode());
                }

                curNode = curNode.childNodes.get(n);

                if(curNode.isLastChar) {
                    return false;
                }
            }

            if(curNode.childNodes.size() != 0) {
                return false;
            }

            curNode.isLastChar = true;
            return true;
        }
    }

    static class TrieNode {

        Map<Character, TrieNode> childNodes = new HashMap<>();
        boolean isLastChar;
    }

}

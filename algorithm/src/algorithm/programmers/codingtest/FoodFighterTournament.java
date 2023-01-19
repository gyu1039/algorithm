package algorithm.programmers.codingtest;

public class FoodFighterTournament {

    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            while (count-- > 0) {
                sb.append(i);
            }
        }
        rev.append(sb.toString());
        sb.append(0);
        sb.append(rev.reverse());


        return sb.toString();
    }
}

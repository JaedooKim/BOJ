package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class week2 {
    public String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();
        double[] avgScores = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {
            ArrayList<Integer> condition = new ArrayList<>();
            for (int j = 0; j < scores.length; j++) {
                condition.add(scores[j][i]);
            }

            int max = Collections.max(condition).intValue();
            int min = Collections.min(condition).intValue();

            if (scores[i][i] == min) {
                if (Collections.frequency(condition, min) == 1) {
                    condition.remove(Integer.valueOf(min));
                }
            } else if (scores[i][i] == max) {
                if (Collections.frequency(condition, max) == 1) {
                    condition.remove(Integer.valueOf(max));
                }
            }

            double sum = 0;
            for (int j = 0; j < condition.size(); j++) {
                sum += condition.get(j);
            }

            avgScores[i] = sum / condition.size();
        }

//            System.out.println(Arrays.toString(avgScores));
        for (double score : avgScores) {
            if (score >= 90) {
                sb.append("A");
            } else if (score >= 80 && score < 90) {
                sb.append("B");
            } else if (score >= 70 && score < 80) {
                sb.append("C");
            } else if (score >= 50 && score < 70) {
                sb.append("D");
            } else if (score < 50) {
                sb.append("F");
            }
        }
        return sb.toString();
    }
}
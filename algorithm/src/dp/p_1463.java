package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1463 {
    static int N;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recursionCount(N));

    }

    static int recursionCount(int n) {

        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(recursionCount(n - 1), Math.min(recursionCount(n / 3), recursionCount(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recursionCount(n - 1), recursionCount(n / 3)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(recursionCount(n - 1), recursionCount(n / 2)) + 1;
            } else {
                dp[n] = recursionCount(n - 1) + 1;
            }
        }

        return dp[n];
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1003 {
    /**
     * dp 버전 풀이
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] dp = new int[N + 1][2];

            for (int j = 0; j <= N; j++) {
                if (j == 0) {
                    dp[j][0] = 1;
                    dp[j][1] = 0;
                } else if (j == 1) {
                    dp[j][0] = 0;
                    dp[j][1] = 1;
                } else {
                    dp[j][0] = dp[j - 1][0] + dp[j - 2][0];
                    dp[j][1] = dp[j - 1][1] + dp[j - 2][1];
                }

            }
            sb.append(dp[N][0] + " " + dp[N][1] + "\n");
        }
        System.out.println(sb.toString());
    }


    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i - 1] + zero[i - 2];
            one[i] = one[i - 1] + one[i - 2];
        }

        for (int i = 0; i < T; i++) {
            System.out.printf("%d %d\n", zero[arr[i]], one[arr[i]]);
        }
    }

     */

}

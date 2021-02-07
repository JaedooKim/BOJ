import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long five = countFiveExponent(n) - countFiveExponent(n - m) - countFiveExponent(m);
        long two = countTwoExponent(n) - countTwoExponent(n - m) - countTwoExponent(m);
        System.out.println(Math.min(two, five));
    }

    private static long countTwoExponent(long n) {
        long fiveExponent = 0;
        for (int i = 5; i <= n; i *= 5) {
            fiveExponent += n / i;
        }
        return fiveExponent;
    }

    private static long countFiveExponent(long n) {
        long twoExponent = 0;
        for (int i = 2; i <= n; i *= 2) {
            twoExponent += n / i;
        }
        return twoExponent;
    }
}

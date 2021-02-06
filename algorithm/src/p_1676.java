import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0, num, n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            num = i;

            while (num % 2 == 0 || num % 5 == 0) {
                if (num % 2 == 0) {
                    num /= 2;
                }
                if (num % 5 == 0) {
                    num /= 5;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}

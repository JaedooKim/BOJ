import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1003 {

    static int zero = 0, one = 0;

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

}

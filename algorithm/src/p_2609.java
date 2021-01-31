import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int val1 = Integer.parseInt(s[0]);
        int val2 = Integer.parseInt(s[1]);
        int LCM = val1 * val2, r = 1;

        if (val1 < val2) {
            r = val1 % val2;
            val1 = val2;
            val2 = r;
        }

        while (r > 0) {
            r = val1 % val2;
            val1 = val2;
            val2 = r;
        }
        LCM /= val1;
        System.out.println(val1);
        System.out.println(LCM);
    }
}

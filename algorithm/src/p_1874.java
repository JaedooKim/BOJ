import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p_1874 {

    // TODO: 2021. 1. 6.
    //  Scanner와 BufferedReader의 차이
    //  String, StringBuilder, StringBuffer의 차이
    //  스택의 성질 복습
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int i, k, n = Integer.parseInt(in.readLine()), max = 0, stIdx = 0;
        int[] stack = new int[n];
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            k = Integer.parseInt(in.readLine());
            if (k > max) {
                for (i = max; i < k; i++) {
                    stack[stIdx++] = i + 1;
                    sb.append("+\n");
                }
            } else {
                if (stack[stIdx-1] != k) {
                    System.out.println("NO");
                    return;
                }
            }

            stIdx--;
            sb.append("-\n");
            if (k > max) {
                max = k;
            }
        }
        System.out.println(sb);
    }
}

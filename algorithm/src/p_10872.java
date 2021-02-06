import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int factorial = 1, num = 1, n = Integer.parseInt(br.readLine());

        while (num < n) {
            num++;
            factorial *= num;
        }

        System.out.println(factorial);
    }
}

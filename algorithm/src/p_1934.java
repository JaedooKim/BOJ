import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] strArr;
        for (int i = 0; i < n; i++) {
            strArr = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            int gcdValue = gcd(a, b);
            int lcmValue = a * b / gcdValue;
            sb.append(lcmValue).append("\n");

        }
        System.out.println(sb);
    }

    //최대공약수 구하는 메소드
    public static int gcd(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

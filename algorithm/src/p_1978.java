import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {
            // 소수인 경우 true, 아닌경우 false
            boolean isPrime = true;
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) { //1인 경우 다음 반복문으로
                continue;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false; // 소수가 아니므로 false로 바꿔줌
                    break;
                }
            }
            if (isPrime) { // 소수인 경우 count 값 1 증가
                count++;
            }
        }
        System.out.println(count);
    }
}

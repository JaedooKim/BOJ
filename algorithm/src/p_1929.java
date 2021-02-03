import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] strArr = br.readLine().split(" ");
        int start = Integer.parseInt(strArr[0]), end = Integer.parseInt(strArr[1]);

        for (int i = start; i <= end; i++) {
            // 소수인 경우 true, 아닌경우 false
            boolean isPrime = true;
            if (i == 1) { //1인 경우 다음 반복문으로
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false; // 소수가 아니므로 false로 바꿔줌
                    break;
                }
            }
            if (isPrime) { // 소수인 경우 count 값 1 증가
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}

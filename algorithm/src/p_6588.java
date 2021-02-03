import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_6588 {
    // TODO: 2021. 02. 03.
    //  1)  에라토스체네스의 체를 이용하여 boolean[1000001] 배열(1 ~ 1,000,000) 로 소수 구분하기.
    //  *** 2 이상 1000 이하의 수만 가지고 구할 수 있음. n = 1000000 일 때, n의 제곱근은 1000이므로
    //  2)  입력 값 - 3 부터 3까지 for문을 사용하여 높은 값 부터 시작.
    //    그래서 (i) 와 (입력값 - i) 둘 다 소수인지 찾는다.
    //  ex) n = 8인 경우,
    //  i = 5, 4, 3
    //  입력값 - i  = 3, 4, 5
    //  i 와 입력값 - i 가 소수인지 체크해서 둘 다 소수이면 그것이 정답.
    //  *** 높은 값부터 내려오기 때문에 처음으로 발견한 값이 두 값의 차 가 가장 클 것이다.
    //  3)  찾으면 그대로 출력. 못찾으면 못찾는 경우에 대한 출력 처리
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        boolean[] anatos = new boolean[1000001];

        anatos[1] = true;
        for (int i = 2; i <= 1000; i++) {
            if (anatos[i]) {
                continue;
            }

            for (int j = i * 2; j < anatos.length; j += i) {
                if (!anatos[j]) {
                    anatos[j] = true;
                }
            }
        }

        int tc = Integer.parseInt(br.readLine());
        while (tc != 0) {
            boolean check = false;
            for (int i = tc; i >= 3; i--) {
                if (!anatos[i] && !anatos[tc - i]) {

                    sb.append(tc).append(" = ").append(Math.min(i, tc - i))
                            .append(" + ").append(Math.max(i, tc - i)).append("\n");
                    check = true;
                    break;
                }
            }
            if (!check) {
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }

            tc = Integer.parseInt(br.readLine());
        }
        System.out.println(sb.toString());
    }
}

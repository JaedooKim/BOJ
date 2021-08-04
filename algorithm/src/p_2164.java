import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class p_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        for (int i = 0; i < N; i++) {
            if (deque.size() == 1) {
                break;
            }
            // 1 제거
            deque.removeFirst();
            // 2 뒤로 보낸다
            int num = deque.removeFirst();
            deque.addLast(num);
        }

        System.out.println(deque.getFirst());
    }
}

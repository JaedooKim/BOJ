import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.offer(i+1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!q.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (i == k-1) {
                    sb.append(q.poll()+", ");
                } else {
                    q.add(q.poll());
                }
            }
        }

        bw.write(sb.substring(0, sb.length()-2) + ">");
        bw.flush();
        bw.close();
        in.close();
    }
}

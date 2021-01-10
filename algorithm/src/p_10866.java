import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class p_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int orderCnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < orderCnt; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push_front")) {

                deque.addFirst(Integer.parseInt(st.nextToken()));

            }else if(command.equals("push_back")) {

                deque.addLast(Integer.parseInt(st.nextToken()));

            }else if(command.equals("pop_front")){

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.pollFirst()+"\n");
                }

            }else if(command.equals("pop_back")) {

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.pollLast()+"\n");
                }

            }else if(command.equals("size")) {

                sb.append(deque.size()+"\n");

            }else if(command.equals("empty")) {

                if(deque.isEmpty()) {
                    sb.append("1\n");
                }else {
                    sb.append("0\n");
                }

            }else if(command.equals("front")) {

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.getFirst()+"\n");
                }

            }else if(command.equals("back")) {

                if(deque.isEmpty()) {
                    sb.append("-1\n");
                }else {
                    sb.append(deque.getLast()+"\n");
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
    }
}


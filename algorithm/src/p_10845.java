import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class p_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        LinkedList queue = new LinkedList();
        StringBuilder sb = new StringBuilder();
        String[] command;

        while (n-- > 0) {
            command = in.readLine().split(" ");
            switch (command[0]) {
                case "push" : queue.push(command[1]);
                    break;
                case "pop" :
                    if (queue.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(queue.getLast()+"\n");
                        queue.removeLast();
                    }
                    break;
                case "size" :
                    sb.append(queue.size()+"\n");
                    break;
                case "empty" :
                    if (queue.isEmpty()) {
                        sb.append(1+"\n");
                    } else {
                        sb.append(0+"\n");
                    }
                    break;
                case "front" :
                    if (queue.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(queue.getLast()+"\n");
                    }
                    break;
                case "back" :
                    if (queue.isEmpty()) {
                        sb.append(-1+"\n");
                    } else {
                        sb.append(queue.getFirst() + "\n");
                    }
                    break;
                default:
                    System.out.println("invalid input error.");
            }
        }
        System.out.println(sb);
    }
}

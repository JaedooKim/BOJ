import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i,i+1).equals("(")) {
                stack.push(i);
            } else {
                if (stack.peek() == i-1) {
                    stack.pop();
                    count+=stack.size();
                } else {
                    stack.pop();
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

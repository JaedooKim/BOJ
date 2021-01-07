import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(in.readLine());
        int n = Integer.parseInt(in.readLine());
        Stack<Character> leftSt = new Stack<>();
        Stack<Character> rightSt = new Stack<>();

        for (int j = 0; j < sb.length(); j++) {
            leftSt.push(sb.charAt(j));
        }

        while (n-- > 0) {
            String command = in.readLine();
            switch ( String.valueOf(command.charAt(0)) ) {
                case "L" :
                    if(!leftSt.empty()) {
                        rightSt.push(leftSt.pop());
                    }
                    break;
                case "D":
                    if(!rightSt.empty()) {
                        leftSt.push(rightSt.pop());
                    }
                    break;
                case "B":
                    if(!leftSt.empty()) {
                        leftSt.pop();
                    }
                    break;
                case "P":
                    leftSt.push(command.charAt(2));
                    break;
                default: System.out.println("invaild input string.");
            }
        }

        StringBuilder resultSb = new StringBuilder();
        while(!leftSt.isEmpty()) {
            rightSt.push(leftSt.pop());
        }
        while(!rightSt.isEmpty()) {
            resultSb.append(rightSt.pop());
        }
        System.out.println(resultSb);
    }
}

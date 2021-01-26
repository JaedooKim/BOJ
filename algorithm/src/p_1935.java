import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Double> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        double[] number = new double[27];

        String line = br.readLine();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            number[i] = (float) input;
        }

        for (int i = 0; i < line.length(); i++) {
            int code = (int) line.charAt(i);

            if (code >= 65 && code <= 90) {
                stack.push(number[code-65]);
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                double result = 0;

                switch (code) {
                    case 42:
                        result = num2*num1;
                        break;
                    case 43:
                        result = num2+num1;
                        break;
                    case 47:
                        result = num2/num1;
                        break;
                    case 45:
                        result = num2-num1;
                        break;
                }
                stack.push(result);
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}

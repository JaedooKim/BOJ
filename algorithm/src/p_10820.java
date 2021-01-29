import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int digit, upper, lower, temp;
        StringBuilder sb = new StringBuilder();
        String input;

        while ((input = br.readLine()) != null) {
            //소문자, 대문자, 숫자, 공백의 개수
            digit = 0;
            upper = 0;
            lower = 0;
            temp = 0;
            for (int j = 0; j < input.length(); j++) {
                char tagetCh = input.charAt(j);
                if (Character.isDigit(tagetCh)) {
                    digit++;
                } else if (Character.isUpperCase(tagetCh)) {
                    upper++;
                } else if (Character.isLowerCase(tagetCh)) {
                    lower++;
                } else if (tagetCh == ' ') {
                    temp++;
                }
            }
            sb.append(lower + " " + upper + " " + digit + " " + temp + " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

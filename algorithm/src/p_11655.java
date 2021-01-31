import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'm') ch += 13;
            else if (ch >= 'A' && ch <= 'M') ch += 13;
            else if (ch >= 'n' && ch <= 'z') ch -= 13;
            else if (ch >= 'N' && ch <= 'Z') ch -= 13;
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}

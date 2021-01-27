import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cntArr = new int[26];

        for (int i = 0; i < cntArr.length; i++) {
            char temp = (char) (i + 97);
            cntArr[i] = s.indexOf(temp);
        }

        for (int i = 0; i < cntArr.length; i++) {
            System.out.printf(cntArr[i] + " ");
        }
    }
}

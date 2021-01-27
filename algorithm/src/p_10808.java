import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cntArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cntArr[(int) s.charAt(i) - 97]+=1;
        }

        for (int i = 0; i < cntArr.length; i++) {
            System.out.printf(cntArr[i] + " ");
        }
    }
}

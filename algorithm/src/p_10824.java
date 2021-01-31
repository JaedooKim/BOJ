import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        long a = Long.parseLong(strArr[0] + strArr[1]);
        long b = Long.parseLong(strArr[2] + strArr[3]);
        System.out.println(a + b);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String[] inputArr = input.split("");

        Arrays.sort(inputArr, Comparator.reverseOrder());

        for (String s : inputArr) {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }
}

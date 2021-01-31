import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p_11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            strList.add(s.substring(i));
        }

        Collections.sort(strList);
        strList.stream().forEach(System.out::println);
    }
}

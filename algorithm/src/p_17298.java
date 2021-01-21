import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int inArr[] = new int[n];
        int nge;

        for (int i = 0; i < inArr.length; i++) {
            inArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < inArr.length-1; i++) {
            nge = 0;
            for (int j = i+1; j < inArr.length; j++) {
                if (inArr[i] < inArr[j] && nge == 0) {
                    nge = inArr[j];
                }
            }

            if (nge == 0) {
                sb.append("-1\t");
            } else {
                sb.append(nge+"\t");
            }
        }

        sb.append("-1");
        System.out.println(sb);

    }
}

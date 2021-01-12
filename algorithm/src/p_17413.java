import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p_17413 {

    // TODO: 2021. 1. 13
    //  복습하기
    //  다른 로직으로 구현하기

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine() + "\n";
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack();
        boolean isTagopen = false;

        for (int i = 0; i < str.length(); i++) {
            if(Character.toString(str.charAt(i)).equals("<")
                || (Character.toString(str.charAt(i)).equals(" ") && !isTagopen)
                    || Character.toString(str.charAt(i)).equals("\n")) {
                while (!st.empty()) {
                    sb.append(st.pop());
                }

                sb.append(str.charAt(i));

                if (Character.toString(str.charAt(i)).equals("<") && !isTagopen) {
                    isTagopen = true;
                }
            } else {
                if (isTagopen) {
                    sb.append(str.charAt(i));
                } else {
                    st.push(Character.toString(str.charAt(i)));
                }
            }

            if (Character.toString(str.charAt(i)).equals(">")) {
                isTagopen = false;
            }
        }

        System.out.print(sb.toString());
        

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p_9012 {

    private int size;
    private List<Character> charList;

    public p_9012(int size) {
        this.size = size;
        charList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("테스트케이스의 수 : ");
        int testCaseCount = sc.nextInt();
        p_9012 word = new p_9012(testCaseCount);

        while (testCaseCount != 0) {
            testCaseCount--;
            Scanner sc2 = new Scanner(System.in);
            System.out.println("word : ");
            String input = sc2.nextLine();

            while (input.matches(".*(\\(\\)).*")) {
                input = input.replace("()", "");
            }

            if (input.length() > 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

}

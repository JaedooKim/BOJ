import java.util.*;
import java.util.stream.Collectors;

public class p_9093 {

    private int size;
    private List<String> stringList;

    p_9093(int size) {
        this.size = size;
        stringList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("테스트케이스의 수 : ");
        int testCaseCount = sc.nextInt();
        p_9093 word = new p_9093(testCaseCount);

        while (testCaseCount != 0) {
            testCaseCount--;
            Scanner sc2 = new Scanner(System.in);
            System.out.println("word : ");
            String input = sc2.nextLine();
            word.convertString(input);

            String result = word.stringList.stream()
                    .map(n -> String.valueOf(n))
                    .collect(Collectors.joining(" "));
            System.out.println(result);
            word.stringList.clear();
        }

    }

    public void convertString(String word) {
        // I am happy today
        String[] wordArr = word.split(" ");
        // {I, am, happy .... }
        for (int i = 0; i < wordArr.length; i++) {
            stringList.add(reverse(wordArr[i]));
        }
    }

    public String reverse(String word) {
        String[] multistr = word.split("");
        List<String> convertList = Arrays.asList(multistr);
        Collections.reverse(convertList);
        return convertList.stream().map(n -> String.valueOf(n))
                .collect(Collectors.joining());
    }
}

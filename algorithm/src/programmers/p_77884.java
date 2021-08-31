package programmers;

public class p_77884 {

    public static void main(String[] args) {
        int result = solution(13, 17);
        System.out.println(result);
    }

    public static int solution(int left, int right) {
        int count, answer = 0;
        // left++;

        while (left <= right) {
            count = 0;

            for (int a = 1; a <= left; a++) {
                if ((left % a) == 0) {
                    count++;
                }
            }

            if (count % 2 == 1) {
                answer = answer - left;
            } else {
                answer = answer + left;
            }

            left++;
        }

        return answer;
    }
}

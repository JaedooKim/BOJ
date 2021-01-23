import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p_17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //배열의 입력
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        //결과값을 넣을 배열
        int[] result = new int[n];

        //입력된 숫자를 담는 배열
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        //숫자들의 등장한 횟수를 담는 배열
        int[] nums_count = new int[1000001];
        for (int i = 0; i < n; i++) {
            nums_count[nums[i]]+=1;
        }

        //인덱스 담을 Stack
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if(stack.isEmpty()) {
                stack.push(i);
            }
            while (!stack.isEmpty() &&
                    nums_count[nums[stack.peek()]] < nums_count[nums[i]]) {
                result[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            sb.append(result[i]+" ");
        }
        System.out.println(sb);

    }
}

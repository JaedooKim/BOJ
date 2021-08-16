import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p_1463 {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        //동적 계획법. DP 관련 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(recursionCount(n));
    }

    static int recursionCount(int n) {

        if (dp[n] == null) {

            if (n % 6 == 0) {
                dp[n] = Math.min(recursionCount(n - 1), Math.min(recursionCount(n / 3), recursionCount(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(recursionCount(n / 3), recursionCount(n - 1)) + 1;
            } else if (n % 2 == 0) {
                System.out.println(recursionCount(n / 2));
                System.out.println(recursionCount(n - 1));
                dp[n] = Math.min(recursionCount(n / 2), recursionCount(n - 1)) + 1;
            } else {
                dp[n] = recursionCount(n - 1) + 1;
            }
        }

        return dp[n];
    }

}

/*
// bfs 풀이
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private BufferedReader br;
    private int n;
    private int[] array;
    public void start() throws IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n+1];
        if(n == 1)
        {
            System.out.println(0);
            return ;
        }
        array[n] = 1;
        System.out.println(bfs(n));
    }
    private int bfs(int n)
    {
        int temp = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(n);
        while(!q.isEmpty())
        {
            temp = q.poll();
            if(temp % 3 == 0 && array[temp/3] == 0)
            {
                //3으로 나누어 떨어지면
                array[temp/3] = array[temp] + 1;
                q.add(temp/3);
                if(temp/3 == 1)
                {
                    return array[temp/3]-1;
                }
            }
            if(temp % 2 == 0 && array[temp/2] == 0)
            {
                //2로 나누어 떨어지면
                array[temp/2] = array[temp] + 1;
                q.add(temp/2);
                if(temp/2 == 1)
                {
                    return array[temp/2]-1;
                }
            }
            if(temp > 1 && array[temp-1] == 0)
            {
                array[temp-1] = array[temp] + 1;
                q.add(temp - 1);
                if(temp-1 == 1)
                {
                    return array[temp-1]-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) throws IOException{
        new Main().start();
    }
}
 */
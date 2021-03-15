import java.util.Scanner;

public class p_17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] distances = new int[n];

        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            distances[i] = Math.abs(s - b);
        }

        int result = distances[0];
        for (int i = 1; i < n; i++) {
            result = gcd(result, distances[i]);
        }
        System.out.println(result);
        sc.close();
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

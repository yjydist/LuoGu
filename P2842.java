import java.util.Scanner;

public class P2842 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] dp = new int[w + 1];
        dp[0] = 0;
        for (int i = 1; i <= w; i++) {
            dp[i] = w + 1;
        }
        for (int i = 1; i <= w; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= a[j]) {
                    dp[i] = Math.min(dp[i], dp[i - a[j]] + 1);
                }
            }
        }
        System.out.println(dp[w]);
    }
}

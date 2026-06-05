import java.util.Scanner;

public class P1216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                int x = sc.nextInt();
                dp[j] = Math.max(dp[j], dp[j - 1]) + x;
            }
        }
        sc.close();

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}

import java.util.Scanner;

public class P1028 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int[] dp = new int[n + 1];
    dp[0] = 1;
    for (int i = 1; i <= n; i++) {
      if (i % 2 == 1) {
        dp[i] = dp[i - 1];
      } else {
        dp[i] = dp[i - 1] + dp[i / 2];
      }
    }
    System.out.println(dp[n]);
  }
}

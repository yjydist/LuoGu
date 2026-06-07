import java.math.BigInteger;
import java.util.Scanner;

public class P1255 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }

        BigInteger[] dp = new BigInteger[n + 1];
        dp[0] = BigInteger.ONE;
        if (n >= 1) {
            dp[1] = BigInteger.ONE;
        }
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
        System.out.println(dp[n]);
    }
}

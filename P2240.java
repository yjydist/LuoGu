import java.util.Arrays;
import java.util.Scanner;

public class P2240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        double[][] items = new double[n][2];
        for (int i = 0; i < n; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(items, (a, b) -> Double.compare(b[1] / b[0], a[1] / a[0]));

        double ans = 0;
        for (int i = 0; i < n && t > 0; i++) {
            double take = Math.min(items[i][0], t);
            ans += take * items[i][1] / items[i][0];
            t -= take;
        }

        System.out.printf("%.2f%n", ans);
    }
}

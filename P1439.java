import java.util.Scanner;

public class P1439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();

        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) {
            pos[a[i]] = i;
        }

        int[] tail = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int x = pos[b[i]];
            int l = 0, r = len;
            while (l < r) {
                int mid = (l + r) >>> 1;
                if (tail[mid] < x) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            tail[l] = x;
            if (l == len) {
                len++;
            }
        }

        System.out.println(len);
    }
}

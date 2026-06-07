import java.util.Scanner;

public class P1177 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        MergeSort(a, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + (i == n - 1 ? "" : " "));
        }
    }

    public static void MergeSort(int[] a, int start, int end) {
        if (end - start <= 1) {
            return;
        }

        int mid = start + (end - start) / 2;
        MergeSort(a, start, mid);
        MergeSort(a, mid, end);
        merge(a, start, mid, end);
    }

    public static void merge(int[] a, int start, int mid, int end) {
        int[] temp = new int[end - start];
        int i = start, j = mid, k = 0;
        while (i < mid && j < end) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i < mid) temp[k++] = a[i++];
        while (j < end) temp[k++] = a[j++];
        for (i = 0; i < temp.length; i++) {
            a[start + i] = temp[i];
        }
    }
}

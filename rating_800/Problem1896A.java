import java.util.*;

public class Problem1896A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TC = scanner.nextInt();
        while (TC-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; ++i) {
            v[i] = scanner.nextInt();
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < n - 1; ++i) {
                if (v[i] > v[i - 1] && v[i] > v[i + 1]) {
                    flag = true;
                    swap(v, i, i + 1);
                }
            }
        }

        if (isSorted(v)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isSorted(int[] v) {
        for (int i = 1; i < v.length; ++i) {
            if (v[i - 1] > v[i]) {
                return false;
            }
        }
        return true;
    }

    private static void swap(int[] v, int i, int j) {
        int temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
}

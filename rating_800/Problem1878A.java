import java.util.*;
import java.util.Scanner;

public class Problem1878A {
    private static String solve(List<Integer> list, int n, int k) {
        if (!list.contains(k))
            return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            System.out.println(solve(list, n, k));
        }
        sc.close();
    }
}

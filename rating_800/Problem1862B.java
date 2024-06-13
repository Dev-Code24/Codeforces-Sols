// very bad question

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1862B {

    private static void solve(int n, List<Long> b) {
        List<Long> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long x = b.get(i);
            if (i > 0 && a.get(a.size() - 1) > x) {
                a.add(1L);
            }
            a.add(x);
        }
        System.out.println(a.size());
        for (long el : a) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();
            List<Long> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b.add(sc.nextLong());
            }
            solve(n, b);
        }

        sc.close();
    }
}

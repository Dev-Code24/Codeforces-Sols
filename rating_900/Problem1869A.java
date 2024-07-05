import java.util.*;

// Very nice solution to the problem
// The thought process is easy but, one must be aware of this kind of thinking
public class Problem1869A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (n % 2 == 0) {
            System.out.println(2);
            System.out.println(1 + " " + n);
            System.out.println(1 + " " + n);
        } else {
            System.out.println(4);
            System.out.println(1 + " " + (n - 1));
            System.out.println(1 + " " + (n - 1));
            System.out.println(2 + " " + n);
            System.out.println(2 + " " + n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            solve(sc);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Problem1805A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        int xor = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            xor ^= a[i];
        }
        if (n % 2 == 0 && xor == 0)
            System.out.println(0);
        else if (n % 2 != 0)
            System.out.println(xor);
        else
            System.out.println(-1);
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

import java.util.*;

public class Problem1845A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        
        if (x != 1) {
            System.out.println("YES");
            System.out.println(n);
            for (int j = 0; j < n; j++) {
                System.out.print(1 + " ");
            }
            System.out.println();
        } else if (k == 1 || (k == 2 && n % 2 == 1)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(n / 2);
            if (n % 2 == 1) {
                System.out.print(3 + " ");
                for (int j = 1; j < n / 2; j++) {
                    System.out.print(2 + " ");
                }
            } else {
                for (int j = 0; j < n / 2; j++) {
                    System.out.print(2 + " ");
                }
            }
            System.out.println();
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

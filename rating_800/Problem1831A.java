import java.util.Scanner;

public class Problem1831A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt(); // 5
        // Very clever solution
        // We are here making sure that the permuatation b contains such elements
        // such that ai + bi = n + 1, always, n+1 because a contains elements from 1 ... n
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            System.out.print(n - a + " ");
        }
        System.out.println();

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
/*
 * {1 2 4 5 3}
 * {1 2 4 3 5}
 */
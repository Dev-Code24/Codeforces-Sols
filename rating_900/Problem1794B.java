import java.util.Scanner;

public class Problem1794B {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] == 1)
                a[i]++;
        }

        for (int i = 0; i < n-1 ; i++) {
            if (a[i + 1] % a[i] == 0)
                a[i+1]++;
            System.out.print(a[i] + " ");
        }
        System.out.println(a[n - 1]);

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
 * 5 6 5 4 3
 * 5 2 5 3 2
 * 4 5 2 3 2
 * 2 5 6 5 4
 * 2 5 2
 * 4 5 6 2 7
 * 2 3 4 2 3
 * 6 3 5 6
 * 4 5 6 7
 * 3 2 7 5 6
 */
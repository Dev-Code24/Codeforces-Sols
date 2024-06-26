import java.util.*;

public class Problem1857A {
    private static void solve(int[] array, int N) {
        int count = 0;

        for (int i : array) {
            if (i % 2 != 0)
                count++;
        }
        if (count % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }
            solve(array, N);
        }

        sc.close();
    }
}
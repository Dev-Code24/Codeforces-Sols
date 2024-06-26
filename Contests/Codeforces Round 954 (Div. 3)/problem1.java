
import java.util.*;

public class problem1 {
    // x1 x2 x3 , a
    private static int solve(int x1, int x2, int x3) {
        int min = (int) 1e9;
        for (int i = 1; i <= 10; i++) {
            int d1 = Math.abs(x1 - i);
            int d2 = Math.abs(x2 - i);
            int d3 = Math.abs(x3 - i);
            int sum = d1 + d2 + d3;
            if (sum < min) {
                min = sum;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();
            System.out.println(" ");
            System.out.println(solve(x1, x2, x3));
        }
        sc.close();
    }
}
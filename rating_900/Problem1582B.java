import java.util.*;

/*
 * The answer is (2^c0 )* c1 where c0 = number of 0`s in the array and c1 = number of 1 in array
 * 2^c0 because, suppose c0=2,
 * then, following are the cases which will be generated
 * one zero removed one remaining in array,
 * one zero removed, other one also removed
 * one zero remaining, other 0 removed 
 * one zero remaining, other one remaining in array
 */
public class Problem1582B {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int c0 = 0, c1 = 0; // count0 and count1

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0)
                c0++;
            if (x == 1)
                c1++;
        }

        System.out.println((1L << c0) * c1);
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
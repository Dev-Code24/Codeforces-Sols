import java.util.*;

// Watch Shayan's video if code is not understandable
// https://www.youtube.com/watch?v=sAUI0T6r9TA&t=1161s
// A really tough problem for me 
public class Problem1988C {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();

        // Check if n is a power of 2
        if (Long.bitCount(n) == 1) {
            // If n is a power of 2, output 1 and n itself
            System.out.println(1);
            System.out.println(n);
            return;
        }

        // Calculate the number of set bits in n plus one
        int res = Long.bitCount(n) + 1;
        System.out.println(res);

        for (int i = 0; i < res; i++) {
            int cnt = 0;
            int cur = 0;
            long val = 0;

            for (int l = 62; l >= 0; l--) {
                // Check if the l-th bit of n is set
                if ((n & (1L << l)) != 0) {
                    cnt++;
                    // If cnt is less than or equal to i, add the l-th bit to val
                    if (cnt <= i) {
                        val += (1L << l);
                    } else {
                        // Toggle cur and add the l-th bit to val based on cur
                        if (cur != 0) {
                            val += (1L << l);
                        }
                        cur = 1 - cur;
                    }
                }
            }

            System.out.print(val + " ");
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
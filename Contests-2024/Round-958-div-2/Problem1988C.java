import java.util.*;

// Watch Shayan's video if code is not understandable
// https://www.youtube.com/watch?v=sAUI0T6r9TA&t=1161s
// A really tough problem for me 
public class Problem1988C {
    public static void solve(Scanner sc) {
        long n = sc.nextLong();
        /*
         * So whats happening is as per the observation from the example n = 23
         * if we consider n = 1 0 1 1 1 here total setBits are 4 hence only 4 + 1
         * will be the length of the array that is asked
         * and then for n = 23
         * a1 = off 0 on off on ( 0 0 1 0 1 )
         * a2 = on 0 off on off ( 1 0 0 1 0 )
         * a3 = on 0 on off on ( 1 0 1 0 1 )
         * a4 = on 0 on on off ( 1 0 1 1 0 )
         * a5 = on 0 on on on ( 1 0 1 1 1 )
         */
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
            // cnt tracks the count of set bits encountered
            int cnt = 0;
            // cur is used to toggle the bit value
            int cur = 0;
            // val stores the result of the current sequence
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
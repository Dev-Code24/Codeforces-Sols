import java.util.*;

/*
 * My initial way of thinking the solution:
 * What I thought the solution is, to return maxValue&minValue where 
 * maxValue is the maximum value of an element in the given array, 
 * similarly minValue is the minimum value in the given array.
 * Now I am saying this because whatever the position of the maxValue be in array, 
 * if we do & operation of its value with the minValue of 
 * array, then we are able to get the minimal value of the maxValue.
 * Now all this can happen as per the operations mentioned in the question.
 * 
 * Read question carefully from the next time as the question clearly
 * says that this minValue&maxValue operation can be infinite times,
 * so by doing this operations once does not gives the solution
 * hence need to do this multiple times
 * 
 * This can be solved in other way also,
 * by just first taking in the first element of array, say k = a[0]
 * and then iterating over array and performing a &= a[i]
 * This also gives the correct output due to properties of Bitwise operators
 */
public class Problem1559A {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        for (int i = 0; i < n; i++) {
            max = max & a[i];
        }

        System.out.println(max);

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
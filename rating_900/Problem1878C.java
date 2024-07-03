import java.util.*;
// for sol explanation -> https://chatgpt.com/c/a4e30d00-3b98-49d9-857b-8c918e609961
public class Problem1878C {
    private static void solve(Scanner sc) {
        long n = sc.nextLong(); 
        long k = sc.nextLong(); 
        long x = sc.nextLong();
        
        long min = k * (k + 1) / 2;
        long max = (n * (n + 1) - (n - k) * (n - k + 1)) / 2;
        
        if ( x >= min &&  x <= max) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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

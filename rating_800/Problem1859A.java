import java.util.*;

public class Problem1859A {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        int i = -1, j = -1;

        for (int p = 0; p < n; p++) {
            if (b.size() == 0) {
                b.add(a[p]);
                i++;
                continue;
            }
            if (b.get(i) % a[p] != 0) {
                c.add(a[p]);
                j++;
            } else {
                b.add(a[p]);
                i++;
            }
        }
        
        if (c.size() != 0) {
            System.out.println((i + 1) + " " + (j + 1));
            for (int val : b) {
                System.out.print(val + " ");
            }
            System.out.println();
            for (int val : c) {
                System.out.print(val + " ");
            }
            System.out.println();
        } else {
            System.out.println(-1);
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

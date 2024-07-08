import java.util.*;

// refer to https://codeforces.com/blog/entry/131283 for solution to Problem C
public class Problem1983C {
    static long T;
    static final int N = 200020;
    static int n;
    static long[][] val = new long[3][N];
    static long tot;
    static int[] ord = new int[3];
    static int[] ans = new int[6];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextLong();

        while (T-- > 0) {
            solve(sc);
        }

        sc.close();
    }

    private static void solve(Scanner sc) {
        tot = 0;

        n = sc.nextInt();

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < n; i++) {
                val[j][i] = sc.nextLong();
                // just summing tot variable for when j=0, meaning the array is of Alice
                if (j == 0)
                    tot += val[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            ord[i] = i;
        }

        boolean flag = false;

        do {
            int cur = 0, ptr = 0;
            long sum = 0;
            List<Integer> vec = new ArrayList<>();

            while (ptr < n) {
                sum += val[ord[cur]][ptr];
                if (3 * sum >= tot) {
                    vec.add(ptr);
                    cur++;
                    sum = 0;
                }
                if (cur == 3)
                    break;

                ptr++;
            }

            if (cur == 3) {
                vec.set(2, n - 1);
                int last = 0;
                for (int i = 0; i < 3; i++) {
                    ans[2 * ord[i]] = last;
                    ans[2 * ord[i] + 1] = vec.get(i);
                    last = vec.get(i) + 1;
                }

                for (int i = 0; i < 6; i++) {
                    System.out.print((ans[i] + 1) + " ");
                }
                System.out.println();

                flag = true;
                break;
            }
        } while (nextPermutation(ord));

        if (!flag) {
            System.out.println("-1");
        }
    }

    public static boolean nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;
        if (i < 0)
            return false;

        int j = arr.length - 1;
        while (arr[j] <= arr[i])
            j--;
        swap(arr, i, j);

        int k = i + 1, l = arr.length - 1;
        while (k < l) {
            swap(arr, k, l);
            k++;
            l--;
        }

        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * tot = 9 - > ceil(tot/3) = 3
 * 5 1 1 1 1 - > a 1 1
 * 1 1 5 1 1 - > b 2 3
 * 1 1 1 1 5 - > c 4 5
 */
/*
 * tot = 32 -> ceil(tot/3) = 11
 * 5 10 5 2 10
 * 9 6 9 7 1
 * 10 7 10 2 3
 */
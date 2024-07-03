import java.util.*;

// This is a good logical question, no DSA knowledge required. Basic Logical Skills needed
// to solve this problem. 
// A knight can attack at a single cell from 8 different positions
// Just use this to first generate the 8 different positions from the given data
// And then compare those positions for the positions for king's cell and queen's cell
public class Problem1904A {
    private static void solve(Scanner sc) {
        int[] dx = { -1, 1, -1, 1 };
        int[] dy = { -1, -1, 1, 1 };

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        sc.nextLine();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Set<String> st1 = new HashSet<>();
        Set<String> st2 = new HashSet<>();

        for (int j = 0; j < 4; j++) {
            st1.add((x1 + dx[j] * a) + "," + (y1 + dy[j] * b));
            st2.add((x2 + dx[j] * a) + "," + (y2 + dy[j] * b));
            st1.add((x1 + dx[j] * b) + "," + (y1 + dy[j] * a));
            st2.add((x2 + dx[j] * b) + "," + (y2 + dy[j] * a));
        }

        int ans = 0;
        for (String p : st1) {
            if (st2.contains(p)) {
                ans++;
            }
        }
        System.out.println(ans);
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

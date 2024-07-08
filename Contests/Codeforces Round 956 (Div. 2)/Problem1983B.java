import java.util.*;

// sum of the elements in a row % 3 remains constant even after doing the operations as 
// described in the question
// Hence just by checking if the sum of the elements rowAi = sum of the elements rowBi
// and sum of the elements colAj = sum of the elements colBj
// we can check if the after doing the operations Matrix A can become Matrix B or not
public class Problem1983B {
    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                a[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < m; j++) {
                b[i][j] = line.charAt(j) - '0';
            }
        }

        // checking the rows
        for (int i = 0; i < n; i++) {
            int rowA = 0;
            int rowB = 0;
            for (int j = 0; j < m; j++) {
                rowA += a[i][j];
                rowB += b[i][j];
            }
            if (rowA % 3 != rowB % 3) {
                System.out.println("NO");
                return;
            }
        }
        for (int j = 0; j < m; j++) {
            int colA = 0;
            int colB = 0;
            for (int i = 0; i < n; i++) {
                colA += a[i][j];
                colB += b[i][j];
            }
            if (colA % 3 != colB % 3) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        return;

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

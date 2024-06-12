import java.util.*;

public class Problem1873C {

    private static final int[][] POINTS = {
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
            { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 },
            { 1, 2, 3, 4, 4, 4, 4, 3, 2, 1 },
            { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 },
            { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 },
            { 1, 2, 3, 4, 4, 4, 4, 3, 2, 1 },
            { 1, 2, 3, 3, 3, 3, 3, 3, 2, 1 },
            { 1, 2, 2, 2, 2, 2, 2, 2, 2, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
    };

    private static void solve(int t, List<List<String>> testCases) {
        for (int k = 0; k < t; k++) {
            List<String> grid = testCases.get(k);
            int totalPoints = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (grid.get(i).charAt(j) == 'X') {
                        totalPoints += POINTS[i][j];
                    }
                }
            }
            System.out.println(totalPoints);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline

        List<List<String>> testCases = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            List<String> grid = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                grid.add(sc.nextLine());
            }
            testCases.add(grid);
        }

        solve(t, testCases);

        sc.close();
    }
}
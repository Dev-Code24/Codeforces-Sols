import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

public class Problem1829E {
    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int TC = parseInt(nextToken());

        while (TC-- > 0) {
            int n = parseInt(nextToken()), m = parseInt(nextToken());

            int[][] arr = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = parseInt(nextToken());
                }
            }

            int[][] vis = new int[n][m];
            int max = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (arr[i][j] != 0 && vis[i][j] == 0) {
                        max = Math.max(bfs(i, j, vis, arr, n, m), max);
                    }
                }
            }

            System.out.println(max);
        }

        out.flush();
        out.close();
        br.close();
    }

    static int bfs(int row, int col, int[][] vis, int[][] arr, int n, int m) {

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { row, col });
        vis[row][col] = 1;

        int score = arr[row][col];

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int ro = current[0];
            int co = current[1];

            for (int i = 0; i < dx.length; i++) {
                int r = ro + dx[i];
                int c = co + dy[i];

                if (r >= 0 && c >= 0 && r < n && c < m && vis[r][c] == 0
                        && arr[r][c] != 0) {
                    vis[r][c] = 1;
                    score += arr[r][c];
                    q.add(new int[] { r, c });
                }
            }
        }

        return score;
    }

    static String nextToken() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
}

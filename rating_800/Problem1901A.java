package rating_800;
import java.util.Scanner;

/**
 * Problem1901A
 */
public class Problem1901A {
    private static int minPossibleTankVolume(int x, int[] stations) {
        int n = stations.length;
        int prev = 0, minVol = 0;
        for (int i = 0; i < n; ++i) {
            minVol = Math.max(minVol, stations[i] - prev);
            prev = stations[i];
        }
        minVol = Math.max(minVol, 2 * (x - prev));
        return minVol;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            System.out.println(minPossibleTankVolume(x, arr));
        }
        sc.close();
    }
}
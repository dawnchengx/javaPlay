import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

class Plan4 {
    public static void main(String[] args){
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        printCutSolution(p, 7);
    }
    private static void printCutSolution(int[]p, int n) {
        int[][] res = extendedBottomUpCutRod(p, n);
        int[] r = res[0];
        int[] s = res[1];
        while(0 < n) {
            System.out.println(s[n]);
            n = n - s[n];
        }
        System.out.println(Arrays.toString(s));
    }
    private static int[][] extendedBottomUpCutRod(int[] p, int n) {
        int i, j, q;

        int[] s = new int[n+1];
        int[] r = new int[n+1];
        r[0] = 0;
        for(j = 0; j <= n; j++) {
            q = Integer.MIN_VALUE;
            for(i = 1; i <=j; i++) {
                if(q < p[i-1]+r[j-i]){
                    q = p[i-1]+r[j-i];
                    s[j] = i;
                    r[j] = q;
                }
            }
        }
        int[][] res = {r, s};
//        System.out.println(Arrays.toString(res[0]));
//        System.out.println(Arrays.toString(res[1]));
        return res;
    }
}
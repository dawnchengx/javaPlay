import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

class Plan3 {
    public static void main(String[] args){
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println("q:" + bottomUpCutRod(p, 2));
        System.out.println("q:" + bottomUpCutRod(p, 4));
        System.out.println("q:" + bottomUpCutRod(p, 6));
        System.out.println("q:" + bottomUpCutRod(p, 8));
        System.out.println("q:" + bottomUpCutRod(p, 9));
        System.out.println("q:" + bottomUpCutRod(p, 10));
    }
    private static int bottomUpCutRod(int[] p, int n) {
        int i, j, q;
        int[] r = new int[n+1];
        r[0] = 0;
        for(j = 1; j <= n; j++) {
            q = Integer.MIN_VALUE;
            for(i = 1; i <=j; i++) {
                q = Math.max(q, p[i-1]+r[j-i]);
            }
            r[j] = q;
        }
        return r[n];
    }
}
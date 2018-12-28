import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

class Plan2 {
    public static void main(String[] args){
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println("q:" + memoizedCutRod(p, 2));
        System.out.println("q:" + memoizedCutRod(p, 4));
        System.out.println("q:" + memoizedCutRod(p, 6));
        System.out.println("q:" + memoizedCutRod(p, 8));
        System.out.println("q:" + memoizedCutRod(p, 9));
        System.out.println("q:" + memoizedCutRod(p, 10));
    }
    private static int memoizedCutRod(int[] p, int n) {
        int i;
        int[] r = new int[n+1];
        for(i=0; i <= n; i++) {
            r[i] = Integer.MIN_VALUE;
        }
        return memoizedCutRodAux(p, n, r);
    }
    private static int memoizedCutRodAux(int[] p, int n, int[] r) {
        int q, i;
        if(0 <= r[n]) {
            return r[n];
        }
        if(0 == n) {
            q = 0;
        }else {
            q = Integer.MIN_VALUE;
            for(i=0; i<n; i++) {
                q = Math.max(q, p[i] + memoizedCutRodAux(p, n-i-1, r));
            }
        }
        r[n] = q;
        return q;
    }
}
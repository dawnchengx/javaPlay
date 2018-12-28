import java.util.Arrays;
import java.lang.Integer;
import java.lang.Math;

class Plan1 {
    public static void main(String[] args){
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        System.out.println("q:" + cutRod(p, 2));
        System.out.println("q:" + cutRod(p, 4));
        System.out.println("q:" + cutRod(p, 6));
        System.out.println("q:" + cutRod(p, 8));
        System.out.println("q:" + cutRod(p, 9));
        System.out.println("q:" + cutRod(p, 10));
    }
    private static int cutRod(int[] p, int n) {
        int q,i;
        if(0 == n) {
            return 0;
        }
        q = Integer.MIN_VALUE;
        for(i=0; i<n; i++) {
            q = Math.max(q, p[i] + cutRod(p, n-i-1));
        }
        return q;
    }
}
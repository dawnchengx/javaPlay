import java.util.Arrays;
class Find1 {
    public static void main(String[] args){
        int[] arr = {3, 2, 5, 9, 6, 22, 7, 10, 12};
        System.out.println("min, max:" + Arrays.toString(FindMinAndMax(arr)));
    }
    private static int[] FindMinAndMax(int[] arr) {
        int min, max, i, alen;
        alen = arr.length;
        if( 0 == alen%2) {
            if(arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            }else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        }else{
            min = arr[0];
            max = arr[0];
            i = 1;
        }
        for(; i < alen; i+=2) {
            if(arr[i] < arr[i+1]) {
                if(arr[i] < min) {
                    min = arr[i];
                }
                if(arr[i+1] > max) {
                    max = arr[i+1];
                }
            }else {
                if(arr[i+1] < min) {
                    min = arr[i+1];
                }
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        int[] res = {min, max};
        return res;
    }
}
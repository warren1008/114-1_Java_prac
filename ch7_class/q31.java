public class q31 {
    public static void main(String[] args) {
        System.out.println("結果為:" + smallest(8,9));
        int[] arr ={12,7,32,67};
        System.out.println("結果為" +smallest(arr));
    }

    public static int smallest(int a, int b) {
        return (a< b)?a:b;
    }
    public static int smallest(int[] arr) {
        int min = arr[0];
        for(int i: arr){
            min = (i < min) ? i : min;
        }
        return min;
    }
}

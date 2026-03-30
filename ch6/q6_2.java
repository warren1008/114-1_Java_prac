public class q6_2 {
    public static void main(String[] args) {
        int[] a = {18, -51, 23, 35};
        int[] b = {28, 32, -35, 48};
        int[] c = new int[4];
        for(int i = 0; i < a.length; i++){
            if(a[i]>b[i]){
                c[i] = a[i];
            } 
            else
                c[i] = b[i]; 

        System.out.printf("c[%d] = %d\n", i, c[i]);
        }
    }
}

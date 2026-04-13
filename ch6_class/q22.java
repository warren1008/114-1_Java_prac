public class q22 {
    public static void main(String[] args) {
        int[] a = {14,36,31,61,55};
        int[] b = new int[a.length];
        
        for(int i =0;i < b.length;i++){
            b[i] = a[i];
        }
        a[0] =100;

        System.out.print("陣列a:");
        for(int i: a){
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.print("陣列b:");
        for(int j: b){
            System.out.print(j+ " ");
        }
        System.out.println();



    }
}

public class q21 {
    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b ={9,8,7,6};
        int[] temp = a;
        a=b;
        b=temp;

        /*for(int i =0; i < temp.length;i++){
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp[i]; 
        }*/
        System.out.println("轉換後:");   
        System.out.print("陣列a:");
        for(int i :a){
            System.out.print( i+" ");
        }

        System.out.print("陣列b:");
        for(int j :b){
            System.out.print( j+" ");
        }
        


    }
}

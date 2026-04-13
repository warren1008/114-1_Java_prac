public class q8 {
    public static void main(String[] args) {
        int[] arr = {12,43,56,77};
        int[] ind = {2,0,1,3};
        int temp[] = new int[arr.length];
        System.out.print("替換後:");
        for(int i =0;i < arr.length;i++){
            temp[i] = arr[ind[i]];
            
        }
        //更新記憶體的指向
        arr = temp;
        for(int i :arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }
}

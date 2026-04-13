public class q7 {
    public static void main(String[] args) {
        
        int[] arr = {12,15,8,43};
        
        System.out.print("反轉前:");
        for(int i :arr){
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("反轉後");
        int temp;
        for(int i = 0;i < arr.length /2; i++){
            temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for(int i:arr){
            System.out.print(i +" ");
        }

    }
}

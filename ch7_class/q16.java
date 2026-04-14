import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("請設定陣列元素個數:");
        int num = scn.nextInt();
        int arr[] = new int[num];

        System.out.print("請設定陣列元素:");
        for(int i = 0; i <arr.length;i++){
            System.out.printf("arr[%d] : ", i);
            arr[i] = scn.nextInt();
        }
        
        System.out.println("陣列中元素為奇數的個數:"+odd(arr));
        scn.close();
    }
    public static int odd(int[] arr) {
        int count = 0;
        for(int i=0; i <arr.length;i++){
            if(arr[i] %2 != 0){
                count++;
            }
        }
        return count;
    }
}

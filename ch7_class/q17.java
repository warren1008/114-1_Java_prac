import java.util.Scanner;

public class q17 {
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
        System.out.println("陣列中最小的元素值是:" + min(arr));
        scn.close();
    }
    public static int min (int arr[]) {
        int min = arr[0];
        for(int i=0;i <arr.length;i++){
            min = (arr[i] < min)? arr[i]: min;
        }
        return min;
    }
}

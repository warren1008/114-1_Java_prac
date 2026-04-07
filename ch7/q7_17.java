import java.util.Scanner;
public class q7_17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("輸入欲放入陣列的元素個數:");
        int num = scn.nextInt();
        int arr[] = new int[num];
        System.out.println("請輸入陣列元素以計算陣列中最小值之元素");
        for(int i =0 ; i < arr.length;i++){
            System.out.printf("arr[%d] : ",i);
            int n = scn.nextInt();
            arr[i] = n;
        }
        System.out.println("arr中最小值為:"+ min(arr));
        scn.close();
    }
    public static int min(int[] arr) {
        int temp = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i] < temp)
                temp = arr[i];
        }
        return temp;
    }
}

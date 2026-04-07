import java.util.Scanner;
public class q7_21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請設定一維陣列元素個數:");
        int num = scn.nextInt();
        int arr[] = new int[num];
        
        System.out.println("設定陣列元素:");
        
        for(int i = 0; i < num; i++){
            System.out.printf("arr[%d] :", i);
            arr[i] = scn.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];

            if(arr[i] > max)
                max = arr[i];
        }
        System.out.printf("arr陣列中，最大值:%d 和最小值:%d ，其相乘結果為: %d\n", min, max, product(arr));
        scn.close();
    }
    public static int product(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];

            if(arr[i] > max)
                max = arr[i];
        }
        int result = min * max;
        return result;
    }
}

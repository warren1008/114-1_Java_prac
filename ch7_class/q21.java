import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("請設定一維陣列元素個數:");
        int num = scn.nextInt();
        System.out.println("請設定陣列元素");
        int arr[] =new int[num];
        for(int i =0;i< arr.length;i++){
            System.out.printf("arr[%d] :", i);
            arr[i] = scn.nextInt();
        }
        System.out.printf("陣列中最大值和最小值兩者乘積為:%d\n",product(arr));
        
        scn.close();
    }
    public static int product(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length;i++){
            max = (arr[i] > max) ? arr[i]: max;
            min = (arr[i] < min) ? arr[i]: min;
        }
        return min *max;
    }
}

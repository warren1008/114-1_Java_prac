import java.util.Scanner;

public class q7_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("輸入欲放入陣列的元素個數:");
        int m = scn.nextInt();

        int[] arr = new int[m];
        System.out.println("請輸入陣列元素以計算陣列中最小元素值之索引");

        for(int i=0 ; i<arr.length ; i++){
            System.out.printf("arr[%d] : ", i);
            int n = scn.nextInt();
            arr[i] = n;
        }
        System.out.printf("陣列arr中，最小元素值為索引%d，其值為%d\n", argmin(arr), arr[argmin(arr)]);
        scn.close();        
    }

    public static int argmin(int[] arr) {
        int minIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    }


}

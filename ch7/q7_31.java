import java.util.Scanner;
//撰寫 smallest 多載函數

public class q7_31 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("請輸入兩個整數");
        System.out.print("請輸入整數1:");
        int i = scn.nextInt();

        System.out.print("請輸入整數2:");
        int j = scn.nextInt();
        
        System.out.println("比較小的整數是:" + smallest(i, j));
        
        System.out.println("===============");
        
        System.out.print("請設定陣列元素個數:");
        int num = scn.nextInt();
        int arr[] = new int[num];
        System.out.println("設定陣列元素");
        for(int k = 0;k < arr.length; k++){
            System.out.printf("arr[%d] : ", k);
            arr[k] = scn.nextInt();
            System.err.println();
        }

        System.out.print("你輸入的陣列arr的內容有:");
        for(int m = 0; m <arr.length; m++){
            System.out.print(arr[m] + " ");
        }

        System.out.println();
        System.out.println("輸出結果");
        System.out.println("陣列中最小的元素為" + smallest(arr));
    
        scn.close();

    }

    public static int smallest(int j, int k) {
        
        if(k < j){
            return k;
        }
        return j;
    }

    public static int smallest(int arr[]) {
        //int array[] = new int[arr.length];
        
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min);{
                min = arr[i];
            }
        }
        return min;

    }
}

import java.util.Scanner;
public class q7_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入你欲設定陣列元素個數:");
        int m = scn.nextInt();
        int arr[] = new int[m];

        System.out.println("請輸入陣列元素以計算奇數個數");
        for(int i =0;i<m;i++){
            System.out.printf("arr[%d] : ", i);
            int n = scn.nextInt();
            arr [i] = n; 
        }        
        System.out.printf("陣列arr中，元素為奇數的個數總共有%d個\n", odd(arr));
        scn.close();
    }
    public static int odd(int[] arr) {
        int count = 0;
        //for(int i =0; i <arr.length;i++){
        for(int e: arr){
            if(e % 2 != 0)
                count++;
        }        
        return count;
    }
}

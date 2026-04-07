import java.util.Scanner;

public class q7_19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請設定二維陣列列數:");
        int r = scn.nextInt();
        System.out.print("請設定二維陣列行數:");
        int c = scn.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("請依序設定陣列元素:");
        for(r = 0; r < arr.length;r++){
            System.out.println("設定第" + (r+1) + "列");
            for (c = 0; c < arr[r].length ; c++){
                System.out.printf("arr[%d][%d] : ", r, c);
                int num = scn.nextInt();
                arr[r][c] = num; 
            }
            System.out.println();
        }
        System.out.println("二維陣列中最大值為:" + max(arr));
        scn.close();
    }
    public static int max(int[][] arr) {
        int max = arr[0][0];

        for(int r = 0; r< arr.length;r++){
            for(int c = 0; c < arr[r].length ; c++){
                if(arr[r][c] > max){
                    max = arr[r][c];
                }
            }
        }
        return max;
    }

}

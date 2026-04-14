import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("請設定二維陣列列數:");
        int row = scn.nextInt();
        
        System.out.print("請設定每一列元素個數:");
        int num = scn.nextInt();
        
        int arr[][] = new int[row][num];

        System.out.print("請設定陣列元素:");
        for(int i = 0; i <arr.length;i++){
            System.out.printf("第%d列\n", i);
            for(int j = 0;j <arr[i].length;j++){
                System.out.printf("arr[%d][%d]:",i,j);

                arr[i][j] = scn.nextInt();
            
            }

            System.out.println();
            
        }
        System.out.println("最大值為:"+ max(arr));
        scn.close();
    }
    public static int max(int[][] arr) {
        int max = arr[0][0];
        for(int r=0;r< arr.length;r++){
            for(int c =0;c<arr[r].length;c++){
                if(arr[r][c] > max){
                    max = arr[r][c];
                }
            }
        }
        return max;
    }
}

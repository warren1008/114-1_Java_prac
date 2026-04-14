import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
          Scanner scn =new Scanner(System.in);
    System.out.print("請設定二維陣列列數:");
        int row = scn.nextInt();
        
        System.out.print("請設定每一列元素個數:");
        int col = scn.nextInt();
        
        int arr[][] = new int[row][col];

        System.out.print("請設定陣列元素");
        for(int i = 0; i <arr.length;i++){

            System.out.printf("第%d列\n", i);

            for(int j = 0;j <arr[i].length;j++){
                System.out.printf("arr[%d][%d]:",i,j);

                arr[i][j] = scn.nextInt();
            
            }

            System.out.println();
            
        }
        int result[] =argmax(arr);
        System.out.printf("最大元素值為%d，列索引:%d，行索引:%d\n", arr[result[0]][result[1]], result[0],result[1]);
        scn.close();
    }
    public static int[] argmax(int[][] arr) {

        int maxIndexR = 0;
        int maxIndexC = 0;
        

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if( arr[i][j]> arr[maxIndexR][maxIndexC]){
                    maxIndexR = i;
                    maxIndexC = j;
                }
            }
        }
        int result[] = {maxIndexR, maxIndexC};
        return result;
    }
}

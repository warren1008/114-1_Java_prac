import java.util.Scanner;

public class q23 {
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
            
        }
        System.out.println("平方前的陣列:");
            
        for(int i = 0;i <arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
            
        square(arr);

        
            
        scn.close();
    }

    public static void square(int[][] arr){
        System.out.println("平方後的陣列:");
            
        for(int i = 0;i <arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] *= arr[i][j];
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println();
        }
        System.out.println();
    }
}

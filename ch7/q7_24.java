//傳回全新的平方陣列 (Return a new array)
import java.util.Scanner;
public class q7_24 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("設定二維陣列之列數:");
        int row = scn.nextInt();

        System.out.print("設定二維陣列之行數:");
        int col = scn.nextInt();

        int arr[][] = new int[row][col];
        System.out.println("依序設定二維陣列元素:");
        
        for(int r = 0; r < arr.length; r++){
            System.out.printf("第%d列:\n", r+1);
            
            for(int c = 0; c < arr[r].length; c++){
                System.out.printf("arr[%d][%d]: ", r, c);
                arr[r][c] = scn.nextInt();   
            }
            System.out.println();
        }
        System.out.println("你輸入的陣列內容有:");
        for(int i[] : arr){
            for(int j :i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("平方後，結果是:");
        int result[][] = square(arr); //宣告一個新的二維陣列，用來存放square函數傳回值
        
        //列印陣列
        for(int i[] :result){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scn.close();
    }
    public static int[][] square(int arr[][]) {
        //// 先配置一個與原陣列相同列數 (Row) 的新陣列
        int result[][] = arr;

        for(int i = 0; i < result.length;i++){
            for(int j = 0 ; j < result[i].length;j++){
                result[i][j] *= result[i][j]; 
            }
        }
        return result;
    }
}

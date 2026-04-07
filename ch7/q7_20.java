import java.util.Scanner;
public class q7_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請設定二維陣列之列數:");
        int r = scn.nextInt();

        System.out.print("請設定二維陣列之行數:");
        int c = scn.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("請依序設定陣列元素");

        for( r = 0; r < arr.length ; r++){   
            System.out.println("設定第"+(r+1)+"列元素");
            
            for(c = 0; c < arr[r].length ; c++){
                System.out.printf("arr[%d][%d]:", r, c);
                arr[r][c] = scn.nextInt();
            }
            System.out.println();
        }
        //訂正
        int[] result = argmax(arr);

        System.out.print("二維陣列中，");
        System.out.printf("最大值其列索引為:%d，行索引為:%d\n",result [0], result[1]);
        System.out.printf("其值arr[%d][%d]:%d\n",result[0], result[1], arr[result[0]][result[1]]);

        scn.close();
    }
    public static int[] argmax(int[][] arr) {
        int rMaxIndex = 0;
        int cMaxIndex = 0;
        for(int r= 0; r < arr.length ; r++){
            for(int c = 0; c < arr[r].length ; c++){
                if(arr[r][c] > arr[rMaxIndex][cMaxIndex]){
                    rMaxIndex = r;
                    cMaxIndex = c;
                }
            }
        }
        //在 Java 中，大括號 {} 的陣列初始化寫法，只能在「宣告變數的當下」使用。
        //一旦變數宣告完了，就不能再用 {} 來重新賦值。
        //int result[] = {rMaxIndex, cMaxIndex};
        return new int[]{rMaxIndex, cMaxIndex};
    
    }
}

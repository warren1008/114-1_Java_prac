//直接修改二維陣列的元素 (In-place modification)
import java.util.Scanner;
public class q7_23 {
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
        System.out.println("平方前的陣列:");
        for(int i[]: arr){
            for(int j : i){
                System.out.print(j+ "\t");
            }
            System.out.println();
        }

        System.out.println("平方後的陣列:");
        square(arr);
        
        scn.close();
    }
    public static void square(int arr[][]){

        for(int r[] :arr){
            for(int c: r){
                c*=c;
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}

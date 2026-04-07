import java.util.Scanner;
public class q7_22 {
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
                System.out.printf("arr[%d][%d]:", r, c);
                arr[r][c] = scn.nextInt();
            }
            System.out.println();
        }
        System.out.printf("二維陣列arr所有元素的平均值 = %.2f\n",mean(arr));
        scn.close();
    }
    public static double mean(int arr[][]) {
        double average;
        double sum = 0.0;
        int count = 0;
        /*for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                sum += arr[i][j];
                count++;
            }
        }*/

        //for-each loop
        
        for(int[] r : arr){
            for(int c: r){
                sum += c;
                count++; 
            }
        }
        
        average = sum / count; 
        return average;

    }


}

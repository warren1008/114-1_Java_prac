import java.util.Scanner;

public class q22 {
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
        System.out.printf("陣列平均為: %.2f\n", mean(arr));
        scn.close();
    }
    public static double mean(int[][] arr) {
        double sum =0.0;
        int count = 0;
        for(int r[]: arr){
            for(int c: r){
                sum +=c;
                count++;
            }
        }
        double average = sum / count;
        return average;
    }
}

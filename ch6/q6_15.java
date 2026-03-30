//非矩形陣列
public class q6_15 {
    public static void main(String[] args) {
        int arr[][] = {
            {4, 2},
            {3, 4, 6},
            {7, 4, 8, 5}
        };
        int max = arr[0][0];
        System.out.println("陣列內容: ");
        for(int[] row : arr){
            for(int column: row){
                System.out.print(column + " ");
                if(column > max){
                    max = column;
                }
            }   
            System.out.println();
        }
        System.out.println("最大值為:" + max);
    }
}

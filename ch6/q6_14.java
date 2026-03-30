public class q6_14 {
    public static void main(String[] args) {
        int arr[][] ={
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Print out square of arr[][]");
        System.out.println("陣列平方前:");
        int sqreNum[][] = new int[2][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print( arr[i][j]+" ");
                sqreNum[i][j] = (arr[i][j]) * (arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("陣列平方後:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(sqreNum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

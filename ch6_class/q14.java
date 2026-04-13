public class q14{
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {4,5,6}
        };
        System.out.println("陣列平方前:");
        for(int r = 0; r< arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                System.out.print(arr[r][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("陣列平方後:");

        int squareArr[][] = new int[arr.length][arr[0].length];
        
        for(int r = 0; r < squareArr.length; r++){
            for(int c = 0; c < squareArr[r].length; c++){
                squareArr[r][c] = (arr[r][c])*(arr[r][c]);
                System.out.print(squareArr[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
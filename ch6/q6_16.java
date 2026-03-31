//建立6*6的二維陣列
public class q6_16 {
    public static void main(String[] args) {
        int arr[][] = new int[6][6];
        for(int r = 0; r < arr.length;r++){
            for(int c = 0 ; c < arr[r].length ; c++){
                arr[r][c] = 6 * r + c;
                System.out.printf("%2d ", arr[r][c]);
            }
            System.out.println();
        }



    }
}

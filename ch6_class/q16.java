public class q16 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        System.out.println("陣列內容:");  
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length;c++){
                arr[r][c] = 6 * r + c;
                System.out.print(arr[r][c] +"\t");
            }
            System.out.println();
        }
    }
}

//找出最小值的列索引和行索引

public class q6_13 {
    public static void main(String[] args) {
        int arr[][] = {
            {18, 21, 30},
            {40, 34, 61},
            {42, 15, 18}
        };

        int minR = 0;
        int minC = 0;
        
        for(int r = 0; r < arr.length ; r++){
            for(int c = 0; c<arr[r].length; c++){
                if( arr[r][c] < arr[minR][minC]){
                    minR = r;
                    minC = c;
                }
            }
        }
        System.out.printf("arr[]中，最小值為%d, 其列索引為%d，行索引為%d\n", arr[minR][minC], minR, minC);
        
        
        //System.out.println("陣列arr中，最小值之列索引為:" + minR);
        //System.out.println("陣列arr中，最小值之行索引為:" + minC);
    }
}

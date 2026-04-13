public class q17 {
    public static void main(String[] args) {
        int[][][] arr ={
            {
                {15,85,36},
                {30,14,37},
                {47,23,96},
                {19,39,51}
            },
            {
                {22,16,51},
                {97,30,12},
                {68,77,26},
                {57,32,76} 
            }
        };
        int min = arr[0][0][0];
        for(int p = 0; p < arr.length; p++){
            for(int r = 0; r < arr[p].length; r++){
                for(int c = 0; c < arr[p][r].length; c++){
                    if(arr[p][r][c] < min){
                        min = arr[p][r][c];
                    }
                }
            }
        }
        System.out.println("最小值為:" + min);
    }
}

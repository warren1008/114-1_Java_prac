public class q6_18 {
    public static void main(String[] args) {
        int arr[][][] ={
            {
                {15, 85, 36},
                {30, 14, 37},
                {47, 23, 96},
                {19, 39, 51}
            },
            {
                {22, 16, 51},
                {97, 30, 12},
                {68, 77, 26},
                {57, 32, 76}
            }
        };
        int min = arr[0][0][0];
        System.out.println("3維陣列 arr[][][]元素有:");
        for(int[][] p: arr){
            for(int[] r: p){
                for(int c : r){
                    System.out.print(c +" ");
                    if(c < min){
                        min = c;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("陣列arr中最小值為:" + min);
    
    }
}

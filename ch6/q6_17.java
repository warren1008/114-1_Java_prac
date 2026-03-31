//三維陣列

public class q6_17 {
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
        int minP = 0;
        int minR = 0;
        int minC = 0;
        System.out.println("三維陣列arr元素有:");
        for(int p = 0; p < arr.length ; p++){      
            for(int r = 0; r < arr[p].length ; r++){
                for(int c = 0; c < arr[p][r].length ; c++){
                        System.out.print(arr[p][r][c] + " ");

                        if(arr[p][r][c] < arr[minP][minR][minC]){
                        minP = p;
                        minR = r;
                        minC = c;
                        arr[minP][minR][minC] = arr[p][r][c];
                    }

                }
                System.out.println();
            }
            System.out.println();  
        }
        
        /*int minP = 0;
        int minR = 0;
        int minC = 0;
        for(int p = 1; p < arr.length; p++){
            for(int r = 1; r < arr[p].length; r++){
                for(int c = 1; c < arr[p][r].length; c++){
                    if(arr[p][r][c] < arr[minP][minR][minC]){
                        minP = p;
                        minR = r;
                        minC = c;
                        arr[minP][minR][minC] = arr[p][r][c];
                    }
                }
            }
        }*/
        System.out.println("陣列arr中最小值:" + arr[minP][minR][minC]);
        System.out.println("其陣列索引[第一、第二、第三]維度索引分別為:" + minP +" "+ minR + " " + minC);



    }
}

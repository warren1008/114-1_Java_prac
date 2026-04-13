public class q13 {
    public static void main(String[] args) {
        int arr[][] = {
            {18,21,30},
            {40,34,61},
            {41,15,18}
        };
        

        System.out.println("陣列內容:");
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c< arr[r].length; c++){
                System.out.print(arr[r][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("找出最小值的行和列索引");
        int minIndexR =0;
        int minIndexC =0;
        
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c< arr[r].length; c++){
                if(arr[r][c] < arr[minIndexR][minIndexC]){
                    minIndexR = r;
                    minIndexC = c;
                } 
            }
        
        }

        System.out.printf("最小值為%d，其行索引為%d，其列索引為%d\n", arr[minIndexR][minIndexC], minIndexC, minIndexR);

    }
}

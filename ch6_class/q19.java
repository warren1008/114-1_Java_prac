public class q19 {
    public static void main(String[] args) {
        int[][][] arr ={
            {
                {82,13,21},
                {49,12,6},
                {4,18,30},
                {50,24,62}
            },
            {
                {7,9,14},
                {20,43,19},
                {20,68,33},
                {15,17,38}
            }
        };
        //將陣列中所有偶數設為0

        System.out.println("轉換前:");
        
        for(int p[][] :arr){
            
            for(int r[]:p){
                for(int c:r){
                    System.out.print(c +"\t");
                    
                }
                System.out.print("||");
            }
            System.out.println();
        }

        System.out.println("轉換後:");
        for(int p = 0;p< arr.length; p++){
            for(int r = 0; r< arr[p].length;r++){
                for(int c = 0;c < arr[p][r].length; c++){
                    if(arr[p][r][c] % 2 == 0){
                        arr[p][r][c] = 0;
                    }
                    System.out.print(arr[p][r][c] + "\t");
                }
                System.out.print("||");
            }
            System.out.println();
        }
    
    }
}

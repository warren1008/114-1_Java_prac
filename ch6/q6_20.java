public class q6_20 {
    public static void main(String[] args) {
        int arr[][][] = {
            {
                {15, 50, 65},
                {38, 94, 25},
                {79, 44, 19},
                {89, 54, 73}
            },
            {
                {14, 90, 46},
                {43, 23, 67},
                {32, 56, 78},
                {94, 78, 40}
            }
        };
        System.out.println("陣列內容:");

        for(int p = 0; p < arr.length ; p++){
            for(int r = 0; r < arr[p].length ; r++){
                for(int c = 0; c < arr[p][r].length; c++){
                    System.out.print( arr[p][r][c]+" ");
                    if(arr[p][r][c] >= 50){
                        arr[p][r][c] = 99;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("陣列轉換後的內容:");
        for(int p[][] :arr){
            for(int r[] : p){
                for(int c : r){
                    System.out.print( c+" ");
                }  
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("===程式執行結束!!==");
    }
}

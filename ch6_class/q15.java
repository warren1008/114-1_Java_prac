public class q15 {
    public static void main(String[] args) {
        //非矩形陣列
        int arr[][] = {
            {4,2},
            {3,4,6},
            {7,4,8,5}
        };
        //for-each loop 找出最大值
        int max = arr[0][0];
        
        for(int r[] : arr){
            for(int c : r){
                System.out.print(c + "\t");
                if(c > max){
                    max = c;
                }
            }
            System.out.println();
        }
        System.out.println("陣列中最大值為:" + max);
        
    }
}

public class q4 {
    public static void main(String[] args) {
        
        int[] arr = {3,5,0,3,2,4,1,6,8,5,4,3,2};
        int count = 0;
        System.out.println("陣列元素個數:" + arr.length);
        for(int i :arr){

            System.out.print(i+ " ");
            if(i >= 3 && i <= 6){
                count++;
            }
        }
        System.out.printf("總共有%d個\n", count);

    }
}

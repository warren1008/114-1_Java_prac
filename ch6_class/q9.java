//2 3 5 7 11 13 17 19 23 29
public class q9 {
    public static void main(String[] args) {
        int[] primes = new int[10];
        int count = 0;
        int i =2;
        //count 當作索引最高為9(0-9)
        while(count < primes.length){

            //i+1時候，isPrime 需要重置
            //每次檢查數字i時，預設為質數
            //isPrime =true;

            boolean isPrime = true;

            for(int j =2;j < i;j++){
                
                if(i % j ==0){
                    isPrime = false;
                    break;//提早結束迴圈
                }
            }
        
            if(isPrime){    
                primes[count] = i;   
                count++;     
            }
            i++;
        }//while loop ended

        
        for(int k: primes){
            System.out.print(k+ " ");
        }
        System.out.println();

    }
}

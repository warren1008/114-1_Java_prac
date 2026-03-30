//習題 9：尋找前 10 個質數並存入陣列
//這裡結合了「質數判定邏輯」與「動態填入陣列」。
// 我們需要一個獨立的計數器來記錄目前已經找到了幾個質數，並把它當作陣列的索引。

public class q6_9 {
    public static void main(String[] args) {
        System.out.println("動態填入質數陣列arr:");
        int count = 0;
        int arr[] = new int[10];

        for(int i = 2 ; ; i++ ){
            boolean isPrime = true;
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                arr[count] = i;
                System.out.printf("arr[%d] = %d\n", count, arr[count]);
                count++;
            }
        
            if(count >= 10){
                System.out.println("程式執行結束!!");
                break;
            }
        }
    }   
}

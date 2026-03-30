public class q6_9_while {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int number = 2;
        int count = 0;

        while(count < 10){
            boolean isPrime = true;

            for(int i = 2; i < number;i++){
                if(number % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                arr[count] = number;
                System.out.printf("arr[%d]=%d ", count, arr[count]);
                count++;
            }
            number++;
        }   
        System.out.println();
        System.out.println("前10個質數為:");
        for(int i = 0;i < arr.length; i++){
            System.out.printf("arr[%d]=%d ", i, arr[i]);
        }
        System.out.println();
        System.out.println("程式執行結束!!");
        
    }
}

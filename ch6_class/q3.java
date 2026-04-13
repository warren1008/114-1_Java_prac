public class q3 {
    public static void main(String[] args) {
        int arr[] = {53, 27, 69, 12, 3, 96};
        int evenCnt = 0;
        int oddCnt = 0;
        int maxEven = 0;
        int maxOdd = 1;

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        //for-each
        //for(int i :arr) System.out.print(i + " ");
            
            if(arr[i] % 2 == 0){
                evenCnt++;
                maxEven = arr[i] > maxEven ? arr[i] : maxEven;
            }
            else{
                oddCnt++;
                maxOdd = arr[i] > maxOdd ? arr[i] : maxOdd;
            }
        }
        System.out.println();
        System.out.println("基數個數:" + oddCnt);
        System.out.println("偶數個數:" + evenCnt);

        System.out.println("基數最大值:" + maxOdd);
        System.out.println("偶數最大值:" + maxEven);

    }
}

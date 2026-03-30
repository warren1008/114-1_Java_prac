public class q6_3 {
    public static void main(String[] args) {
        int[] arr = {53, 27, 69, 12, 3,96};

        System.out.println("陣列 arr[] 中元素有:");
        //for each loop
        for(int i: arr)
            System.out.print(i + " ");
        /*for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }*/
        
        System.out.println();
        System.out.println("======================");
        //計算奇數和偶數個別數量
        //找出奇數和偶數中個別之最大值

        int count = 0; //偶數數量
        int count1 = 0; //奇數數量
        int oddNum = 1; //偶數最大值
        int evenNum = 0; //奇數最大值
        //for each loop 
        //for (int j arr)
        for(int j = 0 ; j < arr.length ; j++){
            //偶數
                if(arr[j] % 2 ==0){
                    count++;
          
                    /*if(arr[j] > evenNum){
                        evenNum = arr[j];
                    }*/
                    evenNum = arr[j] > evenNum ? arr[j] : evenNum;
                }
            //奇數
                else {
                    count1++;
                    
                    /*if(arr[j] > oddNum){
                        oddNum = arr[j];
                    }*/
                    oddNum = arr[j] > oddNum ? arr[j] : oddNum;
                }
        }

        System.out.println("陣列arr中偶數共有" + count + "個");
        System.out.println("陣列arr中奇數共有" + count1 + "個");

        System.out.println("======================");

        System.out.println("陣列arr中，元素為偶數且為陣列arr的最大值為:"+ evenNum);
        System.out.println("陣列arr中，元素為奇數且為陣列arr的最大值為:"+ oddNum);

        System.out.println("=====程式執行結束 !!=====");
    }
}

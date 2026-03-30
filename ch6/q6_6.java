public class q6_6 {
    public static void main(String[] args) {
        // 宣告並初始化陣列 
        int[] arr = {78, 43, 92, 11, 7};
        
        int minIndex = 0;
        int maxIndex = 0;

        for(int i = 1 ; i < arr.length ; i++){
            minIndex = arr[i] < arr[minIndex] ? i : minIndex; 
            maxIndex = arr[i] > arr[maxIndex] ? i : maxIndex;
        }
        System.out.println("最大值索引為:" + maxIndex);
        System.out.printf("其值為arr[%d] = %d\n", maxIndex, arr[maxIndex]);
        System.out.println("最小值索引為:" + minIndex);
        System.out.printf("其值為arr[%d] = %d\n", minIndex, arr[minIndex]);
    }
}

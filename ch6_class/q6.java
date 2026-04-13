public class q6 {
    public static void main(String[] args) {
        int[] arr = {78,43,92,11,7};
        int maxIndex = 0;
        int minIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[maxIndex]){
                maxIndex = i;
            }

            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }
        System.out.printf("最大值的索引為%d，其值為%d\n", maxIndex, arr[maxIndex]);
        System.out.printf("最小值的索引為%d，其值為%d\n", minIndex, arr[minIndex]);
    }
}

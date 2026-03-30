public class q6_5 {
    public static void main(String[] args) {
        int arr[] = {32, 16, 34, 71};
        int sum = 0;
        for(int i: arr){
            sum += arr[i];
        } 
        
        double avg = (double) sum / arr.length; 
        System.out.printf("陣列元素之平均值為:%.2f\n", avg);
    }
}

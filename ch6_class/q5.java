public class q5 {
    public static void main(String[] args) {
        int[] arr ={32,16,34,71};
        double sum = 0;
        for(int i:arr){
            sum = sum +i;
        }            
        System.out.printf("陣列平均:%.2f\n", sum / arr.length);
    }
}

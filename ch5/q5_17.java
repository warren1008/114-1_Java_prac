//Q17. 質數(Prime)是除了 1 和它本身之外，沒有其它因數的數。
// 試根據定義判別 89 是不是質數。
public class q5_17 {
    public static void main(String[] args) {
        boolean isPrime = true;
        int num = 89;
        for (int i = 2; i < num; i++) {
            if(num % i ==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("89是質數!!");
        else
            System.out.println("89不是質數!!");
    }
}

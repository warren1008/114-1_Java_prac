//Q14. 試撰寫一程式，求出 1 到 100 之間所有整數的平方和。
public class q5_14 {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i = 1; i <= 100; i++){
            sum += i*i;
        }
        System.out.println("1 到 100 之間所有整數的平方和為:" + sum);
    }
}

//Q16. 若a可以整除 b，則稱a為 b 的因數。試根據這個定義找出 64 所有的因數。

public class q5_16 {
    public static void main(String[] args) {
        System.out.print("64 的因數有:");
        for(int i = 1 ; i <= 64 ; i++){
            if (64 % i == 0)
                System.out.print(i + " ");
        }
    }
}

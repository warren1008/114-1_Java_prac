import java.util.Scanner;
public class q7_12 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("請輸入兩個整數計算其最小公倍數");
        //for(int i = 1; i <= 2; i++){
        //    System.out.print("整數" + i);
        //}

        System.out.print("整數 1 :");
        int x = scn.nextInt();

        System.out.print("整數 2 :");
        int y = scn.nextInt();
        
        int result = lcm(x, y);
        
        System.out.printf("%d和%d的最小公倍數為:%d\n", x, y, result);
        //scn.close();


        System.out.println("=======");
        System.out.print("請設定陣列元素個數:");
        int number = scn.nextInt();
        int array[] = new int[number];

        System.out.print("請設定陣列元素");
        
        for(int j = 0; j < array.length; j++){
            array[j] = scn.nextInt();
        }
        
        System.out.println("陣列所有元素的最小公倍數為: " + lcm(array));

        scn.close();
    }
    //最小公倍數函數

    public static int lcm(int m, int n) {
        //條件判斷式子
        int max = m > n ? m : n;

        int i =max;
        while(true){
            if(i % m ==0 && i % n == 0){
                return i;
            }
            i++;
        }
        //return max;
    }

    public static int lcm(int arr[]) {
        //條件判斷式子
        int max = arr[0];
        //for(int j = 1; j < arr.length; j++){
        for(int j: arr){
            max = j > max ? j: max;
        }

        //int i = max;
        while(true){
            //boolean isLcm = true;

            /*for(int i = 0; i < arr.length; i++){
                if(max % arr[i] == 0){
                    return max;
                }
                max++;
            }
            */
            
            
            boolean isLcm = true;
            for(int i :arr){
                if(max % i != 0){
                    isLcm = false;
                    break;
                }
            }
            if(isLcm){
                return max;
            }
            max++;
            

        }
    }
}

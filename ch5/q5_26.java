//Q26. 假設有一條繩子長 3500 公尺，每天剪去一半的長度，
// 請問需要花費幾天的時間，繩子的長度會短於 3 公尺？
// 請搭配 break 敘述來撰寫。

public class q5_26 {
    public static void main(String[] args) {
        double length = 3500.0;
        int day = 0;

        while(true){
            length /= 2;
            day++;
            if(length < 3.0)
                break;
        }
        System.out.println("需要花費"+ day +"天的時間,，繩子的長度會短於 3 公尺");
    }
}

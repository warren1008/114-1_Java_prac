public class q11 {
    public static void main(String[] args) {
        double[][] temp ={
            {18.2, 17.3, 15.0, 13.4},
            {23.8, 25.1, 20.6, 17.8},
            {20.6, 21.5, 18.4, 15.7}
        };
        //第一小題目
        System.out.println("===第一小題===");
        System.out.println("display array temp : ");
        
        //宣告星期和時段的字串陣列

        String weekday[] ={"星期一","星期二","星期三","星期四"};
        String period[] = {"時段一","時段二","時段三"};

        System.out.print("\t");//第0列第0欄需空格
    
        for(int i = 0; i < weekday.length; i++){
            System.out.print(weekday[i] +"\t");
        }
        System.out.println();
        
        for(int r = 0; r < temp.length; r++){
            //印出時段
        
            System.out.print(period[r] + "\t");
            
            for(int c = 0; c<temp[r].length;c++){
                System.out.print(temp[r][c] +"\t");
            }

            System.out.println();
        }

        System.out.println("===第二小題===");//印出每一日的平均氣溫
        
        for(int c = 0; c < temp[0].length;c++){
            //計算新的日子平均氣溫，sum需要重置
            double sum =0.0;
            double average;
            for(int r = 0;r < temp.length; r++){
                sum += temp[r][c];
            }
            average = sum / temp.length;
            System.out.printf("%s 的平均氣溫: %.2f\n", weekday[c],average);
        }

        System.out.println("===第三小題===");//印出個別時段的平均氣溫
        
        for(int r = 0; r < temp.length; r++){
            //計算新的時段平均氣溫，sum需要重置
            
            double sum =0.0;
            double average;

            for(int c = 0;c < temp[r].length; c++){
                sum += temp[r][c];
            }
            average = sum / temp[r].length; 
            
            System.out.printf("%s 的平均氣溫: %.2f\n", period[r],average);
        }
        System.out.println("===第四小題===");//找出溫度最高的日子與時段
        int maxR = 0;
        int maxC = 0;
        //找最高日子
        for(int r =0; r < temp.length; r++){
            for(int c = 0; c< temp[r].length; c++){
                if(temp[r][c] > temp[maxR][maxC]){
                    maxR = r;
                    maxC = c;
                }
            }
        }
        System.out.println("最高溫的日子與時段為:" + weekday[maxC]+ period[maxR]);
    
        System.out.println("===第五小題===");//找出溫度最低的日子與時段
        
        int minR = 0;
        int minC = 0;
        //找最低
        for(int r =0; r < temp.length; r++){
            for(int c = 0; c< temp[r].length; c++){
                if(temp[r][c] < temp[minR][minC]){
                    minR = r;
                    minC = c;
                }
            }
        }
        System.out.println("最低溫的日子與時段為:" + weekday[minC]+ period[minR]);



    }
}

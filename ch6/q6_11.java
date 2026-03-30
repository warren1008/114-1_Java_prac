public class q6_11 {
    public static void main(String[] args) {
        double[][] temp ={
            {18.2, 17.3, 15.0, 13.4},
            {23.8, 25.1, 20.6, 17.8},
            {20.6, 21.5, 18.4, 15.7}
        };

        String[] days ={"星期一", "星期二", "星期三", "星期四"} ;
        String[] periods ={"時段一", "時段二", "時段三"} ;

        System.out.println("氣溫表");
        System.out.println();
        for(int r =0 ; r < temp.length; r++){
            System.out.print(periods[r] + ":");
            for(int c = 0; c < temp[r].length;c++){
                System.out.print(temp[r][c] + "\t");
            }
            System.out.println();
        }
        System.out.println("每日平均氣溫:");
        //for(int c = 0; c < temp.length; c++){
        //    System.out.print(days + "\t");
        //}
        //System.out.println();
        for (int c  = 0; c < temp[0].length; c++){
            double sum = 0;
            for(int r = 0; r < temp.length ; r++){
                sum += temp[r][c];
            }
            double avg = sum / temp.length;
            System.out.printf("%s平均氣溫:%.2f\n", days[c], avg);
        }

        System.out.println("各時段平均氣溫:");
        for(int r = 0; r< temp.length; r++){
            System.out.print(periods[r]+":");
            double sum = 0;
            for(int c = 0; c < temp[r].length; c++){
                sum += temp[r][c];
            }
            double avg = sum / temp[r].length;
            System.out.printf("%.2f\n", avg);
        }

        System.out.println("溫度最高/最低的日子和時段:");
        int maxC = 0, minC = 0, maxR = 0, minR = 0;
        //最大值 temp[maxR][maxC];
        //最小值 temp[minR][minC];
        for(int r = 0; r < temp.length; r++){
            for(int c = 0; c < temp[r].length; c++){
                if( temp[r][c] > temp [maxR][maxC] ){
                    //temp[maxR][maxC] = temp[r][c];
                    maxC = c;
                    maxR = r;
                }
                if(temp[r][c] < temp[minR][minC]){
                    //temp[minR][minC] = temp[r][c];
                    minC = c;
                    minR = r;
                }
            }
        }
        System.out.println("\n最高溫:"+temp[maxR][maxC]+"在"+days[maxC]+periods[maxR]);
        System.out.println("\n最低溫:"+temp[minR][minC]+"在"+days[minC]+periods[minR]);
    }
}

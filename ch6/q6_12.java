/*
Quesiton 12
(1) total amount of saling of each salesman ?
(2) total sum of each of product(A/B/C/D/E)?
(3) find the best salsman gaining the most amount?
(4)find the product type gaing the most amout?

 */
public class q6_12 {
    public static void main(String[] args) {
        
        int sales[][] = {
            {33, 32, 56, 45, 33}, //銷售員1業績 
            {77, 33, 68, 45, 23}, //銷售員2業績 
            {43, 55, 43, 67, 65}  //銷售員3業績 
        };  
        String[] person = {"銷售員1", "銷售員2", "銷售員3"};
        int[] price = {12, 16, 10, 14, 15};

        System.out.println("三位銷售員的各產品銷售量如下:");
            for(int r = 0; r < sales.length; r++){
                System.out.println("銷售員" + person[r]);
                for (int c = 0; c < sales[r].length; c++){
                    System.out.print(sales[r][c] + " ");
                }
                System.out.println();
            }
        System.out.println("========================");
        //int[] price = {12, 16, 10, 14, 15};
        //String[] person = {"銷售員1", "銷售員2", "銷售員3"};

        //印出每一個銷售員的銷售總金額
        int salesmanTotal[] = new int[sales.length];

        for(int r = 0 ;  r < sales.length;r++){
            for(int c = 0; c < sales[r].length; c++){
                salesmanTotal[r] += sales[r][c]* price[c];
            }
            System.out.println(person[r] + "業績:" + salesmanTotal[r]);
        }
        System.out.println("======================");
        //int[] price = {12, 16, 10, 14, 15};
        //String[] person = {"銷售員1", "銷售員2", "銷售員3"};
        
        //印出每項產品的銷售總金額

        char product[] = {'A', 'B', 'C', 'D', 'E'};
        int[] productTotal = new int[price.length];
        for(int c = 0; c < price.length ; c++){
            for(int r = 0; r < sales.length; r++){
                productTotal[c] += price[c]*sales[r][c];
            }
            System.out.println("產品" + product[c] +"總金額:" + productTotal[c]);
        }

        System.out.println("======================");
        //int[] price = {12, 16, 10, 14, 15};
        //String[] person = {"銷售員1", "銷售員2", "銷售員3"};
        
        //找出銷售總金額最多的銷售員
        
        int bestSalesmanIndex = 0;//預設索引0(第一個銷售員)的銷售金額最高
        
        for(int i = 0; i < salesmanTotal.length ; i++){

            if(salesmanTotal[i] > salesmanTotal[bestSalesmanIndex]);
            bestSalesmanIndex = i;
        }
        
        System.out.println("最佳銷售員是:銷售員"+ person[bestSalesmanIndex]);

        System.out.println("======================");
        //int[] price = {12, 16, 10, 14, 15};
        //String[] person = {"銷售員1", "銷售員2", "銷售員3"};
        
        
        //找出銷售總金額最多的產品
        int bestProductIndex = 0;
        for(int i = 0; i < productTotal.length ; i++){
            if(productTotal[i] > productTotal[bestProductIndex]){
                bestProductIndex = i;
            }
        }
        System.out.println("最佳銷售產品是:產品"+ product[bestProductIndex]);

        System.out.println("======================");
        //int[] price = {12, 16, 10, 14, 15};
        //char product[] = {'A', 'B', 'C', 'D', 'E'};
        
        //找出銷售總金額最少的產品

        int worstProductIndex = 0;
        for(int j = 0; j < productTotal.length; j++){
            if (productTotal[j] < productTotal[worstProductIndex]){
                worstProductIndex = j;
            }
        }
        System.out.println("銷售最差的是:產品" + product[worstProductIndex]);
        System.out.println("金額是:" + productTotal[worstProductIndex]);

        System.out.println("======================");
        //int[] price = {12, 16, 10, 14, 15};
        //String[] person = {"銷售員1", "銷售員2", "銷售員3"};
        
        //找出銷售總金額最差的銷售員

        int worstSalesmanIndex = 0;
        for(int j = 0; j < salesmanTotal.length; j++){
            if(salesmanTotal[j] <salesmanTotal[worstSalesmanIndex]){
                worstSalesmanIndex = j;
            }
        }
        System.out.println("銷售最差的人是:" + person[worstSalesmanIndex]);
        System.out.println("其銷售總金額是:" + salesmanTotal[worstSalesmanIndex]);

    }
}

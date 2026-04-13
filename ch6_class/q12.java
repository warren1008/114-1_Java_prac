public class q12 {
    public static void main(String[] args){
        int sales[][] = {
            {33,32,56,45,33},
            {77,33,68,45,23},
            {43,55,43,67,65}
        };

        System.out.println("====第0小題====");
        System.out.println("====銷售產品和銷售員業績總攬表====");       
        
        char[] product = {'A','B','C','D','E'};
        String salesman[] = {"銷售員1","銷售員2","銷售員3"};

        int[] price ={12,16,10,14,15};
        System.out.println("====產品價目表====");
    
        for(int i = 0; i < product.length; i++){
            System.out.print("產品" + product[i] + "售價: ");
            System.out.println(price[i]);
        }

        System.out.println();
        
        //列印銷售表
        System.out.println("====銷售員業績表====");
        
        System.out.print("\t");
        
        //先列印產品
        for(int i = 0; i < product.length;i++){
            System.out.print("產品" + product[i] + "\t");
        }
        System.out.println();

        //其次分列 依序列印銷售員 和其各產品的銷售量

        for(int r = 0; r < sales.length; r++){
            System.out.print(salesman[r] + "\t");

            for(int c = 0; c < sales[r].length; c++){
                System.out.print(sales[r][c] + "\t");                
            }
            System.out.println();
        }

        System.out.println("====第一小題====");//列印每一位銷售員的銷售總金額
        System.out.println("===各個銷售員的銷售總金額===");
        
        int[] salesmanTotal = new int[salesman.length];

        for(int r = 0;r < sales.length;r++){
    
            int sum = 0;
        
            for(int c = 0; c < sales[r].length;c++){
                sum += price[c]*sales[r][c];
            }
            salesmanTotal[r] = sum;
        } 
        //列印計算結果
        for(int i = 0; i < salesman.length; i++){
            System.out.print(salesman[i]+ "\t");
        }
        System.out.println();

        for(int j = 0; j <salesmanTotal.length; j++){
            System.out.print(salesmanTotal[j]+"\t");
        }
        System.out.println();

        System.out.println("====第二小題====");//列印每一項產品的銷售總金額
        
        //宣告存放產品總金額的陣列
        
        System.out.println("===各項產品的銷售總金額===");
        
        int productTotal[] = new int[product.length];

        for(int c = 0;c < sales[0].length;c++){
        
            int sum = 0;
            
            for(int r = 0; r < sales.length;r++){
                sum += price[c]*sales[r][c];

            }
            productTotal[c] = sum;
        } 
        //列印產品銷售總金額計算結果

        for(int i = 0; i <product.length; i++){
            System.out.print(product[i] + "\t");
        }
        System.out.println();
        for(int j = 0;j <productTotal.length;j++){
            System.out.print(productTotal[j] + "\t");
        }
        
        System.out.println();

        System.out.println("====第三小題====");//找出銷售總金額最多的銷售員

        int maxP = 0;
        for(int i = 0; i <salesmanTotal.length;i++){
            if(salesmanTotal[i] > salesmanTotal[maxP]){
                maxP = i;
            }
        }

        System.out.println("銷售金額最多的銷售員為:" + salesman[maxP]);
        System.out.println("其銷售金額為 : " + salesmanTotal[maxP]);

        System.out.println("====第四小題====");//銷售額最高的產品
        //延續第三小題
        
        int maxPo = 0;
        for(int i = 0; i <productTotal.length;i++){
            if(productTotal[i] > productTotal[maxPo]){
                maxPo = i;
            }
        }

        System.out.println("銷售金額最多的產品為:" + product[maxPo]);
        System.out.println("其銷售金額為 : " + productTotal[maxPo]);
    }
}

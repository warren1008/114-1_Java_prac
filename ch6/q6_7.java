//反向排列
//最經典的做法是「頭尾對調（Swap）」。
// 我們只需要執行陣列長度一半的次數，利用一個暫存變數（temp）來交換資料。
public class q6_7 {
    public static void main(String[] args) {
        int arr[] ={12, 15, 8, 43};
        System.out.println("陣列arr反轉前，其元素有:");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("arr[" + i + "] =" + arr[i] + " ");
        }
        for(int i = 0; i < arr.length / 2; i++){
            int oppsiteIndex = arr.length - 1 - i; 
            // index symmetry;arr.length = 4;maxIndex =3;(0,3)(1,2)

            int temp = arr[i];
            arr[i] = arr[oppsiteIndex];
            arr[oppsiteIndex] = temp;
        }
        
        System.out.println("反向陣列後的排列:");
        for(int num : arr)
            System.out.println(num + " ");
    }
}

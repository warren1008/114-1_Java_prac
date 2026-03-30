/*===反轉陣列:雙指標對調===reverse array : two-point swap===

i.找出對稱的「尾部索引 (Mirror Index)」
    最大索引: arr.length - 1
    對稱: 索引為i時, 其對稱為 arrlength - 1 -i

ii.計算執行次數(以arr[5]為例)：
    在我們的迴圈條件 i < arr.length / 2 中，
    5 / 2 在 Java 裡會執行整數除法，無條件捨去小數點，所以結果是 2。
    這意味著迴圈只會執行 i = 0 與 i = 1 這兩圈。

iii. 三部交換法
    把「裝可樂的杯子 A」和「裝雪碧的杯子 B」內容物對調，你必須拿一個「空杯子」來當暫存區。
i.e.
    oppsiteIndex = arr.length - 1 - i
    int temp = arr[i];
    arr[i] = arr[oppsiteIndex];
    arr[oppsiteIndex] = temp;
*/

//奇數元素個數反轉陣列
public class q6_7v2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        
        System.out.println("反轉陣列arr前，元素有:");
        
        for(int i = 0; i<arr.length;i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
        
        for(int i = 0; i < arr.length / 2; i++){
            int oppsiteIndex = arr.length - 1 - i;
            
            int temp = arr[i];
            arr[i] = arr[oppsiteIndex];
            arr[oppsiteIndex] = temp;
        }
        
        System.out.println("反轉陣列arr後，元素有:");
        
        for(int i = 0; i < arr.length ; i++){
            System.out.printf("arr[%d] = %d\n", i, arr[i]);
        }
    }
}

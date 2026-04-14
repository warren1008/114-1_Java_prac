
public class q29 {
    public static void main(String[] args) {

        System.out.printf("整數結果為: %.2f\n", triangle(2,3));

        System.out.printf("浮點數結果為: %.2f\n", triangle(2.0f,3.0f));
    }
    public static float triangle(int base, int height) {
        return (float)(base*height)/ 2;
    }
    public static float triangle(float base, float height) {
        return (base*height)/ 2;
    }
}

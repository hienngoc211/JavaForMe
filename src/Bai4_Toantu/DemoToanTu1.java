package Bai4_Toantu;

public class DemoToanTu1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(a + b); // 30
        System.out.println(a % 2); // 0
        System.out.println(a += b); // 30
        System.out.println("Gia tri cua a: " + a);
        System.out.println(a < 5 && b > 10 && a == c); // false && true && true => false
        System.out.println(a < 5 || b > 10 || a == c); // false || true || true => true
    }
}

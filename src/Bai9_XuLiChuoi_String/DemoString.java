package Bai9_XuLiChuoi_String;

public class DemoString {
    public static void main(String[] args) {
        String name = "Hien Lee";

        System.out.println("Hien Le".toUpperCase());
        String str1 = "Hien Le".replace(" ", "-");
        System.out.println(str1);

        // Nối chuỗi
        String fullName = "Ho va ten: " + name;
        System.out.println(fullName);
    }
}

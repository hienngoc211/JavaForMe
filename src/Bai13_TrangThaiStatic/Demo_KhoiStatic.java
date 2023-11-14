package Bai13_TrangThaiStatic;

public class Demo_KhoiStatic {
    public String name;
    public int age;
    public static String className = "Dai hoc Bach Khoa Da Nang";

    public static void main(String[] args) {
        System.out.println(className);
    }
    // Sẽ chạy trước hàm main
    static {
        System.out.println("Đây là khối static");
    }


}

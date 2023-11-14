package Bai13_TrangThaiStatic;

public class Demo_HamStatic {
    public String name;
    public int age;
    public static String className = "Dai hoc Bach Khoa Da Nang";

    public String getName() {
        return name;

    }

    public static void main(String[] args) {
        System.out.println(className);
        Demo_HamStatic demoHamStatic = new Demo_HamStatic(); // Thông qua đối tượng lớp nếu hàm ko có phương thức Static
        System.out.println(demoHamStatic.name);
        System.out.println(Demo_BienStatic.className); // Goị hàm từ một Class khác thì phải gọi tên Class đó và chấm gọi hàm
    }
}

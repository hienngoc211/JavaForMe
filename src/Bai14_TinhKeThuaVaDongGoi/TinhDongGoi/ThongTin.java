package Bai14_TinhKeThuaVaDongGoi.TinhDongGoi;

public class ThongTin {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Susan");
        student1.setAge(25);
        student1.setPhone("5678");

        // Gán giá trị thông qua hàm Set
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getPhone());
    }
}

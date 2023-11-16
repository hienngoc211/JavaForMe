package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Student extends Person {
    private String phone;
    private String address;

    public Student(String name, int age, float height, String phone, String address) {
        super(name, age, height); // không thay đổi để đảm bảo đúng cấu trúc của Class cha
        this.phone = phone;
        this.address = address;
    }

    public void getInfo(){
        super.getInfo(); // Hàm này sẽ hiểu lấy từ class Cha
    }

    public String getPhone() {
        getInfo(); // Hàm này sẽ hiểu lấy từ Class con
        return phone;
    }

    public String getAddress() {
        return address;

    }

    public static void main(String[] args) {
        Student student = new Student("Lisa", 30, 160, "0945678789", "Da Nang");
        student.getInfo();
        System.out.println(student.getPhone());
        System.out.println(student.getAddress());
        System.out.println(student.getHeight());

    }
}

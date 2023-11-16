package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Teacher extends Person {

    private double luong;

    public Teacher(String name, int age, float height, double luong) {
        super(name, age, height);
        this.luong = luong;
    }

    public void getInfo(){
        System.out.println("Luong: " + luong);
    }


    public static void main(String[] args) {
        Teacher teacher = new Teacher("Duyen", 30, 158, 30000000);
        teacher.getInfo(); // ghi đè, lấy của class con, không lấy hàm getInfo của class cha nữa
//        System.out.println("Luong: " + teacher.luong);
    }
}


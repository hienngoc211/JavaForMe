package Bai14_TinhKeThuaVaDongGoi.TinhKeThua;

public class Student extends Person{

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

    public static void main(String[] args) {
        Student student = new Student("Lisa", 30, 160);
        student.getInfo();
    }
}

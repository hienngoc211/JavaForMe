package Bai11_Class_Object;

public class Student {
    String name = "Obama";
    int age = 40;
    String address = "DN";
    String phone = "0899000";

    public void displayInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);

    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {

    }
}

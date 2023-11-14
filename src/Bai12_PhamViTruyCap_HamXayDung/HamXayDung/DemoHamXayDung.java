package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDung {

    // Khai báo giá trị
    public String name;
    public int age;

    // Khai báo hàm xây dựng
    public DemoHamXayDung() {
        System.out.println("I'm constructor");
        // Khởi tạo gía trị
        name = "Tôi đi code dạo";
        age = 30;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        DemoHamXayDung demoHamXayDung = new DemoHamXayDung();
        demoHamXayDung.showInfo();
    }
}

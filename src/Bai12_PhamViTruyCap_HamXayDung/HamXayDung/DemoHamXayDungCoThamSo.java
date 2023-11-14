package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

public class DemoHamXayDungCoThamSo {

    // Khai báo giá trị
    public String name;
    public int age;
    public String address;

    // Hầu như luôn có
    public DemoHamXayDungCoThamSo() {
        System.out.println("I'm constructor with 0 param");
        // Khởi tạo gía trị
//        this.name = name;
//        this.age = age;
    }


    // Khai báo hàm xây dựng
    public DemoHamXayDungCoThamSo(String name, int age) {
        System.out.println("I'm constructor with 2 param");
        // Khởi tạo gía trị
        this.name = name;
        this.age = age;
    }

    public DemoHamXayDungCoThamSo(String name, int age, String address) {
        System.out.println("I'm constructor with 3 param");
        // Khởi tạo gía trị
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        DemoHamXayDungCoThamSo demoHamXayDung1 = new DemoHamXayDungCoThamSo("Jessica", 30);
        demoHamXayDung1.showInfo();

        DemoHamXayDungCoThamSo demoHamXayDung2 = new DemoHamXayDungCoThamSo("Chloe", 23);
        demoHamXayDung2.showInfo();

        DemoHamXayDungCoThamSo demoHamXayDung3 = new DemoHamXayDungCoThamSo("Vincent", 30, "Da Nang");
        demoHamXayDung3.showInfo();

        DemoHamXayDungCoThamSo demoHamXayDung4 = new DemoHamXayDungCoThamSo();
        demoHamXayDung4.showInfo();
    }
}

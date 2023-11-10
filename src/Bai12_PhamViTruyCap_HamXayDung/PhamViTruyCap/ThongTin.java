package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;


import Bai12_PhamViTruyCap_HamXayDung.HamXayDung.Student01;

public class ThongTin extends Student01 {
    public static void main(String[] args) {
        DemoPrivate demoPrivate = new DemoPrivate();
        System.out.println(demoPrivate.getName());

//        Student student = new Student();
        DemoDefault demoDefault = new DemoDefault();
        System.out.println(demoDefault.age);

        DemoProtected demoProtected = new DemoProtected();
        System.out.println(demoProtected.getAddress());

        ThongTin thongTin = new ThongTin();
        thongTin.getPhone(); // Gọi được phạm vi protected khác package khi kế thừa
//    Nếu bỏ extend ra thì sẽ lỗi, không gọi được hàm getPhone

        Student01 student01 = new Student01();
        student01.getAge();
    }



}

package Bai13_TrangThaiStatic;

public class ThongTin {

    public void getInfo(){
        System.out.println(Demo_BienStatic.className);
        Demo_BienStatic bienStatic1 = new Demo_BienStatic();
        System.out.println(bienStatic1.className);

        Demo_BienStatic bienStatic2 = new Demo_BienStatic();
        System.out.println(bienStatic2.className);

    }
    public static void main(String[] args) {
        System.out.println(Demo_BienStatic.className);
        ThongTin thongtin1 = new ThongTin();
        thongtin1.getInfo();

    }
}

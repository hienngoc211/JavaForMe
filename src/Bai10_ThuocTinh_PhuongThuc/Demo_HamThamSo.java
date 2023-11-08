package Bai10_ThuocTinh_PhuongThuc;

public class Demo_HamThamSo {
    /* Khai báo hàm có 2 tham số với kiểu dữ liệu tương ứng */
    public static int tongHaiSoNguyen(int number1, int number2) {
        return number1 + number2;
    }

    public static void showInfo(String name, String add, int age) {
        System.out.println("Họ và ten: " + name);
        System.out.println("Dia chi: " + add);
        System.out.println("Tuoi: " + age);
    }

    public static float tinhDienTich(float chieuDai, float chieuRong){
        return chieuDai * chieuRong;
    }
    public static void main(String[] args) {
        System.out.println("Tổng 2 số nguyên: " + tongHaiSoNguyen(5, 10));
        showInfo("Hien", "Da Nang", 10);
        showInfo("Anna", "Sai Gon", 23);
        showInfo("Daisy","Ha Noi", 10);
        System.out.println("Dien tich: " + tinhDienTich(12.1F,20));
    }
}

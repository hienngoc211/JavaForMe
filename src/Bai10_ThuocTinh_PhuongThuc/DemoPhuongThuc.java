package Bai10_ThuocTinh_PhuongThuc;

import java.util.ArrayList;

public class DemoPhuongThuc {

    public void kiemTraSoChan() {
        int number = 20;
        if (number % 2 == 0) {
            System.out.println("Là số chẵn");
        } else {
            System.out.println("Là số lẻ");
        }
    }

    public ArrayList<Integer> timSoChan(int number){
    ArrayList<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= number; i++){
        if (i % 2 == 0) {
            arrayList.add(i);
        }
        }
    return arrayList; // trả về giá trị arrayList chứa những số chẵn
    }

    /* Khai báo hàm không trả về */
    public void displayInfo() {
        System.out.println("Hello everybody");
        System.out.println("Địa chỉ của mình là: " + getAddress());
    }

    /* Khai baó hàm trả về có giá trị là String */
    public String getAddress() {
        return "Da Nang";
    }

    public static String getName() {
        return "Hien";
    }

    public static float chieuDai(){
        return 13.5F;
    }

    public static int chieuRong(){
        return 10;
    }

    public static float tinhDienTich(){
        return chieuDai() * chieuRong();
    }

    public static void showInfo(){

        System.out.println("Tinh dien tich hinh chu nhat");
    }

    public static void main(String[] args) {
        /* Cách gọi lại để sử dụng Phương thức */
        DemoPhuongThuc demo = new DemoPhuongThuc();
        demo.displayInfo(); // Vì hàm này không có từ khoá Static, nên thông qua đối tượng Lớp (Class)
        System.out.println(getName()); //hàm này có từ khoá Static
        System.out.println(tinhDienTich());
        demo.kiemTraSoChan();
        demo.timSoChan(50);
        /* In ra giá trị số chẵn từ ArrayList trong hàm tìm số chẵn*/
        for (int soChan: demo.timSoChan(50)){
            System.out.print(soChan + ", ");
        }
    }

}

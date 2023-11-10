package Bai11_Class_Object;

public class ThongTin {
    float vat = 10;
    double hocphi = 1500000;


    public double getVAT(){
        return vat;
    }

    public double getHocphi(){
        return hocphi;
    }

    public static void main(String[] args) {
        Student sv1 = new Student();// Khai báo đầy đủ
        sv1.displayInfo();

        // Khai báo Anonymous
        new Student().displayInfo();
        new Student(); /* Khởi tạo giá trị cho Class Student (nếu có hàm xây dựng) */

        ThongTin tt1 = new ThongTin();
        tt1.getVAT();

        ThongTin tt2 = new ThongTin();
        tt2.getHocphi();
    }

}

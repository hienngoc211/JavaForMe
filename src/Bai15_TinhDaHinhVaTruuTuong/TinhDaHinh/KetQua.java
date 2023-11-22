package Bai15_TinhDaHinhVaTruuTuong.TinhDaHinh;

public class KetQua {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.tinhTong(5,10));
        System.out.println(calculator.tinhTong(5 ,10, 15));
        System.out.println(calculator.phepNhan(4, 6));
        System.out.println(calculator.phepNhan(2.5, 3));
    }
}

package Bai4_Toantu;

public class EpKieuDuLieu {
    public static void main(String[] args) {

        // ép kiểu dữ liệu
        float c = 35.8f;
        int b = (int)c + 1; // thu hẹp
        long L = b; // biến L được phép lưu biến b vì nó rộng hơn b

        System.out.println(c);
        System.out.println((int)c);
        System.out.println(b);

        // Chuyển kiểu số thành chuỗi
        String numberString = String.valueOf(b);
        System.out.println(numberString + 40);

        // Chuyển kiểu chuỗi thành số
        System.out.println(Integer.parseInt(numberString) + 40);
        System.out.println(Float.parseFloat(numberString) + 40);
    }
}

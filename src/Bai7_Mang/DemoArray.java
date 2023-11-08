package Bai7_Mang;

public class DemoArray {
    public static void main(String[] args) {
        // Khai bao va khoi tao mang
        String svArray[] = new String[3];

        // Gan gia tri cho Mang Sv
        svArray[0] = "Linh";
        svArray[1] = "Truong";
        svArray[2] = "Hoa";
//        svArray[3] = "Ly"; // Vuot nguong do dai quy dinh
        // Truy xuat gia tri thu cong thong qua index
        System.out.println(svArray[0]);

        // Duyet mang de truy xuat gia tri dong loat
        for (int i = 0; i < svArray.length; i++) {
            System.out.println(svArray[i]);
        }

        System.out.println("=========COPY VALUE SANG MANG KHAC===================");

        String sinhvienArray[] = new String[5];
//        Copy gia tri tu mang svArray to sinhvien Array
        for (int i = 0; i < svArray.length; i++) {
            // Gan value of position Array1 to Array2
            sinhvienArray[i] = svArray[i];
        }

        for (int i = 0; i < sinhvienArray.length; i++){
            System.out.println(sinhvienArray[i]);
        }

    }
}

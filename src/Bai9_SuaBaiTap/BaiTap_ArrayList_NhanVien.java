package Bai9_SuaBaiTap;

import java.util.ArrayList;

public class BaiTap_ArrayList_NhanVien {
    public static void main(String[] args) {
        ArrayList<Object> nhanvien = new ArrayList<>();
        nhanvien.add("Briney");
        nhanvien.add("30 years old");
        nhanvien.add("Da Nang");
        for (Object i : nhanvien){
            System.out.println(i);
        }
    }
}

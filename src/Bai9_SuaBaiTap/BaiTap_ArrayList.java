package Bai9_SuaBaiTap;

import java.util.ArrayList;
import java.util.List;

public class BaiTap_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                number.add(i); // Không cần khởi tạo biến trung gian, có hàm Add => add giá trị số chẵn vào arrayList
            }
        }
        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }

    }
}





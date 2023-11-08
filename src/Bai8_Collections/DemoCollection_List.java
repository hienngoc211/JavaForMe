package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;

public class DemoCollection_List {
    public static void main(String[] args) {
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(12);
        listNumber.add(52);
        listNumber.add(14);
        listNumber.add(42);
        listNumber.add(42);

        listNumber.remove(1);
        System.out.println("========Truy xuat vi tri khong thong qua index=========");
        for (int value : listNumber) {
            System.out.println(value);
        }
        System.out.println("===========Truy xuat thong qua index==========");
        System.out.println(listNumber.get(2));
    }
}

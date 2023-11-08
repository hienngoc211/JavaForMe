package Bai8_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoCollection_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Cach khai bao thu 2 - lay trực tiếp của thằng con để khai báo
        // ArrayList, Vector, LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("PHP");
        arrayList.add("Java");
        arrayList.add("C#");
        arrayList.add("Python");

        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.indexOf(15));
        System.out.println(arrayList.contains(42));

        // Object là tự khoá đại diện cho tất cả kiểu dữ liệu
        // Phu thuoc phien ban JDK
        var arrayList2 = new ArrayList<>();
        arrayList2.add("Diana");
        arrayList2.add(13.6);

        for (Object value: arrayList2) {
            System.out.println(value);
        }

        ArrayList<Object> arrayList3 = new ArrayList<>();
        arrayList3.add(1003);
        arrayList3.add("Ronaldo");
        arrayList3.add(15.5);
         for (Object value1: arrayList3){
             System.out.println(value1);
         }

    }
}

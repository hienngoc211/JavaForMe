package Bai8_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoCollection_Set {
    public static void main(String[] args) {

        // Khai bao kieu Set voi HashSet
        // Khong co sap xep duoc
        System.out.println("=======HASHSET==========");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Aloha");
        stringSet.add("Linda");
        stringSet.add("Aloha");// hieu gia tri bi trung sau cung

        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("Linda"));
        for (String value : stringSet) {
            System.out.println(value);
        }

        System.out.println("===========TREESET===========");
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("123");
        treeSet.add("2345");
        treeSet.add("ABCDHI");
        treeSet.add("12");
//        treeSet.stream().sorted();

        for (String value : treeSet) {
            System.out.println(value);
        }
    }
}

package Bai9_SuaBaiTap;

public class BaiTap_Array {
    public static void main(String[] args) {
        int index = 0;
        int array[] = new int[26]; // Bị giới hạn số lượng phần tử
        // Gán giá trị thông qua vòng lặp for
        for (int i = 0; i <= 50; i++) {

            // i chính là số chẵn cần add vào
            // index là vị trí trung gian để gán giá trị i vào cho theo thứ tự
            if (i % 2 == 0) {
                array[index] = i; // add gia tri vao mang
                index++;
            }
        }
        // In giá trị trong mảng sau khi đã add vào
        for (int i = 0; i <= 50; i++) {
            System.out.println(array[i]);
        }
    }
}

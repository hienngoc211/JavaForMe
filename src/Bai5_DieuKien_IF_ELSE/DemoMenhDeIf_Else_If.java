package Bai5_DieuKien_IF_ELSE;

public class DemoMenhDeIf_Else_If {
    public static void main(String[] args) {
        int mark = 75;

        if(mark < 50){
            System.out.println("Out");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("Xep loai D");
        } else if (mark >=70 && mark < 80) {
            System.out.println("Xep loai C");
        } else if (mark >=80 && mark < 90) {
            System.out.println("Xep loai B");
        } else if (mark >= 90 && mark < 100) {
            System.out.println("Xep loai A");
        } else {
            System.out.println("Khong ton tai");
        }

    }
}

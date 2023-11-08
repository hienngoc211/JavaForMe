package Bai5_DieuKien_IF_ELSE;

public class DemoMenhDeIf_Else {
    public static void main(String[] args) {
        String address = "Da Nang";
        String phone = "123456";
        boolean checkLogin = false;

        if (address.equals("Sai Gon")) {
            System.out.println("Dia chi la Da Nang");
        } else {
            System.out.println("Dia chi la cac tinh khac");
        }

        if (checkLogin) {
            System.out.println("Login success");
        } else {
            System.out.println("Login unsuccess");
        }
    }
}

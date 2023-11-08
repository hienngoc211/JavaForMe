package Bai7_Mang;

public class DemoArray2 {
    public static void main(String[] args) {
        int number[] = new int[10];

        // Gan gia tri thong qua vong lap for
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
        }
        number[3] = 6000;
        number[7] = 5000;

        // Duyet mang bang vong lap for cai tien
        for (int temp : number) {
            System.out.println(temp);
        }

        String emailList[] = new String[4];
        emailList[0] = "hien.drkumo@gmail.com";
        emailList[1] = "hien.drkumo@hotmail.com";
        System.out.println(emailList[0]);

        // Khai bao va gan gia tri truc tiep (nac danh)
        String emailData[] = {"admin@example.com", "abc@gmail.com", "hienle@yahoo.com"};
        for (int i = 0; i < emailData.length; i++) {
            System.out.println(emailData[i]);
        }
    }
}



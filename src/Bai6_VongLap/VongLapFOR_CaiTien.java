package Bai6_VongLap;

public class VongLapFOR_CaiTien {
    public static void main(String[] args) {
        int number[] = {5, 7, 20, 10, 9};
        String name[] = {"Hoa", "Linh", "Truong", "Trang"};
        for (int i: number){
            if (i==20){
                System.out.println("Co so 20");
            } else {
                System.out.println("Khong co so 20");
            }
        }
        for (String ten: name){
            if (ten.equals("Linh")){
                System.out.println("Linh co mat");
            }
        }
    }
}

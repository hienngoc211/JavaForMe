public class Student {

    public static int a = 20;
    public String ten = "Hien";
    public void sayHello(){
        int n = 10;
        n = n + tinhLaiSuat();
        System.out.println("Gia tri cua n la:" + n);
    }

    public static int tinhLaiSuat(){
        int laiSuat = 10000;
        return laiSuat;
    }
    public static void main(String[] args) {
        String name = "Le Ngoc Hien";
        int number;
        System.out.println(name);
        System.out.println(a);

    }
}

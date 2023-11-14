package Bai13_TrangThaiStatic;

public class Demo_BienStatic {
    public String name;
    public int age;
    public static String className = "Dai hoc Bach Khoa Hà Nội";

    public String getclassName() {
        return className;
    }


    public static void main(String[] args) {
        Demo_BienStatic demoBienStatic = new Demo_BienStatic();
        System.out.println(demoBienStatic.getclassName());
    }
}

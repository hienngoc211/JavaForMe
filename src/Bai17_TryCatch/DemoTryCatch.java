package Bai17_TryCatch;

public class DemoTryCatch {

    public void setTimeOut (String timeOut){
        System.out.println("Set time out: " + Integer.parseInt(timeOut));
        System.out.println("Đã set xong!");
    }

    public static void main(String[] args) {
        DemoTryCatch demoTryCatch = new DemoTryCatch();
        demoTryCatch.setTimeOut("10");
    }
}

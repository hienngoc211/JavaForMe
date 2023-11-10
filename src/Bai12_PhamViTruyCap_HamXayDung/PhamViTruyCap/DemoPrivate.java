package Bai12_PhamViTruyCap_HamXayDung.PhamViTruyCap;

public class DemoPrivate {
    private String name = "Quinn";
    private int VAT = 10;
    private int tongTien = 100000;

    private void showInfo(){
        System.out.println("Hello gud morning");
    }

    public String getName(){
        return name;
    }

    public int tinhLaiSuat(){
        return ((tongTien * VAT)/100) * 6;
    }
}



package Bai13_TrangThaiStatic;

import Constant.ConfigData;

public class SetupBrowser {
    public static void main(String[] args) {
        System.out.println("Chạy với browser: " + ConfigData.BROWSERNAME);
        ConfigData.clickOnElement();
    }
}

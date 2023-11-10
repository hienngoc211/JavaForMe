package Bai12_PhamViTruyCap_HamXayDung.HamXayDung;

     public class Student01 {

         // không khai báo từ khoá phạm vi truy cập nào thì ngầm hiểu từ khoá là default
        int age = 30;
        String phone = "0906789567";

        protected String getPhone()
        {
            return phone;
        }

        public int getAge(){
            return age;
        }

}

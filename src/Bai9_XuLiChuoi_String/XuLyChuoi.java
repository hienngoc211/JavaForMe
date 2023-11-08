package Bai9_XuLiChuoi_String;

public class XuLyChuoi {
    public static void main(String[] args) {

        //Chuỗi sẽ tính từ vị trí kí tự và bắt đầu từ 0
        String str1 = "Anh Tester chia sẻ kiến thức Tester, khóa học Testing miễn phí về Automation Testing";
        String str2 = "Va Manual Testing";

        //Cắt chuỗi

        System.out.println("Cat chuoi dang 1: " + str1.substring(10));
        System.out.println("Cat chuoi dang 2: " + str1.substring(11, 35));

        // Ghép chuỗi

        System.out.println("Ghep chuoi: " + str1 + " " + str2);
        System.out.println("Ghep chuoi: " + str1.concat(str2));
        System.out.println("Ghep chuoi: " + str1.concat(" ") + str2);

        // Tách chuỗi
        System.out.println("Tach chuoi: " + str1.split(",")[0]); // Lấy giá trị đầu tiên sau khi tách chuỗi
        System.out.println("Tach chuoi: " + str1.split(",")[1]); // Lấy giá trị thứ 2 sau khi tách chuỗi

        // Loại bỏ khoảng trắng 2 đầu
        System.out.println("Tach chuoi: " + str1.split(",")[1].trim());

        String str3 = "API Testing With Postman";
        String str4 = "API Testing With Postman Tool";
        String str5 = "api testing with postman";
        System.out.println("SO SÁNH CHỨA: " + str3.contains("Postman"));
        System.out.println("SO SÁNH CHỨA: " + str3.contains("Selenium"));
        System.out.println("SO SÁNH CHỨA: " + str3.contains("Testing"));


        System.out.println("SO SÁNH BẰNG: " + str3.equals(str4));
        System.out.println("SO SÁNH BẰNG: " + str3.equals("API Testing With Postman"));
        System.out.println("SO SÁNH BẰNG: " + str3.equals(str5));
        System.out.println("SO SÁNH BẰNG: " + str3.equalsIgnoreCase(str5));


        /*Kiểm tra giá trị bắt đầu kết thúc của một chuỗi */
        System.out.println("BẮT ĐẦU: " + str3.startsWith("API"));
        System.out.println(("KẾT THÚC: " + str3.endsWith("Postman")));

        String name = " ";
        System.out.println("KHÔNG XEM SPACE LÀ CHUỖI RỖNG: " + name.isEmpty());
        System.out.println("XEM SPACE LÀ CHUÕI RỖNG: " + name.isBlank());
    }
}

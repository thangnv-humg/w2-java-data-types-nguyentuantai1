
public class Main {
    public static void main(String[] args) {
        // TODO: Khai báo biến và viết chương trình theo yêu cầu trong README.md
        // Ví dụ:
        // int myInt = 42;
        // double myDouble = 3.14;
        // String myString = "Hello, Java!";
        // System.out.println(myInt);
        // System.out.println(myDouble);
        // System.out.println(myString);
        int intValue = 42;
        double doubleValue = 3.14;
        String stringValue = "Hello, Java!";

        // In giá trị các biến ra màn hình
        System.out.println("intValue: " + intValue);
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("stringValue: " + stringValue);

        // Kiểm tra giá trị của biến intValue
        if (intValue > 10) {
            System.out.println("Greater than 10");
        } else {
            System.out.println("Less or equal to 10");
        }
    }
}
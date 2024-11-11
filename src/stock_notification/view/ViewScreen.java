package stock_notification.view;

import java.util.Scanner;

public class ViewScreen {

    private static Scanner scanner = new Scanner(System.in);
    public int show() {
        String sms = """
                Welcome to amazon website,enter your choice
                1. add subscriber
                2. remove subscriber
                3. setting Data
                4. notifying to customers
                5.exit
                """;

        System.out.println(sms);

            int n = scanner.nextInt();

        return n;
    }

    public String takeUser() {
        System.out.println("enter customer name");
        String str = scanner.next();

        return str;
    }

    public void showOutput(String strOut) {
        System.out.println(strOut);
    }

    public int takeQuantity() {
        System.out.println("enter the quantity you want to add");
        int num = scanner.nextInt();
        return  num;
    }
}

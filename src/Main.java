import stock_notification.viewmodel.StockManagmentSystem;

public class Main {
    public static void main(String[] args) {
      StockManagmentSystem stockManagmentSystem =  StockManagmentSystem.getInstance();
      stockManagmentSystem.start();
    }
}
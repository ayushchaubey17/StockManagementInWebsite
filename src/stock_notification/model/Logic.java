package stock_notification.model;

import stock_notification.view.Customer;
import stock_notification.viewmodel.StockObservable;

public class Logic {
    static  StockObservable stockObservable ;

    public  Logic() {
        this.stockObservable = new StockObservable();
    }

    public void initialize() {

        stockObservable.addCustomer(new Customer("ayush",stockObservable));
        stockObservable.addCustomer(new Customer("piyush",stockObservable));

    }

    public String addCustomer(String str) {
        this.stockObservable.addCustomer(new Customer(str,stockObservable));
        return "customer "+ str+" added successfully";
    }

    public String removeCustomer(String str) {
        this.stockObservable.removeCustomer(new Customer(str, stockObservable));
        return "customer " + str + " removed succcessfully";
    }

    public void notifyUser() {
        stockObservable.notifyCustomer();
    }

    public void notifying(int n) {
        stockObservable.setData(n);
    }
}

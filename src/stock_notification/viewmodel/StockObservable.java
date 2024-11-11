package stock_notification.viewmodel;

import stock_notification.view.Observer;

import java.util.ArrayList;
import java.util.List;

public  class StockObservable implements Subject {
    private List<Observer> customers;
    private int stocksAvailabe;

    public StockObservable() {
        this.customers = new ArrayList<>();
        this.stocksAvailabe = 0;
    }

    @Override
    public void setData(int quantity) {

        int currentStock = this.stocksAvailabe;
        this.stocksAvailabe +=  quantity;
        if (currentStock==0 && quantity>0){

            notifyCustomer();
        }

    }

    @Override
    public void addCustomer(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeCustomer(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyCustomer() {
        for (Observer customer: customers)
            customer.update();
    }

    @Override
    public int getData() {
        return stocksAvailabe;
  
    }
}

package stock_notification.viewmodel;

import stock_notification.view.Observer;

public interface Subject {
    void addCustomer(Observer observer);
    void removeCustomer(Observer observer);
    void notifyCustomer();
    void setData(int quantity);
    int  getData();


}

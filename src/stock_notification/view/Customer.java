package stock_notification.view;

import stock_notification.viewmodel.StockObservable;

public  class Customer implements Observer {
    private StockObservable stockObservable;
  String name;
    public Customer(String name, StockObservable stockObservable){
      this.name = name;
      this.stockObservable = stockObservable;
        
    }
    @Override
    public void update() {
        System.out.println("hello "+this.name +" there are"+this.stockObservable.getData()+" in the stocks");
        
    }
}


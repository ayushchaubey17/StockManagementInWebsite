package stock_notification.viewmodel;


import stock_notification.model.Logic;
import stock_notification.view.ViewScreen;

public class StockManagmentSystem {
    private static StockManagmentSystem stockManagmentSystem= new StockManagmentSystem();


    private static ViewScreen viewScreen = new ViewScreen();
    private static Logic logic = new Logic();

    private StockManagmentSystem(){}


    public static StockManagmentSystem getInstance() {
        return stockManagmentSystem;
    }


    public void start() {
        logic.initialize();
     int n=0;
   while (true){

       System.out.println("hyy");
      n =   viewScreen.show();
       if (n==6){
           System.exit(0);
           break;
       }
       operation(n);
   }

    }

    private void operation(int n) {
        if (n==1){
            addOperation();
        } else if (n==2) {
            removeOperation();

        }
        else if (n==3){
            update();
        }
        else if (n==4)
            notifying();
    }

    private void removeOperation() {
        String str =   viewScreen.takeUser();
        String strOut =  logic.removeCustomer(str);
        viewScreen.showOutput(strOut);
    }


    private void addOperation() {
      String str =   viewScreen.takeUser();
      String strOut =  logic.addCustomer(str);
      viewScreen.showOutput(strOut);

    }

    private void notifying() {
        logic.notifyUser();
    }

    private void update() {
        int n  = viewScreen.takeQuantity();
        logic.notifying(n);
    }


}

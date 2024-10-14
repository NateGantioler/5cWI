package Ticketautomat;

public class UI {
    Controller controller = new Controller();
    Scanner scanner = new Scanner();
    Geldausgabe geldausgabe = new Geldausgabe();

    public void ButtonPressed()
    {
        System.out.println("Pressed the Button:     ");
        controller.CreateTicket();
    }

    public void InsertMoney(double betrag)
    {
       if(betrag >= scanner.getPrice()){
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis());
            geldausgabe.returnChange(scanner.getPrice()-betrag);
       } 
       else{
            System.out.println("Zu zahlen: " + (scanner.getPrice() - betrag));
       }
    }
}

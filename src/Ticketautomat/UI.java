package Ticketautomat;

public class UI {
    Controller controller;
    Scanner scanner;
    Geldausgabe geldausgabe;
    private double moneyInserted;

    public UI (Controller controller, Scanner scanner, Geldausgabe geldausgabe)
    {
        this.controller = controller;
        this.scanner = scanner;
        this.geldausgabe = geldausgabe;
    }

    public void ButtonPressed()
    {
        System.out.println("Pressed the Button:     ");
        controller.CreateTicket();
    }

    public void InsertMoney(double betrag)
    {
        moneyInserted += betrag;
        System.out.println(betrag + "€ eingeschmissen");
        if(moneyInserted >= scanner.getPrice()){
            scanner.getTicket().setPayedTimeStamp(System.currentTimeMillis());
            geldausgabe.returnChange((scanner.getPrice()-moneyInserted)*-1);
        } 
        else{
            System.out.println("Zu zahlen: " + (scanner.getPrice() - moneyInserted));
        }
    }
}

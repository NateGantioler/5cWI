package Ticketautomat;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();
        Controller controller = new Controller(printer);
        Geldausgabe geldausgabe = new Geldausgabe();
        UI ui = new UI(controller, scanner, geldausgabe);
        


        ui.ButtonPressed();
        Ticket testTicket = controller.getTickets().get(0); 
        testTicket.setCreatedTimeStamp(testTicket.getCreatedTimeStamp() - 150000);
        scanner.InsertTicket(testTicket);
        System.out.println(scanner.getPrice() + "Euro");
        ui.InsertMoney(0.50);
        ui.InsertMoney(2.00);

        //scanner.InsertTicket(controller.getTickets().get(0));
    }
}
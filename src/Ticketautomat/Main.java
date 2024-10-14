package Ticketautomat;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner();
        Controller controller = new Controller(printer);
        Geldausgabe geldausgabe = new Geldausgabe();
        UI ui = new UI(controller, scanner, geldausgabe);
        


        ui.ButtonPressed();
        System.out.println(controller.getTickets().getLast());
        //scanner.InsertTicket(controller.getTickets().get(0));
    }
}

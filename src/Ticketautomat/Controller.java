package Ticketautomat;

import java.util.ArrayList;

public class Controller {
    Printer printer = new Printer();
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public void CreateTicket()
    {
        Ticket ticket = printer.PrintTicket();
        tickets.add(ticket);
    }   

}

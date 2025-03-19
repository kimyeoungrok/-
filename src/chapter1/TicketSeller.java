package chapter1;

public class TicketSeller {

    private TicketOffice ticketoffice;

    public TicketSeller(TicketOffice ticketoffice) {
        this.ticketoffice = ticketoffice;
    }

    public void sellTo(Audience audience){
        ticketoffice.plusAmount(audience.buy(ticketoffice.getTicket()));
    }
}

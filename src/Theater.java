public class Theater {
    private TicketSeller ticketseller;
    public Theater(TicketSeller ticketseller) {
        this.ticketseller = ticketseller;
    }

    public void enter(Audience audience){
        ticketseller.sellTo(audience);
    }
}

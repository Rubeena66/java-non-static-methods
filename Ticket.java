public class Ticket{
    public String getTicketInfo(String theaterName, String movieName, String seatNo){
        return "\nTheater Name : " + theaterName + "\nMovie Name : " + movieName +  "\nSeat No : " + seatNo;
    }
    public static void main(String[] args){
        Ticket ticket = new Ticket();
        System.out.println(ticket.getTicketInfo("Galaxy Cinemas","InterSeller","A10"));
        System.out.println("---------------------------------");
        System.out.println(ticket.getTicketInfo("Galaxy Cinemas","Inception","B12"));
        System.out.println("---------------------------------");

    }
}
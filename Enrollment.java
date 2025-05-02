public class Reservation{
    public String getReservationDetails(String hotelName, String guestName, int nights){
        return "\nHotel Name : " + hotelName + "\nGuest Name : " + guestName + "\nNights : " + nights;
    }
    public static void main(String[] args){
        Reservation reservation = new Reservation();
        System.out.println(reservation.getReservationDetails("Grand Palace","David",3));
        System.out.println("----------------------------------");
        System.out.println(reservation.getReservationDetails("Grand Palace","Maria",2));
        System.out.println("----------------------------------");
    }
}
public class Reservation {
	public String getReservationDetails(String hotelName , String guestName , int nights){
		return "Hotel Name : " + hotelName + "\n" + "GuestName : " + guestName + "\n" + "Nights : " + nights + "\n" + "---------------------------";
    }
	public static void main(String [] args){
		Reservation reservation = new Reservation();
		String info1 =reservation. getReservationDetails("Grand Palace","David",3);
		System.out.println(info1);
		String info2 = reservation. getReservationDetails("Grand Palace","Maria",2);
		System.out.println(info2);
	}
}
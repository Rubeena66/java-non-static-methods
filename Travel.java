public class Travels{
    public String getBookingDetails(String agency, String destination, int travellers){
        return "\nAgency : " + agency + "\nDestination : " + destination + "\nTravellers : " + travellers;
    }
    public static void main(String[] args){
        Travels travels = new Travels();
        System.out.println(travels.getBookingDetails("Wanderlust","Pairs",2));
        System.out.println("----------------------------------");
        System.out.println(travels.getBookingDetails("Wanderlust","Tokyo",3));
        System.out.println("----------------------------------");
    }
}
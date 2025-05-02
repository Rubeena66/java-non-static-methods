public class Order{
    public void getOrderDetails(String restaurantName, String foodItem, int quantity){
        System.out.println("Restaurant Name : "+restaurantName);
        System.out.println("Food Item : "+foodItem);
        System.out.println("Quantity : "+quantity);
    }
    public static void main(String[]args){
        Order order=new Order();
        order.getOrderDetails("Spice Garden","Paneer Butter Masala",2);
        System.out.println("---------------------------");
        order.getOrderDetails("Spice Garden","Chicken Biryani",1);
        System.out.println("---------------------------");
    }
}
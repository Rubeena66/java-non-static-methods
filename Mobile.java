public class Mobile{
    public void showDetails(String storeName, String brand, int price){
        System.out.println("Store Name  : "+storeName);
        System.out.println("Mobile Brand : "+brand);
        System.out.println("Mobile Price : "+price);
    }
    public static void main(String[]args){
        Mobile mobile=new Mobile();
        mobile.showDetails("Tech World","Apple",1200);
        System.out.println("---------------------------");
        mobile.showDetails("Tech World","Samsung",900);
        System.out.println("---------------------------");
    }
}
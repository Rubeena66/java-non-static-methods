public class Car{
    public void displayDetails(String showroomName, String modelName,int price){
        System.out.println("Showroom Name : "+showroomName);
        System.out.println("Car Model : "+modelName);
        System.out.println("Car Price : "+price);
    }
    public static void main(String[]args){
        Car car=new Car();
        car.displayDetails("Elite Motors","Tesla Models",80000);
        System.out.println("---------------------------");
        car.displayDetails("Elite Motors","BMW X5",75000);
        System.out.println("---------------------------");
    }
}
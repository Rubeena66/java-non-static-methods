public class Patient{
    public void printDetails(String hospitalName, String patientName, int age){
        System.out.println("Hospital Name  : "+hospitalName);
        System.out.println("Patient Name : "+patientName);
        System.out.println("Patient Age : "+age);
    }
    public static void main(String[]args){
        Patient patient=new Patient();
        patient.printDetails("City Care Hospital","John Doe",45);
        System.out.println("---------------------------");
        patient.printDetails("City Care Hospital","Emma Watson",30);
        System.out.println("---------------------------");
    }
}
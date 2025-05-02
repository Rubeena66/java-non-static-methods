public class Faculty{
    public void showFacultyDetails(String universityName, String facultyName, String department){
        System.out.println("University Name : "+universityName);
        System.out.println("Faculty Name : "+facultyName);
        System.out.println("Department : "+department);
    }
    public static void main(String[]args){
        Faculty faculty=new Faculty();
        faculty.showFacultyDetails("Stanford University","Dr.Robert Brown","Computer Science" );
        System.out.println("---------------------------");
        faculty.showFacultyDetails("Stanford University","Dr.Lisa Green ","Physics");
        System.out.println("---------------------------");
    }
}
      //vM 9/11/25

     import p1.Student;

    public class App {
       public static void main(String[] args) {

           Student myStudent = new Student();
           myStudent.firstName = "Jim";
           myStudent.lastName = "Halpert";
           myStudent.major = "Business";
           myStudent.gpa = 2.3;
           myStudent.age = 24;
           myStudent.onProbation = false;

           System.out.println(myStudent.gpa);

           Vincent myVincent = new Vincent();
           myVincent.birthday = "02/06/2006";
           myVincent.carColor = "black";
           myVincent.phone = "iphone 13";

           System.out.println(myVincent.birthday);
           System.out.println(myVincent.carColor);
           System.out.println(myVincent.phone);
    }
}
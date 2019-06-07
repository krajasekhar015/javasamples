package linkedlist1;
import java.util.*;
public class StudentDataOrganizer {
    public LinkedList readStudData(){
        Scanner s = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("Enter how many students you have:");
        int nos = Integer.parseInt(s.nextLine());
        LinkedList ll = new LinkedList();
        for(int i=1;i<=nos;i++){
            System.out.println("===================");
            System.out.println("Enter "+i+"Student details");
            System.out.println("===================");
            System.out.println("Enter student number:");
            int sno = Integer.parseInt(s.nextLine());
            System.out.println("Enter student name");
            String name = s.nextLine();
            System.out.println("Enter student marks:");
            float marks = Float.parseFloat(s.nextLine());
            Student so = new Student(sno, name, marks);
            ll.add(so); //adding an object of student class to 1D CFW object
            System.out.println("====================");
        }
        return ll;
    }
    public void dispStudData(LinkedList kl){
        Iterator itr = kl.iterator();
        System.out.println("Student Details");
        System.out.println("===============");
        while(itr.hasNext()){
            Object obj = itr.next();
            Student xo = (Student)obj; //OTC
            xo.disp();
        }
        System.out.println("===============");
    }
}

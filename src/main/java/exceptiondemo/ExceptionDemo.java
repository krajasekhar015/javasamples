package exceptiondemo;
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your USER NAME:");
        String un = s.nextLine();
        System.out.println("Enter your PASSWORD:");
        String psd = s.nextLine();
        Login lo = new Login();
        try{
            lo.auth(un,psd);
        }catch(Exception e){
            System.err.println("Some Error");
        }finally{
            System.out.println("IAM FROM FINALLY BLOCK");
        }
    }
}

package linkedlist1;
import java.util.*;
public class StudDataDemo {
    public static void main(String[] args) {
        StudentDataOrganizer sdo = new StudentDataOrganizer();
        LinkedList ll = sdo.readStudData();
        sdo.dispStudData(ll);
    }
}

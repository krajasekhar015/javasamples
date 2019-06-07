package linkedlist1;

public class Student {
    int stno;
    String sname;
    float marks;
    public Student(int stno, String sname, float marks){
        this.stno = stno;
        this.sname = sname;
        this.marks = marks;
    }
    public void disp(){
        System.out.println(stno+"\t"+sname+"\t"+marks);
    }
}

package ArrayList;

import java.util.*;
public class Data {
    public ArrayList readData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many number u want to enter");
        int n = Integer.parseInt(s.nextLine());
        System.out.println("=============");
        System.out.println("Enter" +n+ "Values:");
        System.out.println("=============");
        ArrayList al = new ArrayList();
        for(int i=0;i<=n;i++){
            int val = Integer.parseInt(s.nextLine());
            al.add(val);
        }
        System.out.println("==============");
        return al;
    }
    public void dataManip(ArrayList al){
        System.out.println("==============");
        System.out.println("Original Data");
        System.out.println("==============");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            System.out.println("\t"+obj);
        }
        System.out.println("==============");
        Collections.sort(al); //Here 'sort()' will sort the element od 'al'
        System.out.println("Sorted Data----ASC Order");
        System.out.println("==============");
        Object obj[] = al.toArray();
        for(Object x:obj){
            System.out.println("\t"+x);
        }
        System.out.println("==================");
        System.out.println("Sorted Data----DESC order");
        System.out.println("==================");
        for(int i=obj.length-1;i>=0;i--){
            System.out.println("\t"+obj[i]);
        }
        System.out.println("===============");
        System.out.println("Max Element="+Collections.max(al));
        System.out.println("Min Element="+Collections.min(al));
        System.out.println("===============");
    }
}
class DataDemo{
    public static void main(String[] args) {
        Data do1 = new Data();
        ArrayList al = do1.readData();
        do1.dataManip(al);
    }
}

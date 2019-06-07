package linkedlist;

import java.util.*;
public class LLOperations {
    void operations(){
        LinkedList ll = new LinkedList();
        System.out.println("Content of ll="+ll); //[]
        System.out.println("Size of ll="+ll.size()); //0
        //add the data to ll----1D CFW object
        ll.add(10);
        ll.add(10.75);
        ll.add("james gosling");
        ll.add(true);
        ll.add('a');
        ll.add(10);
        System.out.println("Content of ll="+ll); //[----]
        System.out.println("Size of ll="+ll.size()); //6
        //add the elements 100 in beginning and java at the last positions
        ll.add(0,100);
        ll.add(ll.size(),"java");
        System.out.println("Content of ll="+ll); //[100---java]
        System.out.println("Size of ll="+ll.size()); //8
        System.out.println("Extract the data from ll - using iterator");
        System.out.println("================");
        Iterator itr = ll.iterator();
        while(itr.hasNext()){
            Object obj = itr.next();
            System.out.println("\t"+obj);
        }
        System.out.println("================");
        System.out.println("Extract the data from ll - using listIterator() - FD");
        System.out.println("================");
        ListIterator litr = ll.listIterator();
        for(;litr.hasNext();){
            Object obj = litr.next();
            System.out.println("\t"+obj);
        }
        System.out.println("================");
        System.out.println("Extract the data from ll - using listIterator() ----BD");
        System.out.println("================");
        for(;litr.hasPrevious();){
            Object obj = litr.previous();
            System.out.println("\t"+obj);
        }
        System.out.println("================");
        System.out.println("Extract the data from ll -- toArray");
        System.out.println("================");
        Object obj[] = ll.toArray();
        for(Object x:obj){
            System.out.println("\t"+x);
        }
        System.out.println("=================");
        System.out.println("Extract the data from ll----get ----randomly");
        System.out.println("=================");
        Object robj = ll.get(4);
        System.out.println("Random element="+robj);
        System.out.println("=================");
        System.out.println("Extract the data from ll---get()");
        System.out.println("=================");
        for (int i=0;i<ll.size();i++){
            System.out.println("\t"+ll.get(i));
        }
        System.out.println("=================");
    }
}

class LLDemo{
    public static void main(String[] args) {
        LLOperations ll = new LLOperations();
        ll.operations();
    }
}

package java_programs;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
          LinkedList l=new LinkedList();
          l.add("Rohit");
          l.add("Rohan");
          l.add("vishal");
          l.add("07");
         
          System.out.println(l);
          
          l.addFirst("Sachin");
          l.addLast("vinay");
          System.out.println(l);
          
          l.removeFirst();
          l.removeLast();
          System.out.println(l);
          
          l.add(3,"Manoj");
          System.out.println(l);
         
	}

}

package java_programs;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> s=new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");  //insert stack
		s.push("D");
		
		System.out.println(s);
		System.out.println(s.pop());   //removes top stack
		System.out.println(s);
		System.out.println(s.peek());   //just lookout peek stack
		System.out.println(s); 
		
		System.out.println(s.search("C"));     //Searching offset number 
		                                      //if search available the it will print offset number
		
		System.out.println(s.search("M"));     //Searching offset number
		                                       // if search is not available the it will print -1
		

	}

}

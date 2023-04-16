package java_programs;

public class StringLiteralExample {

	public static void main(String[] args) {

		String a="Hello";                   // a refer to hello
		System.out.println(a);
		
		String b="Hello";               // b also refer to hello
		System.out.println(b);
		
		a.concat("Good Morning");     // it will not concat, because b is also refering a 
		System.out.println(a);       
		
		// concat solution- need to declare new same varibale 
		
		a=a.concat(" Good Morning");     //it will concat now
		System.out.println(a);
	}

}

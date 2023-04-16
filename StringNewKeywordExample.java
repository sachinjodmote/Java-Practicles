package java_programs;

public class StringNewKeywordExample {

	public static void main(String[] args) {
		 
		String a=new String("hello");     //a variable referring to hello
		System.out.println(a);

		String b=new String("hello");   //b also referring to hello
		System.out.println(b);
		
		a.concat(" Good Morning");      //can't concat because b is referring a
		System.out.println(a);
	
		
		a=a.concat(" Good Morning");    // this method used to pass input forcefully to a variable
		System.out.println(a);
	
	
	
	}
	

}

/* Create an interface called ""Person"" with a method called ""speak"".
Create two classes called ""Student"" and "Teacher" that implement the 
Person interface and implement the "speak"method. Create objects of both 
the Student and Teacher classes and cal *//* l their respective ""speak"" methods. */

interface Person {
   public void speak();
}
class Student implements Person{
     
	 public void speak()
	 {
	     System.out.println("Student");
	 }

}
class Teacher implements Person{
   public void speak()
   {
       System.out.println("Teacher");
   }
}
class InterfacePerson
{
    public static void main(String args[])
	{
	    Student s=new Student();
		s.speak();
		
		Teacher t=new Teacher();
		t.speak();
	}
}
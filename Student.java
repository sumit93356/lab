package createobject;

public class Student {
	  String firstName;
	  String lastName;
	  int age;

	  //Student constructor
	  public Student(){
	      firstName = "sumit";
	      lastName = "kumar";
	      age = 21;
	  }
	  
	  public static void main(String args[]) {
	      Student myStudent = new Student();
	      System.out.println(myStudent.age);
	      
	  }
	}

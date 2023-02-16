package com.cognizant.shapes;
//parent class
class A{
	int total_number_student=1000;
	void show(){
		System.out.println("total number of student "+total_number_student);
	}
}
class B extends  A{
	int subject=6;
	void display() {
		System.out.println("total subject"+subject);
	}
}
class C extends B{
	int total_teacher=50;
	void extra() {
		System.out.println("total teacher"+total_teacher);
	}
}
public class Inheritence {

	public static void main(String[] args) {
	 B ab=new B();
	 ab.show();
	 ab.display();
	 C cb=new C();
	 cb.extra();

	}

}

package com.cognizant.shapes;
class Teacher{
	String college_name="Delhi university";
	String Designation="HOD";
	void work() {
		System.out.println("college name is -"+college_name);
		System.out.println("Designation -"+Designation);
	}
}
class ITTeacher extends Teacher{
	String maths_teacher="abc,vfg,rvrfg";
	String science_teacher="raj,svr,deep";
	void show() {
		System.out.println("Maths teacher- "+maths_teacher);
		System.out.println("science teacher- "+science_teacher);
	}
}
public class Inheritence2 {

	public static void main(String[] args) {
		ITTeacher IT=new ITTeacher();
		IT.work();
		IT.show();

	}

}

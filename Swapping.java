package lab1;

public class Swapping {
	public static void main(String[]args) {
		int x=100, y=200;
		System.out.println("Before Swapping");
		System.out.println("X+"+x);
		System.out.println("Y+"+y);
		
		int temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping");
		System.out.println("X+"+x);
		System.out.println("Y+"+y);
		
	}

}

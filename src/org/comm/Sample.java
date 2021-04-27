package org.comm;

public class Sample {
    static	Sample s;
    private Sample() {
		// TODO Auto-generated constructor stub
	}
	public static Sample getIntance() {
		
		if (s==null) {
			 s =new Sample();
		}
		System.out.println(System.identityHashCode(s));
		return s;

	}
	
	public void empId() {

		System.out.println("Emp id is 1234");

}
public static void main(String[] args) {
	Sample s =getIntance();
	s.empId();
}	

}

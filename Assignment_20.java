package java_assignments;
//multilevel inheritance for static method

class Super_class{
	static void add() {
		System.out.println("Super Class is output");
	}
}


class Sub_class extends Super_class{
	static void sub() {
		System.out.println("Sub Class is output");
	}
	
}

public class Assignment_20 extends Sub_class{
	static void mul() {
		System.out.println("Child Class is output");
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		
	}
	

}


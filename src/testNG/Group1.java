package testNG;

import javax.swing.GroupLayout.Group;

public class Group1 {
	@Test (Groups = "smoke")
	public void a()   {
		
		System.out.println("a has been executed");
	}
	@Test (Groups = "Integration")
	public void b() {
		
		System.out.println("b has been executed");
	}
	@Test (Groups = "adhoc")
	public void c() {
		
		System.out.println("c has been executed");
	}

}

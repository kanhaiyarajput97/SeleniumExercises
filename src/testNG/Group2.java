package testNG;

public class Group2 {
	
	@Test (Groups = "functional")
	public void d()   {
		
		System.out.println("d has been executed");
	}
	@Test (Groups = "adhoc")
	public void e() {
		
		System.out.println("e has been executed");
	}
	@Test (Groups = "Integration")
	public void f() {
		
		System.out.println("f has been executed");
	}

}

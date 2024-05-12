package testNG;

public class Group3 {
	
	@Test (Groups = "functional")
	public void g()   {
		
		System.out.println("g has been executed");
	}
	@Test (Groups = "adhoc")
	public void h() {
		
		System.out.println("h has been executed");
	}
	@Test (Groups = "adhoc")
	public void i() {
		
		System.out.println("i has been executed");
	}

}

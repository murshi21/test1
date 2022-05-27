package firstTestNGTestP;

import org.testng.annotations.Test;

public class NewTestC {
	@Test(priority = 1)
	public void fv() {
		System.out.println("hello 11");

	}
	@Test(priority = 2,description = "hello")
	public void fa() {
		System.out.println("hello 2");
	}

}

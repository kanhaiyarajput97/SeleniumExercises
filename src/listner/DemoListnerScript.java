package listner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class DemoListnerScript extends BaseClass {
@Test

public void method01() {
	Assert.assertEquals(false, true);
	
}
@Test

public void method02() {
	Assert.assertEquals(false, true);
	
}
@Test
public void method03() {
	Assert.assertEquals(false, true);
	
}
@Test
public void method04() {
Assert.assertEquals(false, false);
}
}

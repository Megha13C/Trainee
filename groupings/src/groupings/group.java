package groupings;

import org.testng.annotations.Test;

public class group {
@Test(groups={"Buddies"})
public void Friends ()
{
	System.out.println("Friends for life");
}
@Test(groups={"Family"})
public void Relations() 
{
	System.out.println("Family is an emotion");
}
@Test(groups= {"Life"})
	public void Life() {
		System.out.println("Live the life you love");
	}

}

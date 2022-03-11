package xApplication;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;
public class homepagetest{

	
homepageobj hompagobj;

public homepagetest(){
	hompagobj=new homepageobj();
}
@Test
public void getTabChecked(){
	Assert.assertTrue(hompagobj.WomenTabChecked().isDisplayed());
	Assert.assertTrue(hompagobj.DressTabChecked().isDisplayed());
	Assert.assertTrue(hompagobj.T_shirtTabChecked().isDisplayed());
}
//@Test


}

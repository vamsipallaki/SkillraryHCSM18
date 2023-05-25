package TestSCripts;

public class AddToCart extends BaseClass {
	
	@Test
	Run| Debug
	public void  addToCartTest() {
		SoftAssert soft= new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		Web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		demoApp.mouseHoverToCourse(web);
		demoApp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
		
		int initialQuantity = Integer.parseInt(selenium.getQuntity());
		selenium.doubleClickPlusButton(web);
		int finalQuantity = Integer.parseInt(selenium.getQuntity());
		soft.assertEquals(finalQuantity, initialQuantity+1);
		
		selenium.clickAddToCart();
		Web.handleAlert("ok");
		soft.assertEquals(selenium.getMessage(), "Item added to cart");
		 
		soft.assertAll();
	}

}

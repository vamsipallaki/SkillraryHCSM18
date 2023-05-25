package TestSCripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.BaseClassFinder;

public class SendcontactDetails extends BaseClassFinder{
	@Test
	
	public void SendcontactDetails() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		web.scrollToElement(demoApp.getContactUs());
		demoApp.clickContactUs();
		
		soft.assertTrue(contact.getPageLogo().isDisplayed());
		
		home.chooseEnglish();
		Map<String,String> map=excel.readDataFromExcel("Sheet1");
		contact.sendDetails(mao.get("FullName")),map.get("email"),
		      map.get("Subject"),map.get("Message"));
		      
		      soft.assertAll();
	}

}

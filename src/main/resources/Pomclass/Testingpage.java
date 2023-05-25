package Pomclass;

import org.openqa.selenium.webDriver;
import org.openqa.selenium.webElement;
import org.openqa.selenium.support.findBy;
import org.openqa.selenium.support..pageFactory;
/**
 * this class contains element and respective business  libraries of testing page
 * @author PALLAKI VAMSI
 *
 */

public class Testingpage {
//declaration
	
	@findBy(xpath = "//h1@class='page-header']")
	private webElement pythonImage;
	 @findBy(id = "python")
	 private webElement pythonImage;
	 @findBy(id = "cartArea");
	 private webElement myCart;
	 @findBy(xpath = '//ul/descendant::i[@class=='fa fa.facebook'])
			 private webElement facebookIcon:
				 
				 //Intilization
				 public testingpage(webdriver driver) {
		 pageFactory.iniElements(driver,this)
		 
		  }
	 //utilization
	 /**
	  * this method returnss  page headew of selenium Trainiing page
	  * @return
	  */
	 public string getpageHeader() {
		 return pageHeader.getText();
	 }
	 /**
	  * this method is used to get python image
	  * @return
	  */
	 public webElement getpythoneImage() {
		 return pythonImage;
	 }
	 /**
	  * this method is used to get myCart area
	  * @return
	  */
	 public webIement getMyCart() {
		 retuurn myCart;
	 }
	 /**
	  * this method is used to get facebook Icon
	  * @return
	  */
		 public WebElement getFacebookIcon() {
			 return facebookIcon;
		 }
		 /**
		  * this method is used to click on facebook icon
		  * 
		  */
		 public void clickFacebook() {
			 facebookIcon.click;
		 }
	 }
		 }
		 
		
	 }
				 
}

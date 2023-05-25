package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WebDriverUtility {
private WebDriver driver;

/**
 * This method is used to launch specific browser
 * @param browser
 */

public void launchBrowser(String browser) {
	switch(browser) {
	case "chrome";
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	break;
	case "firefox";
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	break;
	case "edge";
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	break;
	default:
		System.out.println("Invalid Browser Info");
	}
	return driver;
	
	/**
	 * this method is used to maximise the window
	 */
}
public void maximizBrowser() {
	driver.manage().window().maximize();
}

/**
 * this method is used to navigate specified application.
 * @param url
 */
public void navigateToApp(String url) {
	driver.get(url);
}
/**
 * this method is used to wait until element or list of elements is found
 * @param time
 */

public void waitUntilElementFound(long time) {
	driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
}
/**
 * this method is used to wait until element is visible
 * @param time
 * @param element
 */
public void explicitWait(long time, WebElement element) {
	WebDriverWait wait=new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.visibletypeOf(element));
}
/**
 * this method is used to wait until element is enabled
 * @param element
 * @param time
 */
public void explicitWait(WebElement element, long time) {
	WebDriverWait wait=new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.elementToBeClickable(element));
}
/**
 * this method is used to wait until title of the webpage is found
 * @param time
 * @param title
 */
public void explicitWait(long time, String title) {
	WebDriverWait wait=new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.titleContains(title));
}
/**
 * this methos is used to mouseover on element
 */
public void mouseOver() {
	Actions actions= new Action(driver);
	actions.moveToElement(element).perform();	
}
/**
 * this method is used to double click on element
 */
public void doubleClickOnElement(WebElement, element) {
	Actions actions= new Action(driver);
	actions.doubleClick(element).perform();	
}
/**
 * this method is used to right click on element
 */
public void rightClick() {
	Actions actions= new Action(driver);
	actions.contextClick(element).perform();
}
/**
 * this methos is used to drag and drop an element to dest
 * @param element
 * @param dest
 */
public void dragAndDrop(WebElement element, WebElement dest) {
	Actions actions= new Action(driver);
	actions.dragAndDrop(element, dest).perform();
}
/**
 * this method is used to switch to frame based on index
 * @param index
 */
public void switchToFrame(int index) {
	driver.switchTo().frame(index);
}
/**
 * this method is used to switch to frame based on id or name attribute
 * @param idOrName
 */
public void switchToFrame(String idOrName) {
	driver.switchTo().frame(idOrName);
}
/**
 * this method is used to switch to frame based on frame element
 * @param frameElement
 */
public void switchToFrame(WebElement frameElement) {
	driver.switchTo().frame(frameElement);
}
/**
 * this method is used to switch back from frame
 */
public void switchBackFromFrame() {
	driver.switchTo().defaultContent();	
}
/**
 * this method is used to take screenshot of the webpage
 */
public void takeScreenshor() {
	TakeScreenshot ts=(TakeScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	File dest= new File("./Screenshots/screenshot.png");
	try {
		FileUtils.copyFile(src, dest);
	}catch (IOException e) {
		e.printStackTrace();
	}
}
/**
 * this method is used to scroll till the element
 * @param element
 */
public void scrollToElement(WebElement element) {
	javascriptExecutor js=(javascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);
}
}

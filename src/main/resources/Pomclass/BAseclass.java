package Pomclass;

import genericLibraries.PropertiesUtility;
import genericLibraries.WebDriverUtility;

public class BAseclass {
protected PropertiesUtility property;
protected ExcelUtility excel;
protected WebDriverUtility web;
protected Driver driver;

protected SkillraryHomePage home;
protected SkillraryDemoAppPage demoapp;
protected SaleniumTrainingPage selenium;
protected TestingPage testing;
protected ContactUsagePage contact;


//@BeforeSuite
//@BeforeTest

@BeforeClass
public void classConfig() {
	property = new PropertiesUtility();
	excel = new ExcelUtility();
	web = new WebDriverUtility();
	
	property.propertiesInit(IConstantPath.PROPERTIES_PATH);
	excel.excelInit(IConstant.EXCEL_PATH);
}

	@BeforeMethod
	public void methodConfig() {
		driver = web.launchBrowser(property.readData("browser"));
		Web.maximizeBrowser();
		Web.navigateToApp(prperty.readData("url"));
		Web.waituntilElementFound(Long.parseLong(property.readData("time")));
		
		home = new SkillraryHomePage(driver);
		demoApp = new SkillraryDemoAppPage(driver);
		selenium = new SeleniumTrainingPage(driver);
		testing = new TestingPage(driver);
		contact = new ContactUsPage(driver);
	}
	@AfterMethod
	public void methodTearDown() {
		web.quitAllWindows();
}
	@Afterclass
		public void classTearDown() {
	excel.closeEcxel();
}
	//@AfterTest
	//@AfterSuite
}

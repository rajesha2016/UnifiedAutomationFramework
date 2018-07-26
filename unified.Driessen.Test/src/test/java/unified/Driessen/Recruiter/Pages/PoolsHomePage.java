package unified.Driessen.Recruiter.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PoolsHomePage {
	
	@FindBy(xpath="//a[@title='Pools']")
	WebElement poolTab;
	
	@FindBy(xpath="//a[@href='/Pools/Home/ViewPoolDetails']")
	WebElement poolToevoegenButton;
	
	@FindBy(xpath="//h3[text()='Nieuwe Pool']")
	WebElement newPoolPageHeaderText;
	
	@FindBy(xpath="//input[@id='Title']")
	WebElement poolTitleTextBox;
	
	@FindBy(xpath="//input[@id='Team']")
	WebElement poolTeamTextBox;
	
	
	

}

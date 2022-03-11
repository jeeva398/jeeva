package xApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepageobj extends BasePage {
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement WomenTab;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement DressTab;
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement T_shirtTab;
	
	public WebElement WomenTabChecked(){
		return WomenTab;
	}
	public WebElement DressTabChecked(){
		return DressTab;
	}
	public WebElement T_shirtTabChecked(){
		return T_shirtTab;
	}
	
	@FindBy(xpath="//*[@id='center_column']/div[1]/div/div/span")
	private WebElement WomenDisplay;
	@FindBy(xpath="//*[@id='center_column']/div[1]/div/div/span")
	private WebElement DressDisplay;
	@FindBy(xpath="//*[@id='center_column']/div[1]/div/div/span")
	private WebElement T_shirtDisplay;
	
	public WebElement WomenDisplayChecked(){
		isElementVisible(WomenDisplay);
		return WomenDisplayChecked();
	}
	public WebElement DressDisplayChecked(){
		isElementVisible(DressDisplay);
		return DressTabChecked();
	}
	public WebElement T_shirtDisplayChecked(){
		isElementVisible(T_shirtDisplay);
		return T_shirtDisplayChecked();
	}
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement WomenMail;
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement DressMail;
	@FindBy(xpath="//*[@id='newsletter-input']")
	private WebElement T_shirtMail;
	
	public String WomenMailCheck(){
		isElementVisible(WomenMail);
		return WomenMailCheck();
		}
	public String DressMailCheck(){
		isElementVisible(DressMail);
		return DressMailCheck();
	}
	public String T_shirtMailCheck(){
		isElementVisible(T_shirtMail);
		return T_shirtMailCheck();
	}
	
	}
	




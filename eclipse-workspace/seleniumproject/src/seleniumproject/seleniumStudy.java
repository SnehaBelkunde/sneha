package seleniumproject;

public class seleniumStudy 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://google.com");

	}
}	
	
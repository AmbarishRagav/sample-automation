package dett;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dettgifitng {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ambar\\Desktop\\FILES\\SOFTWARES\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
        driver.get("https://www.dett.app/");
        Thread.sleep(3000);
       
        WebElement Prebook = driver.findElement(By.xpath("//h1[contains (text(), 'Pre-Book')]"));
        Prebook.click();
        Thread.sleep(900);
        
        WebElement Startgifitng = driver.findElement(By.xpath("//span[contains (text(), 'Start Gifting Now')]"));
        Startgifitng.click(); 
        Thread.sleep(900);
        
        WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
        number.sendKeys("8903314148");
        Thread.sleep(900);
        
        WebElement Continue= driver.findElement(By.xpath("//div[contains (text(), 'Continue')]"));
        Continue.click();
        Continue.click();
        Continue.click();
        Continue.click();
        Continue.click();
        Continue.click();
        Continue.click();
        Thread.sleep(900);
        
        //WebElement message = driver.findElement(By.xpath("//textarea[@placeholder='Type a message...']"));
       // message.click();
      //  Thread.sleep(900);
        
        //WebElement enteryourmessage = driver.findElement(By.xpath("//textarea[@placeholder='Type a message...']"));
        //enteryourmessage.sendKeys("The climate emergency is now undeniably being felt across the world. According to the United Nations’ Intergovernmental Panel on Climate Change, human activities are estimated to have already caused approximately 1°C of global heating. The commitments made at 2021's Conference of the Parties (COP) 26 still leave us on a likely trajectory towards around 2°C of heating by 2100."); 
        //Thread.sleep(900);
        
        //WebElement send = driver.findElement(By.xpath("//h1[contains (text(), 'Send')]"));
        //send.click();
        
        //Thread.sleep(900);
        
      //  WebElement Googleplay = driver.findElement(By.xpath("//a[@rel=\"noreferrer\"]"));
       // Googleplay.click();
      //  Thread.sleep(900);
        
      //  WebElement Applestore = driver.findElement(By.xpath("//a[@rel=\"noreferrer\" and @xpath=\"1\"]"));
      //  Applestore.click();
      //  Thread.sleep(900);
        
        
        
        
        
        
        
   
        //WebElement about = driver.findElement(By.xpath("//span[normalize-space()='About Us']"));
        //about.click();
        //Thread.sleep(4000);
        
        //WebElement contactus = driver.findElement(By.xpath("//a[@id='contact-us-btn']"));
       	//contactus.click();
       	//Thread.sleep(900);
       	
        
       	//System.out.println(driver.getTitle());
       	//driver.quit();
        
	}

}//input[@placeholder='Enter your name']
//a[text()="Terms of Use"]

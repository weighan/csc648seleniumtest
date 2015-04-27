

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Thread;


class seltest{

	public static void main(String[] args){
		
		//browseanimalprofiles();
		//createprofile();
		//admindelete();
	}
	
	public static void browseanimalprofiles(){
		int waittime = 500;
		WebDriver driver = new FirefoxDriver();
		Select sel;
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/");
		
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm:ss");
		Date date = new Date(time);
		String words = String.valueOf(sdf.format(date));
		
		waitx(waittime);		
		driver.findElement(By.className("form-control")).sendKeys(words);
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-md search-info']")).click();
		driver.findElement(By.className("form-control")).sendKeys(words);
		sel = new Select(driver.findElement(By.xpath("//select[@name='pet-gender']")));
		sel.selectByVisibleText("Male");
		sel = new Select(driver.findElement(By.xpath("//select[@name='pet-age']")));
		sel.selectByVisibleText("6-12 months");
		driver.findElement(By.xpath("//input[@list='breed']")).sendKeys("ALASKAN MALAMUTE");
		driver.findElement(By.id("filterSearchBt")).click();
		driver.findElement(By.xpath("//div[@class='cuadro_intro_hover']")).click();
		driver.findElement(By.xpath("//div[@id='adopt-me']")).click();	
		
	}	
	
	public static void createprofile(){
		int waittime = 500;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/");
		
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm:ss");
		Date date = new Date(time);
		String words = String.valueOf(sdf.format(date));
		//test adoptee signup
		
		driver.findElement(By.xpath("//a[@href='#signup']")).click();		
		waitx(waittime);		
		driver.findElement(By.partialLinkText("Register as adoptee!")).click();
		driver.findElement(By.id("adoptee-first_name")).sendKeys(words);
		driver.findElement(By.id("adoptee-last_name")).sendKeys(words);
		driver.findElement(By.id("adoptee-user_name")).sendKeys(words);
		driver.findElement(By.id("adoptee-email")).sendKeys(words);
		driver.findElement(By.id("adoptee-pw")).sendKeys(words);
		driver.findElement(By.id("adoptee-pw_confirm")).sendKeys(words);
		driver.findElement(By.id("adoptee-city")).sendKeys(words);
		driver.findElement(By.id("adoptee-state")).sendKeys(words);
		driver.findElement(By.id("adoptee-zip")).sendKeys(words);
		driver.findElement(By.id("adoptee-country")).sendKeys(words);
		driver.findElement(By.id("adoptee-description")).sendKeys(words);
		driver.findElement(By.xpath("//input[@value='Register']")).click();

		//test adopter signup
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/");
		waitx(waittime);
		driver.findElement(By.xpath("//a[@href='#signup']")).click();
		waitx(waittime);		
		driver.findElement(By.partialLinkText("Register as adopter!")).click();
		driver.findElement(By.id("adopter-first_name")).sendKeys(words);
		driver.findElement(By.id("adopter-last_name")).sendKeys(words);
		driver.findElement(By.id("adopter-user_name")).sendKeys(words);
		driver.findElement(By.id("adopter-email")).sendKeys(words);
		driver.findElement(By.id("adopter-pw")).sendKeys(words);
		driver.findElement(By.id("adopter-pw_confirm")).sendKeys(words);
		driver.findElement(By.id("adopter-city")).sendKeys(words);
		driver.findElement(By.id("adopter-state")).sendKeys(words);
		driver.findElement(By.id("adopter-zip")).sendKeys(words);
		driver.findElement(By.id("adopter-country")).sendKeys(words);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		waitx(waittime);
		
		//test login
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/");
		waitx(waittime);
		driver.findElement(By.xpath("//a[@href='#signup']")).click();
		waitx(waittime);		
		driver.findElement(By.id("username")).sendKeys(words);
		driver.findElement(By.id("password")).sendKeys(words);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//test forgot pw
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/");
		waitx(waittime);
		driver.findElement(By.xpath("//a[@href='#signup']")).click();
		waitx(waittime);
		driver.findElement(By.partialLinkText("Forgot username or password")).click();
	}
	
	public static void testtabs(){
		int waittime = 500;
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/");
		driver.findElement(By.partialLinkText("Put Up a Pet for Adoption")).click();
		waitx(waittime);
		driver.findElement(By.partialLinkText("Who We Are")).click();
		waitx(waittime);
		driver.findElement(By.partialLinkText("Learning Resources")).click();
		waitx(waittime);		
		driver.findElement(By.partialLinkText("Adopt a Pet")).click();
		waitx(waittime);	
		driver.findElement(By.id("title")).click();
	}
	
	public static void adoptanimal(){
		
	}
	
	public static void admindelete(){		
		int waittime = 500;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sfsuswe.com/~s15g11/horizontal2/admin.php");
		waitx(waittime);
		driver.findElement(By.partialLinkText("Delete")).click();
		waitx(waittime);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();	
		waitx(waittime);
		driver.findElement(By.xpath("//button[@class='confirm']")).click();	
	}
	
	public static void verticaltest(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://sfsuswe.com/~s15g11/");
		
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm:ss");
		Date date = new Date(time);
		String words = String.valueOf(sdf.format(date));
		
		driver.findElement(By.partialLinkText("Upload")).click();
		WebElement element = driver.findElement(By.name("name"));
		element.sendKeys(words);
		
		driver.findElement(By.name("gender")).sendKeys(words);


		Select select = new Select(driver.findElement(By.name("type")));

		String types[]= {"dog", "cat", "bird", "other"};	
		//select.selectByVisibleText(types[rand%4]);

		driver.findElement(By.name("address_line")).sendKeys(words);

		driver.findElement(By.name("city")).sendKeys(words);

		driver.findElement(By.name("zipcode")).sendKeys(words);
		
		words = "C:\\Users\\Ustak\\Desktop\\562.jpg";
		driver.findElement(By.name("fileToUpload")).sendKeys(words);;
		
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.name("type")).sendKeys(types[rand%4]);
		driver.findElement(By.name("submit")).click();
		System.out.println("test success");
		//driver.quit();
	}
	
	public static void waitx(int x){
		try{
			Thread.sleep(x);
			} catch(InterruptedException e){
			}
	}	
}
	

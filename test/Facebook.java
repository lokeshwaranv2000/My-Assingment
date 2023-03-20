package week4.test;
		
	
		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.support.ui.Select;
		public class Facebook {
		public static void main(String[] args) {
			EdgeDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/'");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();
			driver.findElement(By.name("firstname")).sendKeys("lokesh");
			driver.findElement(By.name("lastname")).sendKeys("waran");
			//password_step_input
			driver.findElement(By.name("reg_email__")).sendKeys("lokimarval2001@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("lokimarval2001@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("loki678");
			WebElement findElement = driver.findElement(By.id("day"));
			Select dropdown = new Select(findElement);
			dropdown.selectByValue("11");
			WebElement findElement3 = driver.findElement(By.name("birthday_year"));
			Select dropdown3 = new Select(findElement3);
			dropdown3.selectByVisibleText("2000");
			WebElement findElement2 = driver.findElement(By.name("birthday_month"));
			Select dropdown2 = new Select(findElement2);
			dropdown2.selectByVisibleText("Nov"); 
			WebElement findElement4 = driver.findElement(By.xpath("//input[@value  ='2']"));
			findElement4.click();
			driver.findElement(By.name("websubmit")).click();


		
	}

}

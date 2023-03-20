package week4.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Matrimony {
	public static void main(String[] args) {
		 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
	        ChromeDriver driver = new ChromeDriver(options);


	    driver.manage().window().maximize();
	    driver.get("https://www.tamilmatrimony.in/");
	    WebElement registered_by = driver.findElement(By.name("REGISTERED_BY"));
        Select selectRegisteredBy = new Select(registered_by);
        selectRegisteredBy.selectByValue("1");


        driver.findElement(By.name("NAME")).sendKeys("Lokeshwaran");
      
        WebElement gender = driver.findElement(By.xpath("(//input[@class = 'hp-gender'])[1]"));
        gender.click();
        WebElement dayDropDown = driver.findElement(By.name("DOBDAY"));
        Select selectDay = new Select(dayDropDown);
        selectDay.selectByValue("11");
        WebElement monthDropDown = driver.findElement(By.name("DOBMONTH"));
        Select selectMonth = new Select(monthDropDown);
        selectMonth.selectByValue("11");
        WebElement yearDropDown = driver.findElement(By.name("DOBYEAR"));
        Select selectYear = new Select(yearDropDown);
        selectYear.selectByValue("2000");
        WebElement motherTongueDropDown = driver.findElement(By.id("MOTHERTONGUE"));
        Select selectMotherTongue = new Select(motherTongueDropDown);
        selectMotherTongue.selectByValue("47");
        WebElement CountryCodeDropDown = driver.findElement(By.id("M_COUNTRYCODE"));
        Select selectCountryCode = new Select(CountryCodeDropDown);
        selectCountryCode.selectByValue("98");
        
        driver.findElement(By.id("MOBILENO")).sendKeys("1234566876");
        
        driver.findElement(By.id("EMAIL")).sendKeys("spidey123@gmail.com");
        
        driver.findElement(By.name("PASSWD1")).sendKeys("46468468");

        
        driver.close();
	}






        



	}

	    
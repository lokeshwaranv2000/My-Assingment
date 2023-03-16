package week4.Assingment3;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Acme {
	public static void main(String[] args) {
		EdgeDriver browser=new EdgeDriver();{
			browser.get("https://acme-test.uipath.com/login");
			browser.manage().window().maximize();
		    browser.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		    browser.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		    browser.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		    String expectedResult ="ACME System 1 -  Dashboard";
		    String actualResult=browser.getTitle();
		    System.out.println(browser.getTitle());
		    if(expectedResult.equals(actualResult));
		    System.out.println("print="+expectedResult);
			browser.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
			browser.close();
		   
		    
		    
		    		                                                                          
		    
			
	}

}
}


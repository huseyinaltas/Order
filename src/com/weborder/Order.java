package com.weborder;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Order {
	
	public static void main(String[] args) {
		Random rnd= new Random();
	int a=rnd.nextInt(100);
	String number=a+"";
	int d = 65 + (int)(Math.random() * ((89 - 65) + 1));
	char c=(char) d;
	String l=""+c;
	System.setProperty("webdriver.chrome.driver","/Users/huseyinaltas/Documents/selenium dependencies/drivers/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		String title = driver.getTitle();
		System.out.println("Title: "+ title);
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.xpath("//a[.='Order']")).click();
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(number);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John "+l+" Smith");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("123 River st"); ;
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("BestCity");
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Virginia");
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys("60625");
	   int v=0;
	    Random nb= new Random();
	    int num=nb.nextInt(3);
	    if(num==0) {
	    	 v=4;
	    }
	    else if(num==1) {
	    	 v=5;
	    }
	    else {
	    	v=3;
	    }
	    String vs=v+"";
	    long d2 = 10000000000000L + (long)(Math.random() * ((99999999999999L - 10000000000000L) + 1));
	    
	    long d3 = 100000000000000L + (long)(Math.random() * ((999999999999999L - 100000000000000L) + 1));
	    
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_"+num)).click();
	    if(num==2)driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(vs+d2);
	    else {
	    	driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(vs+d3);
	    }
	    Random nb2= new Random();
	    int num2=nb2.nextInt(10)+1;
	    int d4 = 19 + (int)(Math.random() * ((30 - 19) + 1));
	    
	    driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys(11+"/"+23);
	    driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	}

}

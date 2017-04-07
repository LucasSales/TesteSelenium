package br.ufc.great.teste;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldSelenium {
	public static  WebDriver driver;
	public static void main(String[] args) {
		System.out.println("Inicializando o selenium web driver");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\great\\Documents\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();  
		driver.get("https://www.google.com/");
		try{  
		    Thread.sleep(2000);  
		}catch(Exception e){}  

		driver.close();  
		driver.quit();  
	}
}
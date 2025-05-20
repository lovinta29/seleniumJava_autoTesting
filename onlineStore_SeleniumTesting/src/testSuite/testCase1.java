package testSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32");
		WebDriver wd = new ChromeDriver();

		wd.get("https://shopee.co.id/");

		System.out.println("Title of the page is: " + wd.getTitle());

		wd.close();
	}

}

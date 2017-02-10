import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.logfile", "target/chrome_output.txt");
		System.setProperty("webdriver.chrome.args", "--disable-logging");
		System.setProperty("webdriver.chrome.silentOutput", "true");
	    
	    WebDriver driver = new ChromeDriver();
	    
	    System.out.println("After get");
	    
	    driver.quit();
	    
	    System.out.println("After close");
	}
	
}

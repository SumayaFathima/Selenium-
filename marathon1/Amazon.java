package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Bags for boys");
		searchBox.sendKeys(Keys.ENTER);
		
		String result1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span")).getText();
		String result2 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[3]")).getText();
		System.out.println("Results count : " + result1 + " " + result2);
		
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//ul/span[@class='a-declarative']/span[1]/li//input[@type='checkbox']/following-sibling::i")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//ul/span[@class='a-declarative']/span[2]/li//input[@type='checkbox']/following-sibling::i")).click();
		
		WebElement sortDD = driver.findElement(By.id("s-result-sort-select"));
		Select sdd = new Select(sortDD);
		sdd.selectByVisibleText("Newest Arrivals");
		
		String bagName = driver.findElement(By.xpath("//div[@data-cy='title-recipe']//h2/a[@target='_blank']/span")).getText();
		System.out.println("First Bag name : " + bagName);
		
		String pageTitle = driver.getTitle();
		
		System.out.println("Page Title : " + pageTitle);
		driver.close();
	}
}
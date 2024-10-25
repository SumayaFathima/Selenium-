package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='date-show']//span[text()='Cinema']")).click();
		
		driver.findElement(By.xpath("//div[@id='cinema']/span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span")).click();
		
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[contains(text(),'Tomorrow')]")).click();
		
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li/span[text()='VENOM THE LAST DANCE']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[text()='Accept']")).click();
		
		driver.findElement(By.className("seat-current-pvr")).click();
		driver.findElement(By.className("register-btn")).click();
		
		String seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Seat Number : " + seatNumber);
		String grandTotal = driver.findElement(By.xpath("//div[@class='all-grand']//h6//span")).getText();
		System.out.println("Grand Total : " + grandTotal);
		
		driver.findElement(By.className("register-btn")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String pageTitle = driver.getTitle();		
		System.out.println("Page Title : " + pageTitle);
		driver.close();
	}
}
package project1;

java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class NewTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver_executable");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the provided URL
        driver.get("https://demoapps.qspiders.com/ui?scenario=1");

        // Find all web elements of the sidebar
        WebElement sidebar = driver.findElement(By.id("sidebar"));
        List<WebElement> sidebarElements = sidebar.findElements(By.tagName("a"));

        // Print the text of each sidebar element
        for (WebElement element : sidebarElements) {
            System.out.println(element.getText());
        }

        // Close the browser
        driver.quit();
    }
}

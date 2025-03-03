package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchSuggestions = By.xpath("//div[@class='s-suggestion-container']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchQuery(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }

    public void pressEnterToSearch() {
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }

    public List<WebElement> getSearchSuggestions() {
        return driver.findElements(searchSuggestions);
    }
}
